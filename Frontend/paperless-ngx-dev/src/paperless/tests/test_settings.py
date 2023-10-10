import datetime
import os
from unittest import TestCase
from unittest import mock

from celery.schedules import crontab

from paperless.settings import _parse_beat_schedule
from paperless.settings import _parse_db_settings
from paperless.settings import _parse_ignore_dates
from paperless.settings import _parse_redis_url
from paperless.settings import default_threads_per_worker


class TestIgnoreDateParsing(TestCase):
    """
    Tests the parsing of the PAPERLESS_IGNORE_DATES setting value
    """

    def _parse_checker(self, test_cases):
        """
        Helper function to check ignore date parsing

        Args:
            test_cases (_type_): _description_
        """
        for env_str, date_format, expected_date_set in test_cases:
            self.assertSetEqual(
                _parse_ignore_dates(env_str, date_format),
                expected_date_set,
            )

    def test_no_ignore_dates_set(self):
        """
        GIVEN:
            - No ignore dates are set
        THEN:
            - No ignore dates are parsed
        """
        self.assertSetEqual(_parse_ignore_dates(""), set())

    def test_single_ignore_dates_set(self):
        """
        GIVEN:
            - Ignore dates are set per certain inputs
        THEN:
            - All ignore dates are parsed
        """
        test_cases = [
            ("1985-05-01", "YMD", {datetime.date(1985, 5, 1)}),
            (
                "1985-05-01,1991-12-05",
                "YMD",
                {datetime.date(1985, 5, 1), datetime.date(1991, 12, 5)},
            ),
            ("2010-12-13", "YMD", {datetime.date(2010, 12, 13)}),
            ("11.01.10", "DMY", {datetime.date(2010, 1, 11)}),
            (
                "11.01.2001,15-06-1996",
                "DMY",
                {datetime.date(2001, 1, 11), datetime.date(1996, 6, 15)},
            ),
        ]

        self._parse_checker(test_cases)


class TestThreadCalculation(TestCase):
    def test_workers_threads(self):
        """
        GIVEN:
            - Certain CPU counts
        WHEN:
            - Threads per worker is calculated
        THEN:
            - Threads per worker less than or equal to CPU count
            - At least 1 thread per worker
        """
        default_workers = 1

        for i in range(1, 64):
            with mock.patch(
                "paperless.settings.multiprocessing.cpu_count",
            ) as cpu_count:
                cpu_count.return_value = i

                default_threads = default_threads_per_worker(default_workers)

                self.assertGreaterEqual(default_threads, 1)

                self.assertLessEqual(default_workers * default_threads, i)


class TestRedisSocketConversion(TestCase):
    def test_redis_socket_parsing(self):
        """
        GIVEN:
            - Various Redis connection URI formats
        WHEN:
            - The URI is parsed
        THEN:
            - Socket based URIs are translated
            - Non-socket URIs are unchanged
            - None provided uses default
        """

        for input, expected in [
            # Nothing is set
            (None, ("redis://localhost:6379", "redis://localhost:6379")),
            # celery style
            (
                "redis+socket:///run/redis/redis.sock",
                (
                    "redis+socket:///run/redis/redis.sock",
                    "unix:///run/redis/redis.sock",
                ),
            ),
            # redis-py / channels-redis style
            (
                "unix:///run/redis/redis.sock",
                (
                    "redis+socket:///run/redis/redis.sock",
                    "unix:///run/redis/redis.sock",
                ),
            ),
            # celery style with db
            (
                "redis+socket:///run/redis/redis.sock?virtual_host=5",
                (
                    "redis+socket:///run/redis/redis.sock?virtual_host=5",
                    "unix:///run/redis/redis.sock?db=5",
                ),
            ),
            # redis-py / channels-redis style with db
            (
                "unix:///run/redis/redis.sock?db=10",
                (
                    "redis+socket:///run/redis/redis.sock?virtual_host=10",
                    "unix:///run/redis/redis.sock?db=10",
                ),
            ),
            # Just a host with a port
            (
                "redis://myredishost:6379",
                ("redis://myredishost:6379", "redis://myredishost:6379"),
            ),
        ]:
            result = _parse_redis_url(input)
            self.assertTupleEqual(expected, result)


class TestCeleryScheduleParsing(TestCase):
    MAIL_EXPIRE_TIME = 9.0 * 60.0
    CLASSIFIER_EXPIRE_TIME = 59.0 * 60.0
    INDEX_EXPIRE_TIME = 23.0 * 60.0 * 60.0
    SANITY_EXPIRE_TIME = ((7.0 * 24.0) - 1.0) * 60.0 * 60.0

    def test_schedule_configuration_default(self):
        """
        GIVEN:
            - No configured task schedules
        WHEN:
            - The celery beat schedule is built
        THEN:
            - The default schedule is returned
        """
        schedule = _parse_beat_schedule()

        self.assertDictEqual(
            {
                "Check all e-mail accounts": {
                    "task": "paperless_mail.tasks.process_mail_accounts",
                    "schedule": crontab(minute="*/10"),
                    "options": {"expires": self.MAIL_EXPIRE_TIME},
                },
                "Train the classifier": {
                    "task": "documents.tasks.train_classifier",
                    "schedule": crontab(minute="5", hour="*/1"),
                    "options": {"expires": self.CLASSIFIER_EXPIRE_TIME},
                },
                "Optimize the index": {
                    "task": "documents.tasks.index_optimize",
                    "schedule": crontab(minute=0, hour=0),
                    "options": {"expires": self.INDEX_EXPIRE_TIME},
                },
                "Perform sanity check": {
                    "task": "documents.tasks.sanity_check",
                    "schedule": crontab(minute=30, hour=0, day_of_week="sun"),
                    "options": {"expires": self.SANITY_EXPIRE_TIME},
                },
            },
            schedule,
        )

    def test_schedule_configuration_changed(self):
        """
        GIVEN:
            - Email task is configured non-default
        WHEN:
            - The celery beat schedule is built
        THEN:
            - The email task is configured per environment
            - The default schedule is returned for other tasks
        """
        with mock.patch.dict(
            os.environ,
            {"PAPERLESS_EMAIL_TASK_CRON": "*/50 * * * mon"},
        ):
            schedule = _parse_beat_schedule()

        self.assertDictEqual(
            {
                "Check all e-mail accounts": {
                    "task": "paperless_mail.tasks.process_mail_accounts",
                    "schedule": crontab(minute="*/50", day_of_week="mon"),
                    "options": {"expires": self.MAIL_EXPIRE_TIME},
                },
                "Train the classifier": {
                    "task": "documents.tasks.train_classifier",
                    "schedule": crontab(minute="5", hour="*/1"),
                    "options": {"expires": self.CLASSIFIER_EXPIRE_TIME},
                },
                "Optimize the index": {
                    "task": "documents.tasks.index_optimize",
                    "schedule": crontab(minute=0, hour=0),
                    "options": {"expires": self.INDEX_EXPIRE_TIME},
                },
                "Perform sanity check": {
                    "task": "documents.tasks.sanity_check",
                    "schedule": crontab(minute=30, hour=0, day_of_week="sun"),
                    "options": {"expires": self.SANITY_EXPIRE_TIME},
                },
            },
            schedule,
        )

    def test_schedule_configuration_disabled(self):
        """
        GIVEN:
            - Search index task is disabled
        WHEN:
            - The celery beat schedule is built
        THEN:
            - The search index task is not present
            - The default schedule is returned for other tasks
        """
        with mock.patch.dict(os.environ, {"PAPERLESS_INDEX_TASK_CRON": "disable"}):
            schedule = _parse_beat_schedule()

        self.assertDictEqual(
            {
                "Check all e-mail accounts": {
                    "task": "paperless_mail.tasks.process_mail_accounts",
                    "schedule": crontab(minute="*/10"),
                    "options": {"expires": self.MAIL_EXPIRE_TIME},
                },
                "Train the classifier": {
                    "task": "documents.tasks.train_classifier",
                    "schedule": crontab(minute="5", hour="*/1"),
                    "options": {"expires": self.CLASSIFIER_EXPIRE_TIME},
                },
                "Perform sanity check": {
                    "task": "documents.tasks.sanity_check",
                    "schedule": crontab(minute=30, hour=0, day_of_week="sun"),
                    "options": {"expires": self.SANITY_EXPIRE_TIME},
                },
            },
            schedule,
        )

    def test_schedule_configuration_disabled_all(self):
        """
        GIVEN:
            - All tasks are disabled
        WHEN:
            - The celery beat schedule is built
        THEN:
            - No tasks are scheduled
        """
        with mock.patch.dict(
            os.environ,
            {
                "PAPERLESS_EMAIL_TASK_CRON": "disable",
                "PAPERLESS_TRAIN_TASK_CRON": "disable",
                "PAPERLESS_SANITY_TASK_CRON": "disable",
                "PAPERLESS_INDEX_TASK_CRON": "disable",
            },
        ):
            schedule = _parse_beat_schedule()

        self.assertDictEqual(
            {},
            schedule,
        )


class TestDBSettings(TestCase):
    def test_db_timeout_with_sqlite(self):
        """
        GIVEN:
            - PAPERLESS_DB_TIMEOUT is set
        WHEN:
            - Settings are parsed
        THEN:
            - PAPERLESS_DB_TIMEOUT set for sqlite
        """
        with mock.patch.dict(
            os.environ,
            {
                "PAPERLESS_DB_TIMEOUT": "10",
            },
        ):
            databases = _parse_db_settings()

            self.assertDictEqual(
                {
                    "timeout": 10.0,
                },
                databases["default"]["OPTIONS"],
            )

    def test_db_timeout_with_not_sqlite(self):
        """
        GIVEN:
            - PAPERLESS_DB_TIMEOUT is set but db is not sqlite
        WHEN:
            - Settings are parsed
        THEN:
            - PAPERLESS_DB_TIMEOUT set correctly in non-sqlite db & for fallback sqlite db
        """
        with mock.patch.dict(
            os.environ,
            {
                "PAPERLESS_DBHOST": "127.0.0.1",
                "PAPERLESS_DB_TIMEOUT": "10",
            },
        ):
            databases = _parse_db_settings()

            self.assertDictContainsSubset(
                {
                    "connect_timeout": 10.0,
                },
                databases["default"]["OPTIONS"],
            )
            self.assertDictEqual(
                {
                    "timeout": 10.0,
                },
                databases["sqlite"]["OPTIONS"],
            )

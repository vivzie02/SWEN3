from django.conf import settings as django_settings


def settings(request):
    return {
        "EMAIL_ENABLED": django_settings.EMAIL_HOST != "localhost"
        or django_settings.EMAIL_HOST_USER != "",
    }

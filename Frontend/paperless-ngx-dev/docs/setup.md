## Installation

You can go multiple routes to setup and run Paperless:

- [Use the easy install docker script](#docker_script)
- [Pull the image from Docker Hub](#docker_hub)
- [Build the Docker image yourself](#docker_build)
- [Install Paperless directly on your system manually (bare metal)](#bare_metal)

The Docker routes are quick & easy. These are the recommended routes.
This configures all the stuff from the above automatically so that it
just works and uses sensible defaults for all configuration options.
Here you find a cheat-sheet for docker beginners: [CLI
Basics](https://www.sehn.tech/refs/devops-with-docker/)

The bare metal route is complicated to setup but makes it easier should
you want to contribute some code back. You need to configure and run the
above mentioned components yourself.

### Docker using the Installation Script {#docker_script}

Paperless provides an interactive installation script. This script will
ask you for a couple configuration options, download and create the
necessary configuration files, pull the docker image, start paperless
and create your user account. This script essentially performs all the
steps described in [Docker setup](#docker_hub) automatically.

1.  Make sure that docker and docker-compose are installed.

2.  Download and run the installation script:

    ```shell-session
    $ bash -c "$(curl -L https://raw.githubusercontent.com/paperless-ngx/paperless-ngx/main/install-paperless-ngx.sh)"
    ```

    !!! note

        macOS users will need to install e.g. [gnu-sed](https://formulae.brew.sh/formula/gnu-sed) with support
        for running as `sed`.

### From GHCR / Docker Hub {#docker_hub}

1.  Login with your user and create a folder in your home-directory to have a place for your
    configuration files and consumption directory.

    ```shell-session
    $ mkdir -v ~/paperless-ngx
    ```

2.  Go to the [/docker/compose directory on the project
    page](https://github.com/paperless-ngx/paperless-ngx/tree/main/docker/compose)
    and download one of the `docker-compose.*.yml` files,
    depending on which database backend you want to use. Rename this
    file to `docker-compose.yml`. If you want to enable
    optional support for Office documents, download a file with
    `-tika` in the file name. Download the
    `docker-compose.env` file and the `.env` file as well and store them
    in the same directory.

    !!! tip

        For new installations, it is recommended to use PostgreSQL as the
        database backend.

3.  Install [Docker](https://www.docker.com/) and
    [docker-compose](https://docs.docker.com/compose/install/).

    !!! warning

        If you want to use the included `docker-compose.*.yml` file, you
        need to have at least Docker version **17.09.0** and docker-compose
        version **1.17.0**. To check do: `docker-compose -v` or `docker -v`

        See the [Docker installation guide](https://docs.docker.com/engine/install/) on how to install the current
        version of Docker for your operating system or Linux distribution of
        choice. To get the latest version of docker-compose, follow the
        [docker-compose installation guide](https://docs.docker.com/compose/install/linux/) if your package repository
        doesn't include it.

4.  Modify `docker-compose.yml` to your preferences. You may want to
    change the path to the consumption directory. Find the line that
    specifies where to mount the consumption directory:

    ```yaml
    - ./consume:/usr/src/paperless/consume
    ```

    Replace the part BEFORE the colon with a local directory of your
    choice:

    ```yaml
    - /home/jonaswinkler/paperless-inbox:/usr/src/paperless/consume
    ```

    Don't change the part after the colon or paperless wont find your
    documents.

    You may also need to change the default port that the webserver will
    use from the default (8000):

    ```yaml
    ports:
      - 8000:8000
    ```

    Replace the part BEFORE the colon with a port of your choice:

    ```yaml
    ports:
      - 8010:8000
    ```

    Don't change the part after the colon or edit other lines that
    refer to port 8000. Modifying the part before the colon will map
    requests on another port to the webserver running on the default
    port.

    **Rootless**

    If you want to run Paperless as a rootless container, you will need
    to do the following in your `docker-compose.yml`:

    - set the `user` running the container to map to the `paperless`
      user in the container. This value (`user_id` below), should be
      the same id that `USERMAP_UID` and `USERMAP_GID` are set to in
      the next step. See `USERMAP_UID` and `USERMAP_GID`
      [here](/configuration#docker).

    Your entry for Paperless should contain something like:

    > ```
    > webserver:
    >   image: ghcr.io/paperless-ngx/paperless-ngx:latest
    >   user: <user_id>
    > ```

5.  Modify `docker-compose.env`, following the comments in the file. The
    most important change is to set `USERMAP_UID` and `USERMAP_GID` to
    the uid and gid of your user on the host system. Use `id -u` and
    `id -g` to get these.

    This ensures that both the docker container and you on the host
    machine have write access to the consumption directory. If your UID
    and GID on the host system is 1000 (the default for the first normal
    user on most systems), it will work out of the box without any
    modifications. `id "username"` to check.

    !!! note

        You can copy any setting from the file `paperless.conf.example` and
        paste it here. Have a look at [configuration](/configuration) to see what's available.

    !!! note

        You can utilize Docker secrets for configuration settings by
        appending `_FILE` to configuration values. For example [`PAPERLESS_DBUSER`](/configuration#PAPERLESS_DBUSER)
        can be set using `PAPERLESS_DBUSER_FILE=/var/run/secrets/password.txt`.

    !!! warning

        Some file systems such as NFS network shares don't support file
        system notifications with `inotify`. When storing the consumption
        directory on such a file system, paperless will not pick up new
        files with the default configuration. You will need to use
        [`PAPERLESS_CONSUMER_POLLING`](/configuration#PAPERLESS_CONSUMER_POLLING), which will disable inotify. See
        [here](/configuration#polling).

6.  Run `docker-compose pull`. This will pull the image.

7.  To be able to login, you will need a super user. To create it,
    execute the following command:

    ```shell-session
    $ docker-compose run --rm webserver createsuperuser
    ```

    or using docker exec from within the container:

    ```shell-session
    $ python3 manage.py createsuperuser
    ```

    This will prompt you to set a username, an optional e-mail address
    and finally a password (at least 8 characters).

8.  Run `docker-compose up -d`. This will create and start the necessary containers.

9.  The default `docker-compose.yml` exports the webserver on your local
    port

    8000\. If you did not change this, you should now be able to visit
    your Paperless instance at `http://127.0.0.1:8000` or your servers
    IP-Address:8000. Use the login credentials you have created with the
    previous step.

### Build the Docker image yourself {#docker_build}

1.  Clone the entire repository of paperless:

    ```shell-session
    git clone https://github.com/paperless-ngx/paperless-ngx
    ```

    The main branch always reflects the latest stable version.

2.  Copy one of the `docker/compose/docker-compose.*.yml` to
    `docker-compose.yml` in the root folder, depending on which database
    backend you want to use. Copy `docker-compose.env` into the project
    root as well.

3.  In the `docker-compose.yml` file, find the line that instructs
    docker-compose to pull the paperless image from Docker Hub:

    ```yaml
    webserver:
      image: ghcr.io/paperless-ngx/paperless-ngx:latest
    ```

    and replace it with a line that instructs docker-compose to build
    the image from the current working directory instead:

    ```yaml
    webserver:
      build:
        context: .
        args:
          QPDF_VERSION: x.y.x
          PIKEPDF_VERSION: x.y.z
          PSYCOPG2_VERSION: x.y.z
          JBIG2ENC_VERSION: 0.29
    ```

    !!! note

        You should match the build argument versions to the version for the
        release you have checked out. These are pre-built images with
        certain, more updated software. If you want to build these images
        your self, that is possible, but beyond the scope of these steps.

4.  Follow steps 3 to 8 of [Docker Setup](#docker_hub). When asked to run
    `docker-compose pull` to pull the image, do

    ```shell-session
    $ docker-compose build
    ```

    instead to build the image.

### Bare Metal Route {#bare_metal}

Paperless runs on linux only. The following procedure has been tested on
a minimal installation of Debian/Buster, which is the current stable
release at the time of writing. Windows is not and will never be
supported.

1.  Install dependencies. Paperless requires the following packages.

    - `python3` - 3.9 - 3.11 are supported
    - `python3-pip`
    - `python3-dev`
    - `default-libmysqlclient-dev` for MariaDB
    - `pkg-config` for mysqlclient (python dependency)
    - `fonts-liberation` for generating thumbnails for plain text
      files
    - `imagemagick` >= 6 for PDF conversion
    - `gnupg` for handling encrypted documents
    - `libpq-dev` for PostgreSQL
    - `libmagic-dev` for mime type detection
    - `mariadb-client` for MariaDB compile time
    - `mime-support` for mime type detection
    - `libzbar0` for barcode detection
    - `poppler-utils` for barcode detection

    Use this list for your preferred package management:

    ```
    python3 python3-pip python3-dev imagemagick fonts-liberation gnupg libpq-dev default-libmysqlclient-dev pkg-config libmagic-dev mime-support libzbar0 poppler-utils
    ```

    These dependencies are required for OCRmyPDF, which is used for text
    recognition.

    - `unpaper`
    - `ghostscript`
    - `icc-profiles-free`
    - `qpdf`
    - `liblept5`
    - `libxml2`
    - `pngquant` (suggested for certain PDF image optimizations)
    - `zlib1g`
    - `tesseract-ocr` >= 4.0.0 for OCR
    - `tesseract-ocr` language packs (`tesseract-ocr-eng`,
      `tesseract-ocr-deu`, etc)

    Use this list for your preferred package management:

    ```
    unpaper ghostscript icc-profiles-free qpdf liblept5 libxml2 pngquant zlib1g tesseract-ocr
    ```

    On Raspberry Pi, these libraries are required as well:

    - `libatlas-base-dev`
    - `libxslt1-dev`

    You will also need `build-essential`, `python3-setuptools` and
    `python3-wheel` for installing some of the python dependencies.

2.  Install `redis` >= 6.0 and configure it to start automatically.

3.  Optional. Install `postgresql` and configure a database, user and
    password for paperless. If you do not wish to use PostgreSQL,
    MariaDB and SQLite are available as well.

    !!! note

        On bare-metal installations using SQLite, ensure the [JSON1
        extension](https://code.djangoproject.com/wiki/JSON1Extension) is
        enabled. This is usually the case, but not always.

4.  Create a system user with a new home folder under which you wish
    to run paperless.

    ```shell-session
    adduser paperless --system --home /opt/paperless --group
    ```

5.  Get the release archive from
    <https://github.com/paperless-ngx/paperless-ngx/releases> for example with

    ```shell-session
    curl -O -L https://github.com/paperless-ngx/paperless-ngx/releases/download/v1.10.2/paperless-ngx-v1.10.2.tar.xz
    ```

    Extract the archive with

    ```shell-session
    tar -xf paperless-ngx-v1.10.2.tar.xz
    ```

    and copy the contents to the
    home folder of the user you created before (`/opt/paperless`).

    Optional: If you cloned the git repo, you will have to
    compile the frontend yourself, see [here](/development#front-end-development)
    and use the `build` step, not `serve`.

6.  Configure paperless. See [configuration](/configuration) for details.
    Edit the included `paperless.conf` and adjust the settings to your
    needs. Required settings for getting
    paperless running are:

    - [`PAPERLESS_REDIS`](/configuration#PAPERLESS_REDIS) should point to your redis server, such as
      <redis://localhost:6379>.
    - [`PAPERLESS_DBENGINE`](/configuration#PAPERLESS_DBENGINE) optional, and should be one of `postgres`,
      `mariadb`, or `sqlite`
    - [`PAPERLESS_DBHOST`](/configuration#PAPERLESS_DBHOST) should be the hostname on which your
      PostgreSQL server is running. Do not configure this to use
      SQLite instead. Also configure port, database name, user and
      password as necessary.
    - [`PAPERLESS_CONSUMPTION_DIR`](/configuration#PAPERLESS_CONSUMPTION_DIR) should point to a folder which
      paperless should watch for documents. You might want to have
      this somewhere else. Likewise, [`PAPERLESS_DATA_DIR`](/configuration#PAPERLESS_DATA_DIR) and
      [`PAPERLESS_MEDIA_ROOT`](/configuration#PAPERLESS_MEDIA_ROOT) define where paperless stores its data.
      If you like, you can point both to the same directory.
    - [`PAPERLESS_SECRET_KEY`](/configuration#PAPERLESS_SECRET_KEY) should be a random sequence of
      characters. It's used for authentication. Failure to do so
      allows third parties to forge authentication credentials.
    - [`PAPERLESS_URL`](/configuration#PAPERLESS_URL) if you are behind a reverse proxy. This should
      point to your domain. Please see
      [configuration](/configuration) for more
      information.

    Many more adjustments can be made to paperless, especially the OCR
    part. The following options are recommended for everyone:

    - Set [`PAPERLESS_OCR_LANGUAGE`](/configuration#PAPERLESS_OCR_LANGUAGE) to the language most of your
      documents are written in.
    - Set [`PAPERLESS_TIME_ZONE`](/configuration#PAPERLESS_TIME_ZONE) to your local time zone.

    !!! warning

        Ensure your Redis instance [is secured](https://redis.io/docs/getting-started/#securing-redis).

7.  Create the following directories if they are missing:

    - `/opt/paperless/media`
    - `/opt/paperless/data`
    - `/opt/paperless/consume`

    Adjust as necessary if you configured different folders.
    Ensure that the paperless user has write permissions for every one
    of these folders with

    ```shell-session
    ls -l -d /opt/paperless/media
    ```

    If needed, change the owner with

    ```shell-session
    sudo chown paperless:paperless /opt/paperless/media
    sudo chown paperless:paperless /opt/paperless/data
    sudo chown paperless:paperless /opt/paperless/consume
    ```

8.  Install python requirements from the `requirements.txt` file. It is
    up to you if you wish to use a virtual environment or not. First you should update your pip, so it gets the actual packages.

    ```shell-session
    sudo -Hu paperless pip3 install -r requirements.txt
    ```

    This will install all python dependencies in the home directory of
    the new paperless user.

9.  Go to `/opt/paperless/src`, and execute the following commands:

    ```bash
    # This creates the database schema.
    sudo -Hu paperless python3 manage.py migrate

    # This creates your first paperless user
    sudo -Hu paperless python3 manage.py createsuperuser
    ```

10. Optional: Test that paperless is working by executing

    ```bash
    # Manually starts the webserver
    sudo -Hu paperless python3 manage.py runserver
    ```

    and pointing your browser to http://localhost:8000 if
    accessing from the same devices on which paperless is installed.
    If accessing from another machine, set up systemd services. You may need
    to set `PAPERLESS_DEBUG=true` in order for the development server to work
    normally in your browser.

    !!! warning

        This is a development server which should not be used in production.
        It is not audited for security and performance is inferior to
        production ready web servers.

    !!! tip

        This will not start the consumer. Paperless does this in a separate
        process.

11. Setup systemd services to run paperless automatically. You may use
    the service definition files included in the `scripts` folder as a
    starting point.

    Paperless needs the `webserver` script to run the webserver, the
    `consumer` script to watch the input folder, `taskqueue` for the
    background workers used to handle things like document consumption
    and the `scheduler` script to run tasks such as email checking at
    certain times .

    !!! note

        The `socket` script enables `gunicorn` to run on port 80 without
        root privileges. For this you need to uncomment the
        `Require=paperless-webserver.socket` in the `webserver` script
        and configure `gunicorn` to listen on port 80 (see
        `paperless/gunicorn.conf.py`).

    You may need to adjust the path to the `gunicorn` executable. This
    will be installed as part of the python dependencies, and is either
    located in the `bin` folder of your virtual environment, or in
    `~/.local/bin/` if no virtual environment is used.

    These services rely on redis and optionally the database server, but
    don't need to be started in any particular order. The example files
    depend on redis being started. If you use a database server, you
    should add additional dependencies.

    !!! warning

        The included scripts run a `gunicorn` standalone server, which is
        fine for running paperless. It does support SSL, however, the
        documentation of GUnicorn states that you should use a proxy server
        in front of gunicorn instead.

        For instructions on how to use nginx for that,
        [see the wiki](https://github.com/paperless-ngx/paperless-ngx/wiki/Using-a-Reverse-Proxy-with-Paperless-ngx#nginx).

    !!! warning

        If celery won't start (check with
        `sudo systemctl status paperless-task-queue.service` for
        paperless-task-queue.service and paperless-scheduler.service
        ) you need to change the path in the files. Example:
        `ExecStart=/opt/paperless/.local/bin/celery --app paperless worker --loglevel INFO`

12. Optional: Install a samba server and make the consumption folder
    available as a network share.

13. Configure ImageMagick to allow processing of PDF documents. Most
    distributions have this disabled by default, since PDF documents can
    contain malware. If you don't do this, paperless will fall back to
    ghostscript for certain steps such as thumbnail generation.

    Edit `/etc/ImageMagick-6/policy.xml` and adjust

    ```
    <policy domain="coder" rights="none" pattern="PDF" />
    ```

    to

    ```
    <policy domain="coder" rights="read|write" pattern="PDF" />
    ```

14. Optional: Install the
    [jbig2enc](https://ocrmypdf.readthedocs.io/en/latest/jbig2.html)
    encoder. This will reduce the size of generated PDF documents.
    You'll most likely need to compile this by yourself, because this
    software has been patented until around 2017 and binary packages are
    not available for most distributions.

15. Optional: If using the NLTK machine learning processing (see
    [`PAPERLESS_ENABLE_NLTK`](/configuration#PAPERLESS_ENABLE_NLTK) for details),
    download the NLTK data for the Snowball
    Stemmer, Stopwords and Punkt tokenizer to your
    `PAPERLESS_DATA_DIR/nltk`. Refer to the [NLTK
    instructions](https://www.nltk.org/data.html) for details on how to
    download the data.

# Migrating to Paperless-ngx

Migration is possible both from Paperless-ng or directly from the
'original' Paperless.

## Migrating from Paperless-ng

Paperless-ngx is meant to be a drop-in replacement for Paperless-ng and
thus upgrading should be trivial for most users, especially when using
docker. However, as with any major change, it is recommended to take a
full backup first. Once you are ready, simply change the docker image to
point to the new source. E.g. if using Docker Compose, edit
`docker-compose.yml` and change:

```
image: jonaswinkler/paperless-ng:latest
```

to

```
image: ghcr.io/paperless-ngx/paperless-ngx:latest
```

and then run `docker-compose up -d` which will pull the new image
recreate the container. That's it!

Users who installed with the bare-metal route should also update their
Git clone to point to `https://github.com/paperless-ngx/paperless-ngx`,
e.g. using the command
`git remote set-url origin https://github.com/paperless-ngx/paperless-ngx`
and then pull the latest version.

## Migrating from Paperless

At its core, paperless-ngx is still paperless and fully compatible.
However, some things have changed under the hood, so you need to adapt
your setup depending on how you installed paperless.

This setup describes how to update an existing paperless Docker
installation. The important things to keep in mind are as follows:

- Read the [changelog](/changelog) and
  take note of breaking changes.
- You should decide if you want to stick with SQLite or want to
  migrate your database to PostgreSQL. See [documentation](#sqlite_to_psql)
  for details on
  how to move your data from SQLite to PostgreSQL. Both work fine with
  paperless. However, if you already have a database server running
  for other services, you might as well use it for paperless as well.
- The task scheduler of paperless, which is used to execute periodic
  tasks such as email checking and maintenance, requires a
  [redis](https://redis.io/) message broker instance. The
  docker-compose route takes care of that.
- The layout of the folder structure for your documents and data
  remains the same, so you can just plug your old docker volumes into
  paperless-ngx and expect it to find everything where it should be.

Migration to paperless-ngx is then performed in a few simple steps:

1.  Stop paperless.

    ```bash
    $ cd /path/to/current/paperless
    $ docker-compose down
    ```

2.  Do a backup for two purposes: If something goes wrong, you still
    have your data. Second, if you don't like paperless-ngx, you can
    switch back to paperless.

3.  Download the latest release of paperless-ngx. You can either go with
    the docker-compose files from
    [here](https://github.com/paperless-ngx/paperless-ngx/tree/main/docker/compose)
    or clone the repository to build the image yourself (see
    [above](#docker_build)). You can
    either replace your current paperless folder or put paperless-ngx in
    a different location.

    !!! warning

        Paperless-ngx includes a `.env` file. This will set the project name
        for docker compose to `paperless`, which will also define the name
        of the volumes by paperless-ngx. However, if you experience that
        paperless-ngx is not using your old paperless volumes, verify the
        names of your volumes with

        ``` shell-session
        $ docker volume ls | grep _data
        ```

        and adjust the project name in the `.env` file so that it matches
        the name of the volumes before the `_data` part.

4.  Download the `docker-compose.sqlite.yml` file to
    `docker-compose.yml`. If you want to switch to PostgreSQL, do that
    after you migrated your existing SQLite database.

5.  Adjust `docker-compose.yml` and `docker-compose.env` to your needs.
    See [Docker setup](#docker_hub) details on
    which edits are advised.

6.  [Update paperless.](/administration#updating)

7.  In order to find your existing documents with the new search
    feature, you need to invoke a one-time operation that will create
    the search index:

    ```shell-session
    $ docker-compose run --rm webserver document_index reindex
    ```

    This will migrate your database and create the search index. After
    that, paperless will take care of maintaining the index by itself.

8.  Start paperless-ngx.

    ```bash
    $ docker-compose up -d
    ```

    This will run paperless in the background and automatically start it
    on system boot.

9.  Paperless installed a permanent redirect to `admin/` in your
    browser. This redirect is still in place and prevents access to the
    new UI. Clear your browsing cache in order to fix this.

10. Optionally, follow the instructions below to migrate your existing
    data to PostgreSQL.

## Migrating from LinuxServer.io Docker Image

As with any upgrades and large changes, it is highly recommended to
create a backup before starting. This assumes the image was running
using Docker Compose, but the instructions are translatable to Docker
commands as well.

1.  Stop and remove the paperless container
2.  If using an external database, stop the container
3.  Update Redis configuration
    a) If `REDIS_URL` is already set, change it to [`PAPERLESS_REDIS`](/configuration#PAPERLESS_REDIS)
    and continue to step 4.
    b) Otherwise, in the `docker-compose.yml` add a new service for
    Redis, following [the example compose
    files](https://github.com/paperless-ngx/paperless-ngx/tree/main/docker/compose)
    c) Set the environment variable [`PAPERLESS_REDIS`](/configuration#PAPERLESS_REDIS) so it points to
    the new Redis container
4.  Update user mapping
    a) If set, change the environment variable `PUID` to `USERMAP_UID`
    b) If set, change the environment variable `PGID` to `USERMAP_GID`
5.  Update configuration paths
    a) Set the environment variable [`PAPERLESS_DATA_DIR`](/configuration#PAPERLESS_DATA_DIR) to `/config`
6.  Update media paths
    a) Set the environment variable [`PAPERLESS_MEDIA_ROOT`](/configuration#PAPERLESS_MEDIA_ROOT) to
    `/data/media`
7.  Update timezone
    a) Set the environment variable [`PAPERLESS_TIME_ZONE`](/configuration#PAPERLESS_TIME_ZONE) to the same
    value as `TZ`
8.  Modify the `image:` to point to
    `ghcr.io/paperless-ngx/paperless-ngx:latest` or a specific version
    if preferred.
9.  Start the containers as before, using `docker-compose`.

## Moving data from SQLite to PostgreSQL or MySQL/MariaDB {#sqlite_to_psql}

Moving your data from SQLite to PostgreSQL or MySQL/MariaDB is done via
executing a series of django management commands as below. The commands
below use PostgreSQL, but are applicable to MySQL/MariaDB with the

!!! warning

    Make sure that your SQLite database is migrated to the latest version.
    Starting paperless will make sure that this is the case. If your try to
    load data from an old database schema in SQLite into a newer database
    schema in PostgreSQL, you will run into trouble.

!!! warning

    On some database fields, PostgreSQL enforces predefined limits on
    maximum length, whereas SQLite does not. The fields in question are the
    title of documents (128 characters), names of document types, tags and
    correspondents (128 characters), and filenames (1024 characters). If you
    have data in these fields that surpasses these limits, migration to
    PostgreSQL is not possible and will fail with an error.

!!! warning

    MySQL is case insensitive by default, treating values like "Name" and
    "NAME" as identical. See [MySQL caveats](/advanced_usage#mysql-caveats) for details.

!!! warning

    MySQL also enforces limits on maximum lengths, but does so differently than
    PostgreSQL.  It may not be possible to migrate to MySQL due to this.

!!! warning

    Using mariadb version 10.4+ is recommended. Using the `utf8mb3` character set on
    an older system may fix issues that can arise while setting up Paperless-ngx but
    `utf8mb3` can cause issues with consumption (where `utf8mb4` does not).

1.  Stop paperless, if it is running.

2.  Tell paperless to use PostgreSQL:

    a) With docker, copy the provided `docker-compose.postgres.yml`
    file to `docker-compose.yml`. Remember to adjust the consumption
    directory, if necessary.
    b) Without docker, configure the database in your `paperless.conf`
    file. See [configuration](/configuration) for
    details.

3.  Open a shell and initialize the database:

    a) With docker, run the following command to open a shell within
    the paperless container:

        ``` shell-session
        $ cd /path/to/paperless
        $ docker-compose run --rm webserver /bin/bash
        ```

        This will launch the container and initialize the PostgreSQL
        database.

    b) Without docker, remember to activate any virtual environment,
    switch to the `src` directory and create the database schema:

        ``` shell-session
        $ cd /path/to/paperless/src
        $ python3 manage.py migrate
        ```

        This will not copy any data yet.

4.  Dump your data from SQLite:

    ```shell-session
    $ python3 manage.py dumpdata --database=sqlite --exclude=contenttypes --exclude=auth.Permission > data.json
    ```

5.  Load your data into PostgreSQL:

    ```shell-session
    $ python3 manage.py loaddata data.json
    ```

6.  If operating inside Docker, you may exit the shell now.

    ```shell-session
    $ exit
    ```

7.  Start paperless.

## Moving back to Paperless

Lets say you migrated to Paperless-ngx and used it for a while, but
decided that you don't like it and want to move back (If you do, send
me a mail about what part you didn't like!), you can totally do that
with a few simple steps.

Paperless-ngx modified the database schema slightly, however, these
changes can be reverted while keeping your current data, so that your
current data will be compatible with original Paperless. Thumbnails
were also changed from PNG to WEBP format and will need to be
re-generated.

Execute this:

```shell-session
$ cd /path/to/paperless
$ docker-compose run --rm webserver migrate documents 0023
```

Or without docker:

```shell-session
$ cd /path/to/paperless/src
$ python3 manage.py migrate documents 0023
```

After regenerating thumbnails, you'll need to clear your cookies
(Paperless-ngx comes with updated dependencies that do cookie-processing
differently) and probably your cache as well.

# Considerations for less powerful devices {#less-powerful-devices}

Paperless runs on Raspberry Pi. However, some things are rather slow on
the Pi and configuring some options in paperless can help improve
performance immensely:

- Stick with SQLite to save some resources.
- Consider setting [`PAPERLESS_OCR_PAGES`](/configuration#PAPERLESS_OCR_PAGES) to 1, so that paperless will
  only OCR the first page of your documents. In most cases, this page
  contains enough information to be able to find it.
- [`PAPERLESS_TASK_WORKERS`](/configuration#PAPERLESS_TASK_WORKERS) and [`PAPERLESS_THREADS_PER_WORKER`](/configuration#PAPERLESS_THREADS_PER_WORKER) are
  configured to use all cores. The Raspberry Pi models 3 and up have 4
  cores, meaning that paperless will use 2 workers and 2 threads per
  worker. This may result in sluggish response times during
  consumption, so you might want to lower these settings (example: 2
  workers and 1 thread to always have some computing power left for
  other tasks).
- Keep [`PAPERLESS_OCR_MODE`](/configuration#PAPERLESS_OCR_MODE) at its default value `skip` and consider
  OCR'ing your documents before feeding them into paperless. Some
  scanners are able to do this!
- Set [`PAPERLESS_OCR_SKIP_ARCHIVE_FILE`](/configuration#PAPERLESS_OCR_SKIP_ARCHIVE_FILE) to `with_text` to skip archive
  file generation for already ocr'ed documents, or `always` to skip it
  for all documents.
- If you want to perform OCR on the device, consider using
  `PAPERLESS_OCR_CLEAN=none`. This will speed up OCR times and use
  less memory at the expense of slightly worse OCR results.
- If using docker, consider setting [`PAPERLESS_WEBSERVER_WORKERS`](/configuration#PAPERLESS_WEBSERVER_WORKERS) to 1. This will save some memory.
- Consider setting [`PAPERLESS_ENABLE_NLTK`](/configuration#PAPERLESS_ENABLE_NLTK) to false, to disable the
  more advanced language processing, which can take more memory and
  processing time.

For details, refer to [configuration](/configuration).

!!! note

    Updating the
    [automatic matching algorithm](/advanced_usage#automatic-matching) takes quite a bit of time. However, the update mechanism
    checks if your data has changed before doing the heavy lifting. If you
    experience the algorithm taking too much cpu time, consider changing the
    schedule in the admin interface to daily. You can also manually invoke
    the task by changing the date and time of the next run to today/now.

    The actual matching of the algorithm is fast and works on Raspberry Pi
    as well as on any other device.

# Using nginx as a reverse proxy {#nginx}

Please see [the wiki](https://github.com/paperless-ngx/paperless-ngx/wiki/Using-a-Reverse-Proxy-with-Paperless-ngx#nginx) for user-maintained documentation of using nginx with Paperless-ngx.

# Enhancing security {#security}

Please see [the wiki](https://github.com/paperless-ngx/paperless-ngx/wiki/Using-Security-Tools-with-Paperless-ngx) for user-maintained documentation of how to configure security tools like Fail2ban with Paperless-ngx.

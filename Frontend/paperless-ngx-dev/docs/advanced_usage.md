# Advanced Topics

Paperless offers a couple of features that automate certain tasks and make
your life easier.

## Matching tags, correspondents, document types, and storage paths {#matching}

Paperless will compare the matching algorithms defined by every tag,
correspondent, document type, and storage path in your database to see
if they apply to the text in a document. In other words, if you define a
tag called `Home Utility` that had a `match` property of `bc hydro` and
a `matching_algorithm` of `Exact`, Paperless will automatically tag
your newly-consumed document with your `Home Utility` tag so long as the
text `bc hydro` appears in the body of the document somewhere.

The matching logic is quite powerful. It supports searching the text of
your document with different algorithms, and as such, some
experimentation may be necessary to get things right.

In order to have a tag, correspondent, document type, or storage path
assigned automatically to newly consumed documents, assign a match and
matching algorithm using the web interface. These settings define when
to assign tags, correspondents, document types, and storage paths to
documents.

The following algorithms are available:

- **None:** No matching will be performed.
- **Any:** Looks for any occurrence of any word provided in match in
  the PDF. If you define the match as `Bank1 Bank2`, it will match
  documents containing either of these terms.
- **All:** Requires that every word provided appears in the PDF,
  albeit not in the order provided.
- **Exact:** Matches only if the match appears exactly as provided
  (i.e. preserve ordering) in the PDF.
- **Regular expression:** Parses the match as a regular expression and
  tries to find a match within the document.
- **Fuzzy match:** Uses a partial matching based on locating the tag text
  inside the document, using a [partial ratio](https://maxbachmann.github.io/RapidFuzz/Usage/fuzz.html#partial-ratio)
- **Auto:** Tries to automatically match new documents. This does not
  require you to set a match. See the [notes below](#automatic-matching).

When using the _any_ or _all_ matching algorithms, you can search for
terms that consist of multiple words by enclosing them in double quotes.
For example, defining a match text of `"Bank of America" BofA` using the
_any_ algorithm, will match documents that contain either "Bank of
America" or "BofA", but will not match documents containing "Bank of
South America".

Then just save your tag, correspondent, document type, or storage path
and run another document through the consumer. Once complete, you should
see the newly-created document, automatically tagged with the
appropriate data.

### Automatic matching {#automatic-matching}

Paperless-ngx comes with a new matching algorithm called _Auto_. This
matching algorithm tries to assign tags, correspondents, document types,
and storage paths to your documents based on how you have already
assigned these on existing documents. It uses a neural network under the
hood.

If, for example, all your bank statements of your account 123 at the
Bank of America are tagged with the tag "bofa123" and the matching
algorithm of this tag is set to _Auto_, this neural network will examine
your documents and automatically learn when to assign this tag.

Paperless tries to hide much of the involved complexity with this
approach. However, there are a couple caveats you need to keep in mind
when using this feature:

- Changes to your documents are not immediately reflected by the
  matching algorithm. The neural network needs to be _trained_ on your
  documents after changes. Paperless periodically (default: once each
  hour) checks for changes and does this automatically for you.
- The Auto matching algorithm only takes documents into account which
  are NOT placed in your inbox (i.e. have any inbox tags assigned to
  them). This ensures that the neural network only learns from
  documents which you have correctly tagged before.
- The matching algorithm can only work if there is a correlation
  between the tag, correspondent, document type, or storage path and
  the document itself. Your bank statements usually contain your bank
  account number and the name of the bank, so this works reasonably
  well, However, tags such as "TODO" cannot be automatically
  assigned.
- The matching algorithm needs a reasonable number of documents to
  identify when to assign tags, correspondents, storage paths, and
  types. If one out of a thousand documents has the correspondent
  "Very obscure web shop I bought something five years ago", it will
  probably not assign this correspondent automatically if you buy
  something from them again. The more documents, the better.
- Paperless also needs a reasonable amount of negative examples to
  decide when not to assign a certain tag, correspondent, document
  type, or storage path. This will usually be the case as you start
  filling up paperless with documents. Example: If all your documents
  are either from "Webshop" or "Bank", paperless will assign one
  of these correspondents to ANY new document, if both are set to
  automatic matching.

## Hooking into the consumption process {#consume-hooks}

Sometimes you may want to do something arbitrary whenever a document is
consumed. Rather than try to predict what you may want to do, Paperless
lets you execute scripts of your own choosing just before or after a
document is consumed using a couple of simple hooks.

Just write a script, put it somewhere that Paperless can read & execute,
and then put the path to that script in `paperless.conf` or
`docker-compose.env` with the variable name of either
[`PAPERLESS_PRE_CONSUME_SCRIPT`](/configuration#PAPERLESS_PRE_CONSUME_SCRIPT) or [`PAPERLESS_POST_CONSUME_SCRIPT`](/configuration#PAPERLESS_POST_CONSUME_SCRIPT).

!!! info

    These scripts are executed in a **blocking** process, which means that
    if a script takes a long time to run, it can significantly slow down
    your document consumption flow. If you want things to run
    asynchronously, you'll have to fork the process in your script and
    exit.

### Pre-consumption script {#pre-consume-script}

Executed after the consumer sees a new document in the consumption
folder, but before any processing of the document is performed. This
script can access the following relevant environment variables set:

| Environment Variable    | Description                                                  |
| ----------------------- | ------------------------------------------------------------ |
| `DOCUMENT_SOURCE_PATH`  | Original path of the consumed document                       |
| `DOCUMENT_WORKING_PATH` | Path to a copy of the original that consumption will work on |
| `TASK_ID`               | UUID of the task used to process the new document (if any)   |

!!! note

    Pre-consume scripts which modify the document should only change
    the `DOCUMENT_WORKING_PATH` file or a second consume task may
    be triggered, leading to failures as two tasks work on the
    same document path

A simple but common example for this would be creating a simple script
like this:

`/usr/local/bin/ocr-pdf`

```bash
#!/usr/bin/env bash
pdf2pdfocr.py -i ${DOCUMENT_WORKING_PATH}
```

`/etc/paperless.conf`

```bash
...
PAPERLESS_PRE_CONSUME_SCRIPT="/usr/local/bin/ocr-pdf"
...
```

This will pass the path to the document about to be consumed to
`/usr/local/bin/ocr-pdf`, which will in turn call
[pdf2pdfocr.py](https://github.com/LeoFCardoso/pdf2pdfocr) on your
document, which will then overwrite the file with an OCR'd version of
the file and exit. At which point, the consumption process will begin
with the newly modified file.

The script's stdout and stderr will be logged line by line to the
webserver log, along with the exit code of the script.

### Post-consumption script {#post-consume-script}

Executed after the consumer has successfully processed a document and
has moved it into paperless. It receives the following environment
variables:

| Environment Variable         | Description                                    |
| ---------------------------- | ---------------------------------------------- |
| `DOCUMENT_ID`                | Database primary key of the document           |
| `DOCUMENT_FILE_NAME`         | Formatted filename, not including paths        |
| `DOCUMENT_CREATED`           | Date & time when document created              |
| `DOCUMENT_MODIFIED`          | Date & time when document was last modified    |
| `DOCUMENT_ADDED`             | Date & time when document was added            |
| `DOCUMENT_SOURCE_PATH`       | Path to the original document file             |
| `DOCUMENT_ARCHIVE_PATH`      | Path to the generate archive file (if any)     |
| `DOCUMENT_THUMBNAIL_PATH`    | Path to the generated thumbnail                |
| `DOCUMENT_DOWNLOAD_URL`      | URL for document download                      |
| `DOCUMENT_THUMBNAIL_URL`     | URL for the document thumbnail                 |
| `DOCUMENT_CORRESPONDENT`     | Assigned correspondent (if any)                |
| `DOCUMENT_TAGS`              | Comma separated list of tags applied (if any)  |
| `DOCUMENT_ORIGINAL_FILENAME` | Filename of original document                  |
| `TASK_ID`                    | Task UUID used to import the document (if any) |

The script can be in any language, A simple shell script example:

```bash title="post-consumption-example"
--8<-- "./scripts/post-consumption-example.sh"
```

!!! note

    The post consumption script cannot cancel the consumption process.

!!! warning

    The post consumption script should not modify the document files
    directly.

The script's stdout and stderr will be logged line by line to the
webserver log, along with the exit code of the script.

### Docker {#docker-consume-hooks}

To hook into the consumption process when using Docker, you
will need to pass the scripts into the container via a host mount
in your `docker-compose.yml`.

Assuming you have
`/home/paperless-ngx/scripts/post-consumption-example.sh` as a
script which you'd like to run.

You can pass that script into the consumer container via a host mount:

```yaml
...
webserver:
  ...
  volumes:
    ...
    - /home/paperless-ngx/scripts:/path/in/container/scripts/ # (1)!
  environment: # (3)!
    ...
    PAPERLESS_POST_CONSUME_SCRIPT: /path/in/container/scripts/post-consumption-example.sh # (2)!
...
```

1. The external scripts directory is mounted to a location inside the container.
2. The internal location of the script is used to set the script to run
3. This can also be set in `docker-compose.env`

Troubleshooting:

- Monitor the docker-compose log
  `cd ~/paperless-ngx; docker-compose logs -f`
- Check your script's permission e.g. in case of permission error
  `sudo chmod 755 post-consumption-example.sh`
- Pipe your scripts's output to a log file e.g.
  `echo "${DOCUMENT_ID}" | tee --append /usr/src/paperless/scripts/post-consumption-example.log`

## File name handling {#file-name-handling}

By default, paperless stores your documents in the media directory and
renames them using the identifier which it has assigned to each
document. You will end up getting files like `0000123.pdf` in your media
directory. This isn't necessarily a bad thing, because you normally
don't have to access these files manually. However, if you wish to name
your files differently, you can do that by adjusting the
[`PAPERLESS_FILENAME_FORMAT`](/configuration#PAPERLESS_FILENAME_FORMAT) configuration option. Paperless adds the
correct file extension e.g. `.pdf`, `.jpg` automatically.

This variable allows you to configure the filename (folders are allowed)
using placeholders. For example, configuring this to

```bash
PAPERLESS_FILENAME_FORMAT={created_year}/{correspondent}/{title}
```

will create a directory structure as follows:

```
2019/
  My bank/
    Statement January.pdf
    Statement February.pdf
2020/
  My bank/
    Statement January.pdf
    Letter.pdf
    Letter_01.pdf
  Shoe store/
    My new shoes.pdf
```

!!! warning

    Do not manually move your files in the media folder. Paperless remembers
    the last filename a document was stored as. If you do rename a file,
    paperless will report your files as missing and won't be able to find
    them.

Paperless provides the following placeholders within filenames:

- `{asn}`: The archive serial number of the document, or "none".
- `{correspondent}`: The name of the correspondent, or "none".
- `{document_type}`: The name of the document type, or "none".
- `{tag_list}`: A comma separated list of all tags assigned to the
  document.
- `{title}`: The title of the document.
- `{created}`: The full date (ISO format) the document was created.
- `{created_year}`: Year created only, formatted as the year with
  century.
- `{created_year_short}`: Year created only, formatted as the year
  without century, zero padded.
- `{created_month}`: Month created only (number 01-12).
- `{created_month_name}`: Month created name, as per locale
- `{created_month_name_short}`: Month created abbreviated name, as per
  locale
- `{created_day}`: Day created only (number 01-31).
- `{added}`: The full date (ISO format) the document was added to
  paperless.
- `{added_year}`: Year added only.
- `{added_year_short}`: Year added only, formatted as the year without
  century, zero padded.
- `{added_month}`: Month added only (number 01-12).
- `{added_month_name}`: Month added name, as per locale
- `{added_month_name_short}`: Month added abbreviated name, as per
  locale
- `{added_day}`: Day added only (number 01-31).
- `{owner_username}`: Username of document owner, if any, or "none"
- `{original_name}`: Document original filename, minus the extension, if any, or "none"
- `{doc_pk}`: The paperless identifier (primary key) for the document.

Paperless will try to conserve the information from your database as
much as possible. However, some characters that you can use in document
titles and correspondent names (such as `: \ /` and a couple more) are
not allowed in filenames and will be replaced with dashes.

If paperless detects that two documents share the same filename,
paperless will automatically append `_01`, `_02`, etc to the filename.
This happens if all the placeholders in a filename evaluate to the same
value.

!!! tip

    You can affect how empty placeholders are treated by changing the
    following setting to `true`.

    ```
    PAPERLESS_FILENAME_FORMAT_REMOVE_NONE=True
    ```

    Doing this results in all empty placeholders resolving to "" instead
    of "none" as stated above. Spaces before empty placeholders are
    removed as well, empty directories are omitted.

!!! tip

    Paperless checks the filename of a document whenever it is saved.
    Therefore, you need to update the filenames of your documents and move
    them after altering this setting by invoking the
    [`document renamer`](/administration#renamer).

!!! warning

    Make absolutely sure you get the spelling of the placeholders right, or
    else paperless will use the default naming scheme instead.

!!! caution

    As of now, you could totally tell paperless to store your files anywhere
    outside the media directory by setting

    ```
    PAPERLESS_FILENAME_FORMAT=../../my/custom/location/{title}
    ```

    However, keep in mind that inside docker, if files get stored outside of
    the predefined volumes, they will be lost after a restart of paperless.

!!! warning

    When file naming handling, in particular when using `{tag_list}`,
    you may run into the limits of your operating system's maximum
    path lengths.  Files will retain the previous path instead and
    the issue logged.

## Storage paths

One of the best things in Paperless is that you can not only access the
documents via the web interface, but also via the file system.

When a single storage layout is not sufficient for your use case,
storage paths come to the rescue. Storage paths allow you to configure
more precisely where each document is stored in the file system.

- Each storage path is a [`PAPERLESS_FILENAME_FORMAT`](/configuration#PAPERLESS_FILENAME_FORMAT) and
  follows the rules described above
- Each document is assigned a storage path using the matching
  algorithms described above, but can be overwritten at any time

For example, you could define the following two storage paths:

1.  Normal communications are put into a folder structure sorted by
    `year/correspondent`
2.  Communications with insurance companies are stored in a flat
    structure with longer file names, but containing the full date of
    the correspondence.

```
By Year = {created_year}/{correspondent}/{title}
Insurances = Insurances/{correspondent}/{created_year}-{created_month}-{created_day} {title}
```

If you then map these storage paths to the documents, you might get the
following result. For simplicity, `By Year` defines the same
structure as in the previous example above.

```text
2019/                                   # By Year
   My bank/
     Statement January.pdf
     Statement February.pdf

Insurances/                             # Insurances
   Healthcare 123/
     2022-01-01 Statement January.pdf
     2022-02-02 Letter.pdf
     2022-02-03 Letter.pdf
   Dental 456/
     2021-12-01 New Conditions.pdf
```

!!! tip

    Defining a storage path is optional. If no storage path is defined for a
    document, the global [`PAPERLESS_FILENAME_FORMAT`](/configuration#PAPERLESS_FILENAME_FORMAT) is applied.

## Celery Monitoring {#celery-monitoring}

The monitoring tool
[Flower](https://flower.readthedocs.io/en/latest/index.html) can be used
to view more detailed information about the health of the celery workers
used for asynchronous tasks. This includes details on currently running,
queued and completed tasks, timing and more. Flower can also be used
with Prometheus, as it exports metrics. For details on its capabilities,
refer to the Flower documentation.

To configure Flower further, create a `flowerconfig.py` and
place it into the `src/paperless` directory. For a Docker
installation, you can use volumes to accomplish this:

```yaml
services:
  # ...
  webserver:
    ports:
      - 5555:5555 # (2)!
    # ...
    volumes:
      - /path/to/my/flowerconfig.py:/usr/src/paperless/src/paperless/flowerconfig.py:ro # (1)!
```

1. Note the `:ro` tag means the file will be mounted as read only.
2. `flower` runs by default on port 5555, but this can be configured

## Custom Container Initialization

The Docker image includes the ability to run custom user scripts during
startup. This could be utilized for installing additional tools or
Python packages, for example. Scripts are expected to be shell scripts.

To utilize this, mount a folder containing your scripts to the custom
initialization directory, `/custom-cont-init.d` and place
scripts you wish to run inside. For security, the folder must be owned
by `root` and should have permissions of `a=rx`. Additionally, scripts
must only be writable by `root`.

Your scripts will be run directly before the webserver completes
startup. Scripts will be run by the `root` user.
If you would like to switch users, the utility `gosu` is available and
preferred over `sudo`.

This is an advanced functionality with which you could break functionality
or lose data. If you experience issues, please disable any custom scripts
and try again before reporting an issue.

For example, using Docker Compose:

```yaml
services:
  # ...
  webserver:
    # ...
    volumes:
      - /path/to/my/scripts:/custom-cont-init.d:ro # (1)!
```

1. Note the `:ro` tag means the folder will be mounted as read only. This is for extra security against changes

## MySQL Caveats {#mysql-caveats}

### Case Sensitivity

The database interface does not provide a method to configure a MySQL
database to be case sensitive. This would prevent a user from creating a
tag `Name` and `NAME` as they are considered the same.

Per Django documentation, to enable this requires manual intervention.
To enable case sensitive tables, you can execute the following command
against each table:

`ALTER TABLE <table_name> CONVERT TO CHARACTER SET utf8mb4 COLLATE utf8mb4_bin;`

You can also set the default for new tables (this does NOT affect
existing tables) with:

`ALTER DATABASE <db_name> CHARACTER SET utf8mb4 COLLATE utf8mb4_bin;`

!!! warning

    Using mariadb version 10.4+ is recommended. Using the `utf8mb3` character set on
    an older system may fix issues that can arise while setting up Paperless-ngx but
    `utf8mb3` can cause issues with consumption (where `utf8mb4` does not).

## Barcodes {#barcodes}

Paperless is able to utilize barcodes for automatically preforming some tasks.

At this time, the library utilized for detection of barcodes supports the following types:

- AN-13/UPC-A
- UPC-E
- EAN-8
- Code 128
- Code 93
- Code 39
- Codabar
- Interleaved 2 of 5
- QR Code
- SQ Code

You may check for updates on the [zbar library homepage](https://github.com/mchehab/zbar).
For usage in Paperless, the type of barcode does not matter, only the contents of it.

For how to enable barcode usage, see [the configuration](/configuration#barcodes).
The two settings may be enabled independently, but do have interactions as explained
below.

### Document Splitting {#document-splitting}

When enabled, Paperless will look for a barcode with the configured value and create a new document
starting from the next page. The page with the barcode on it will _not_ be retained. It
is expected to be a page existing only for triggering the split.

### Archive Serial Number Assignment

When enabled, the value of the barcode (as an integer) will be used to set the document's
archive serial number, allowing quick reference back to the original, paper document.

If document splitting via barcode is also enabled, documents will be split when an ASN
barcode is located. However, differing from the splitting, the page with the
barcode _will_ be retained. This allows application of a barcode to any page, including
one which holds data to keep in the document.

## Automatic collation of double-sided documents {#collate}

!!! note

    If your scanner supports double-sided scanning natively, you do not need this feature.

This feature is turned off by default, see [configuration](/configuration#collate) on how to turn it on.

### Summary

If you have a scanner with an automatic document feeder (ADF) that only scans a single side,
this feature makes scanning double-sided documents much more convenient by automatically
collating two separate scans into one document, reordering the pages as necessary.

### Usage example

Suppose you have a double-sided document with 6 pages (3 sheets of paper). First,
put the stack into your ADF as normal, ensuring that page 1 is scanned first. Your ADF
will now scan pages 1, 3, and 5. Then you (or your the scanner, if it supports it) upload
the scan into the correct sub-directory of the consume folder (`double-sided` by default;
keep in mind that Paperless will _not_ automatically create the directory for you.)
Paperless will then process the scan and move it into an internal staging area.

The next step is to turn your stack upside down (without reordering the sheets of paper),
and scan it once again, your ADF will now scan pages 6, 4, and 2, in that order. Once this
scan is copied into the sub-directory, Paperless will collate the previous scan with the
new one, reversing the order of the pages on the second, "even numbered" scan. The
resulting document will have the pages 1-6 in the correct order, and this new file will
then be processed as normal.

!!! tip

    When scanning the even numbered pages, you can omit the last empty pages, if there are
    any. For example, if page 6 is empty, you only need to scan pages 2 and 4. _Do not_ omit
    empty pages in the middle of the document.

### Things that could go wrong

Paperless will notice when the first, "odd numbered" scan has less pages than the second
scan (this can happen when e.g. the ADF skipped a few pages in the first pass). In that
case, Paperless will remove the staging copy as well as the scan, and give you an error
message asking you to restart the process from scratch, by scanning the odd pages again,
followed by the even pages.

It's important that the scan files get consumed in the correct order, and one at a time.
You therefore need to make sure that Paperless is running while you upload the files into
the directory; and if you're using [polling](/configuration#polling), make sure that
`CONSUMER_POLLING` is set to a value lower than it takes for the second scan to appear,
like 5-10 or even lower.

Another thing that might happen is that you start a double sided scan, but then forget
to upload the second file. To avoid collating the wrong documents if you then come back
a day later to scan a new double-sided document, Paperless will only keep an "odd numbered
pages" file for up to 30 minutes. If more time passes, it will consider the next incoming
scan a completely new "odd numbered pages" one. The old staging file will get discarded.

### Interaction with "subdirs as tags"

The collation feature can be used together with the [subdirs as tags](/configuration#consume_config)
feature (but this is not a requirement). Just create a correctly named double-sided subdir
in the hierachy and upload your scans there. For example, both `double-sided/foo/bar` as
well as `foo/bar/double-sided` will cause the collated document to be treated as if it
were uploaded into `foo/bar` and receive both `foo` and `bar` tags, but not `double-sided`.

### Interaction with document splitting

You can use the [document splitting](#document-splitting) feature, but if you use a normal
single-sided split marker page, the split document(s) will have an empty page at the front (or
whatever else was on the backside of the split marker page.) You can work around that by having
a split marker page that has the split barcode on _both_ sides. This way, the extra page will
get automatically removed.

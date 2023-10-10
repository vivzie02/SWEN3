import os
from pathlib import Path

import httpx
from django.conf import settings
from django.utils import timezone
from tika_client import TikaClient

from documents.parsers import DocumentParser
from documents.parsers import ParseError
from documents.parsers import make_thumbnail_from_pdf


class TikaDocumentParser(DocumentParser):
    """
    This parser sends documents to a local tika server
    """

    logging_name = "paperless.parsing.tika"

    def get_thumbnail(self, document_path, mime_type, file_name=None):
        if not self.archive_path:
            self.archive_path = self.convert_to_pdf(document_path, file_name)

        return make_thumbnail_from_pdf(
            self.archive_path,
            self.tempdir,
            self.logging_group,
        )

    def extract_metadata(self, document_path, mime_type):
        try:
            with TikaClient(tika_url=settings.TIKA_ENDPOINT) as client:
                parsed = client.metadata.from_file(document_path, mime_type)
                return [
                    {
                        "namespace": "",
                        "prefix": "",
                        "key": key,
                        "value": parsed.data[key],
                    }
                    for key in parsed.data
                ]
        except Exception as e:
            self.log.warning(
                f"Error while fetching document metadata for {document_path}: {e}",
            )
            return []

    def parse(self, document_path: Path, mime_type: str, file_name=None):
        self.log.info(f"Sending {document_path} to Tika server")

        try:
            with TikaClient(tika_url=settings.TIKA_ENDPOINT) as client:
                parsed = client.tika.as_text.from_file(document_path, mime_type)
        except Exception as err:
            raise ParseError(
                f"Could not parse {document_path} with tika server at "
                f"{settings.TIKA_ENDPOINT}: {err}",
            ) from err

        self.text = parsed.content
        if self.text is not None:
            self.text = self.text.strip()

        self.date = parsed.created
        if self.date is not None and timezone.is_naive(self.date):
            self.date = timezone.make_aware(self.date)

        self.archive_path = self.convert_to_pdf(document_path, file_name)

    def convert_to_pdf(self, document_path, file_name):
        pdf_path = os.path.join(self.tempdir, "convert.pdf")
        gotenberg_server = settings.TIKA_GOTENBERG_ENDPOINT
        url = gotenberg_server + "/forms/libreoffice/convert"

        self.log.info(f"Converting {document_path} to PDF as {pdf_path}")
        with open(document_path, "rb") as document_handle:
            files = {
                "files": (
                    "convert" + os.path.splitext(document_path)[-1],
                    document_handle,
                ),
            }
            headers = {}
            data = {}

            # Set the output format of the resulting PDF
            # Valid inputs: https://gotenberg.dev/docs/modules/pdf-engines#uno
            if settings.OCR_OUTPUT_TYPE in {"pdfa", "pdfa-2"}:
                data["pdfFormat"] = "PDF/A-2b"
            elif settings.OCR_OUTPUT_TYPE == "pdfa-1":
                data["pdfFormat"] = "PDF/A-1a"
            elif settings.OCR_OUTPUT_TYPE == "pdfa-3":
                data["pdfFormat"] = "PDF/A-3b"

            try:
                response = httpx.post(
                    url,
                    files=files,
                    headers=headers,
                    data=data,
                    timeout=settings.CELERY_TASK_TIME_LIMIT,
                )
                response.raise_for_status()  # ensure we notice bad responses
            except Exception as err:
                raise ParseError(
                    f"Error while converting document to PDF: {err}",
                ) from err

        with open(pdf_path, "wb") as file:
            file.write(response.content)
            file.close()

        return pdf_path

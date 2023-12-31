    package at.fhtw.OCRMapper.services.impl;

    import at.fhtw.OCRMapper.elasticSearch.YourEntityController;
    import at.fhtw.OCRMapper.persistence.Document;
    import at.fhtw.OCRMapper.persistence.DocumentContent;
    import at.fhtw.OCRMapper.persistence.DocumentContentRepository;
    import at.fhtw.OCRMapper.persistence.DocumentRepository;
    import at.fhtw.OCRMapper.services.OCRService;
    import com.fasterxml.jackson.databind.JsonNode;
    import com.fasterxml.jackson.databind.ObjectMapper;
    import io.minio.GetObjectArgs;
    import io.minio.MinioClient;
    import io.minio.errors.MinioException;
    import net.sourceforge.tess4j.ITesseract;
    import net.sourceforge.tess4j.Tesseract;
    import net.sourceforge.tess4j.TesseractException;
    import org.apache.pdfbox.Loader;
    import org.apache.pdfbox.pdmodel.PDDocument;
    import org.apache.pdfbox.rendering.PDFRenderer;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;
    import org.apache.logging.log4j.LogManager;
    import org.apache.logging.log4j.Logger;
    import java.awt.image.BufferedImage;
    import java.io.*;
    import java.nio.file.Files;
    import java.nio.file.Path;
    import java.nio.file.StandardCopyOption;
    import java.security.InvalidKeyException;
    import java.security.NoSuchAlgorithmException;
    import java.util.ArrayList;
    import java.util.List;

    @Service
    public class OCRServiceImpl implements OCRService {
        protected static final Logger log = LogManager.getLogger();

        @Autowired
        private MinioClient minioClient;

        @Autowired
        private DocumentContentRepository documentContentRepository;

        @Autowired
        private DocumentRepository documentRepository;

        private final ObjectMapper objectMapper = new ObjectMapper();
        private final ITesseract tesseract = new Tesseract();

        @Autowired
        private YourEntityController yourEntityController;
        @Override
        public void saveDocument(String message) {
            List<DocumentContent> contents = new ArrayList<>();

            if (!message.equals("")) {
                log.info("Successfully read info from queue");
                log.info(message);


                // Extract title from the JSON message
                String title = extractTitleFromJson(message);

                // Use the title in further processing if needed
                log.info("Extracted title from JSON: " + title);

                // Now you can use the title as needed

                // Get the PDF as InputStream from Minio
                InputStream pdfInputStream = getFile("mein-bucket", "object-name/" + title);

                // Extract text from PDF using Tesseract OCR
                String extractedText = extractTextFromPdf(pdfInputStream);

                // Print or handle the extracted text as needed
                log.info("Extracted Text from PDF: " + extractedText);

                Document document = Document.builder()
                        .title(title)
                        .build();

                document = documentRepository.save(document);
                //documentRepository.flush();
                Long documentId = document.getId() - 1;

                //System.out.println("my id and so " + document);
                try{
                    System.out.println(yourEntityController.createDocument(documentId, document.getTitle(), extractedText));
                }
                catch (Exception e){
                    System.out.println("nope ma dude" + e);
                }

                log.info("saved document" + document.getTitle() + " with ID " + documentId);

                for (String line : extractedText.split("\\r?\\n")) {
                    if (!line.equals("")) {
                        contents.add(DocumentContent.builder()
                                .documentId(documentId)
                                .line(line)
                                .build());
                    }
                }

                log.info("Saving file content");
                documentContentRepository.saveAll(contents);
            }

        }

        // Updated method to extract text from PDF using Tesseract OCR
        public String extractTextFromPdf(InputStream pdfInputStream) {
            try {
                // Convert PDF to image
                List<BufferedImage> images = convertPdfToImages(pdfInputStream);

                // Use Tesseract to perform OCR on each image
                StringBuilder result = new StringBuilder();
                for (BufferedImage image : images) {
                    result.append(tesseract.doOCR(image)).append("\n");
                }

                return result.toString();
            } catch (IOException | TesseractException e) {
                e.printStackTrace(); // Handle the exception appropriately
                return "";
            }
        }

        // New method to convert PDF to a list of images
        private static List<BufferedImage> convertPdfToImages(InputStream pdfInputStream) throws IOException {
            List<BufferedImage> images = new ArrayList<>();

            // Save the PDF to a temporary file
            Path tempPdfPath = saveToTempFile(pdfInputStream);

            try (PDDocument document = Loader.loadPDF(tempPdfPath.toFile())) {
                PDFRenderer pdfRenderer = new PDFRenderer(document);

                for (int page = 0; page < document.getNumberOfPages(); ++page) {
                    BufferedImage image = pdfRenderer.renderImageWithDPI(page, 300);
                    images.add(image);
                }
            } finally {
                // Clean up resources
                Files.delete(tempPdfPath);
            }

            return images;
        }

        public String extractTitleFromJson(String jsonMessage) {
            try {
                JsonNode jsonNode = objectMapper.readTree(jsonMessage);
                // Assuming the title is stored under the key "original_file_name"
                return jsonNode.get("original_file_name").asText();
            } catch (IOException e) {
                log.error("Error extracting title from JSON", e);
                return null;
            }
        }

        InputStream getFile(String bucketName, String objectName) {
            try {
                return minioClient.getObject(
                        GetObjectArgs.builder()
                                .bucket(bucketName)
                                .object(objectName)
                                .build()
                );
            } catch (MinioException | IOException | InvalidKeyException | NoSuchAlgorithmException e) {
                log.error("Error getting file from Minio", e);
                // Handle exceptions appropriately
                return null;
            }
        }

        public static Path saveToTempFile(InputStream inputStream) throws IOException {
            Path tempPdfPath = Files.createTempFile("temp", ".pdf");
            Files.copy(inputStream, tempPdfPath, StandardCopyOption.REPLACE_EXISTING);
            return tempPdfPath;
        }
    }

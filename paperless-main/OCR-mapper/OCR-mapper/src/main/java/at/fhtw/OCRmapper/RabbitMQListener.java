package at.fhtw.OCRmapper;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

@Component
public class RabbitMQListener {

    @Autowired
    private MinioService minioService;

    @Autowired
    private OcrService ocrService;

    @RabbitListener(queues = "paperless.documents.queue")
    public void receiveMessage(String message) {
        System.out.println("Empfangene Nachricht: " + message);

        try {
            // MinIO-Client nutzen, um die Datei zu holen
            InputStream fileStream = minioService.getFile(message);
            Path tempFile = Files.createTempFile("ocr_", ".tmp");
            Files.copy(fileStream, tempFile, StandardCopyOption.REPLACE_EXISTING);

            // OCR durchführen
            String extractedText = ocrService.extractTextFromPdf(tempFile.toFile());
            System.out.println("Extrahierter Text: " + extractedText);

            // Aufräumen: Temporäre Datei löschen
            Files.delete(tempFile);
        } catch (Exception e) {
            e.printStackTrace();
            // Besseres Error-Handling je nach Bedarf
        }
    }
}

package at.fhtw.OCRMapper.services.impl;

import at.fhtw.OCRMapper.services.OCRService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.minio.GetObjectArgs;
import io.minio.MinioClient;
import io.minio.errors.MinioException;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

@Service
public class OCRServiceImpl implements OCRService {
    static Logger log = Logger.getLogger(OCRServiceImpl.class.getName());

    @Autowired
    private MinioClient minioClient;

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    @RabbitListener(queues = "paperless.documents.queue")
    public void saveDocument(String message) {
        if (!message.equals("")) {
            log.info("Successfully read info from queue");
            log.info(message);

            // Extract title from the JSON message
            String title = extractTitleFromJson(message);

            // Use the title in further processing if needed
            log.info("Extracted title from JSON: " + title);

            // Now you can use the title as needed

            InputStream file = getFile("mein-bucket", "object-name/" + title);
        }
    }

    private String extractTitleFromJson(String jsonMessage) {
        try {
            JsonNode jsonNode = objectMapper.readTree(jsonMessage);
            // Assuming the title is stored under the key "title"
            return jsonNode.get("original_file_name").asText();
        } catch (IOException e) {
            log.error("Error extracting title from JSON", e);
            return null;
        }
    }

    public InputStream getFile(String bucketName, String objectName) {
        try {
            InputStream client = minioClient.getObject(
                    GetObjectArgs.builder()
                            .bucket(bucketName)
                            .object(objectName)
                            .build()
            );
            log.info("Successfully read file from Minio");
            return client;

        } catch (MinioException | IOException | InvalidKeyException | NoSuchAlgorithmException e) {
            log.error("Error getting file from Minio", e);
            // Handle exceptions appropriately
            return null;
        }
    }
}


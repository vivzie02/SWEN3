package at.fhtw.OCRMapper.services.impl;

import at.fhtw.OCRMapper.OcrMapperApplication;
import at.fhtw.OCRMapper.services.OCRService;
import io.minio.GetObjectArgs;
import io.minio.MinioClient;
import io.minio.errors.MinioException;
import io.minio.messages.Item;
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

    @Override
    @RabbitListener(queues = "paperless.documents.queue")
    public void saveDocument(String message){
        if(!message.equals("")) {
            log.info("successfully read info from queue");
            log.info(message);
        }

        getFile("mein-bucket", "object-name/Review_Mindmap_Ziering.pdf");
    }

    public InputStream getFile(String bucketName, String objectName){
        try {
            InputStream client = minioClient.getObject(
                    GetObjectArgs.builder()
                            .bucket(bucketName)
                            .object(objectName)
                            .build()
            );
            log.info("successfully read file from minio");
            return client;

        } catch (MinioException | IOException | InvalidKeyException | NoSuchAlgorithmException e) {
            e.printStackTrace();
            // Handle exceptions appropriately
            return null;
        }
    }
}

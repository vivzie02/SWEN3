package org.openapitools.services.impl;

import io.minio.PutObjectArgs;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openapitools.configuration.MinioConfig.MinioConfig;
import org.openapitools.services.MinioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class MinioServiceImpl implements MinioService {
    protected static final Logger logger = LogManager.getLogger();

    @Autowired
    public MinioConfig minioConfig;

    @Override
    public void save(List<MultipartFile> document){
        // Upload each document to MinIO
        logger.info("uploading to MinIO");
        for (MultipartFile file : document) {
            try {
                // Specify your MinIO bucket and object name
                String bucketName = "mein-bucket";
                String objectName = "object-name/" + file.getOriginalFilename();

                // Upload the document to MinIO
                minioConfig.minioClient().putObject(
                        PutObjectArgs.builder()
                                .bucket(bucketName)
                                .object(objectName)
                                .stream(file.getInputStream(), file.getSize(), -1)
                                .contentType(file.getContentType())
                                .build()
                );
            } catch (Exception ex) {
                logger.error("Error uploading document to MinIO: {}", ex.getMessage());
                ex.printStackTrace();
                // Handle the exception (e.g., return an error response)
            }
        }
    }
}

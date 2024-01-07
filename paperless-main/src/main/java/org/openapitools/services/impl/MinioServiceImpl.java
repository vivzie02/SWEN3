package org.openapitools.services.impl;

import io.minio.GetObjectArgs;
import io.minio.PutObjectArgs;
import io.minio.StatObjectArgs;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openapitools.configuration.MinioConfig.MinioConfig;
import org.openapitools.services.MinioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
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
    @Override
    public Pair<InputStream, String> get(String filename){
        try {
            // Specify your MinIO bucket and the object name (filename)
            String bucketName = "mein-bucket";
            String objectName = "object-name/" + filename;

            // Get the object from MinIO
            InputStream object = minioConfig.minioClient().getObject(
                    GetObjectArgs.builder()
                            .bucket(bucketName)
                            .object(objectName)
                            .build()
            );

            // Get content type of the object
            String contentType = minioConfig.minioClient().statObject(
                    StatObjectArgs.builder()
                            .bucket(bucketName)
                            .object(objectName)
                            .build()
            ).contentType();

            // Return the object stream and content type
            logger.info("retrieving from minio");
            return Pair.of(object, contentType);

        } catch (Exception ex) {
            logger.error("Error retrieving document from MinIO: {}", ex.getMessage());
            ex.printStackTrace();
            // Return null or handle the exception as required
            return null;
        }
    }

}

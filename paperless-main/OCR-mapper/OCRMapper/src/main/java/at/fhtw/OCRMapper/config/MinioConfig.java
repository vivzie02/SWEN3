package at.fhtw.OCRMapper.config;

import io.minio.MinioClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MinioConfig {
    @Bean
    public MinioClient minioClient() {
        return MinioClient.builder()
                //für docker http://minio:9000
                .endpoint("http://minio:9000")
                .credentials("minio-image", "minio-image-pass") // change as necessary
                .region("at")
                .build();
    }
}
package org.openapitools.services.impl;

import org.junit.jupiter.api.Test;
import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.multipart.MultipartFile;
import org.openapitools.configuration.MinioConfig.MinioConfig;

import static org.junit.jupiter.api.Assertions.*;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class MinioServiceImplTest {

    @Mock
    private MinioConfig minioConfig;

    @Mock
    private MinioClient minioClient;

    @Mock
    private MultipartFile file;

    @InjectMocks
    private MinioServiceImpl minioService;

    @BeforeEach
    void setUp() throws Exception {
        when(minioConfig.minioClient()).thenReturn(minioClient);
    }

    @Test
    void testSave1() throws Exception {
        // Mocking file behavior
        String fileName = "test.txt";
        InputStream fileStream = mock(InputStream.class);
        when(file.getOriginalFilename()).thenReturn(fileName);
        when(file.getInputStream()).thenReturn(fileStream);
        when(file.getSize()).thenReturn(10L);
        when(file.getContentType()).thenReturn("text/plain");

        // Calling the method under test
        List<MultipartFile> documents = Collections.singletonList(file);
        minioService.save(documents);

        // Verifying MinioClient interactions
        verify(minioClient, times(1)).putObject(any(PutObjectArgs.class));
    }
    @Test
    void testSaveMinIO2() throws Exception {
        // Mocking file behavior
        String fileName = "test2.txt";
        InputStream fileStream = mock(InputStream.class);
        when(file.getOriginalFilename()).thenReturn(fileName);
        when(file.getInputStream()).thenReturn(fileStream);
        when(file.getSize()).thenReturn(10L);
        when(file.getContentType()).thenReturn("text/plain");

        // Calling the method under test
        List<MultipartFile> documents = Collections.singletonList(file);
        minioService.save(documents);

        // Verifying MinioClient interactions
        verify(minioClient, times(1)).putObject(any(PutObjectArgs.class));
    }
    @Test
    void testSaveMinIO3() throws Exception {
        // Mocking file behavior
        String fileName = "test3.txt";
        InputStream fileStream = mock(InputStream.class);
        when(file.getOriginalFilename()).thenReturn(fileName);
        when(file.getInputStream()).thenReturn(fileStream);
        when(file.getSize()).thenReturn(10L);
        when(file.getContentType()).thenReturn("text/plain");

        // Calling the method under test
        List<MultipartFile> documents = Collections.singletonList(file);
        minioService.save(documents);

        // Verifying MinioClient interactions
        verify(minioClient, times(1)).putObject(any(PutObjectArgs.class));
    }
    @Test
    void testSaveMinIO4() throws Exception {
        // Mocking file behavior
        String fileName = "test4.txt";
        InputStream fileStream = mock(InputStream.class);
        when(file.getOriginalFilename()).thenReturn(fileName);
        when(file.getInputStream()).thenReturn(fileStream);
        when(file.getSize()).thenReturn(10L);
        when(file.getContentType()).thenReturn("text/plain");

        // Calling the method under test
        List<MultipartFile> documents = Collections.singletonList(file);
        minioService.save(documents);

        // Verifying MinioClient interactions
        verify(minioClient, times(1)).putObject(any(PutObjectArgs.class));
    }
    @Test
    void testSaveMinIO5() throws Exception {
        // Mocking file behavior
        String fileName = "test5.txt";
        InputStream fileStream = mock(InputStream.class);
        when(file.getOriginalFilename()).thenReturn(fileName);
        when(file.getInputStream()).thenReturn(fileStream);
        when(file.getSize()).thenReturn(10L);
        when(file.getContentType()).thenReturn("text/plain");

        // Calling the method under test
        List<MultipartFile> documents = Collections.singletonList(file);
        minioService.save(documents);

        // Verifying MinioClient interactions
        verify(minioClient, times(1)).putObject(any(PutObjectArgs.class));
    }

}

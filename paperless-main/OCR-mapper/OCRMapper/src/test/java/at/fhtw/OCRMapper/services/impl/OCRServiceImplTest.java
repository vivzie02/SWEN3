package at.fhtw.OCRMapper.services.impl;

import at.fhtw.OCRMapper.elasticSearch.YourEntityController;
import at.fhtw.OCRMapper.persistence.Document;
import at.fhtw.OCRMapper.persistence.DocumentContent;
import at.fhtw.OCRMapper.persistence.DocumentContentRepository;
import at.fhtw.OCRMapper.persistence.DocumentRepository;
import at.fhtw.OCRMapper.services.OCRService;
import io.minio.GetObjectArgs;
import io.minio.GetObjectResponse;
import io.minio.MinioClient;
import io.minio.errors.*;
import org.apache.commons.compress.utils.IOUtils;
import org.junit.jupiter.api.Test;
import io.minio.GetObjectResponse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.Answer;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.*;

@ExtendWith(MockitoExtension.class)
class OCRServiceImplTest {
    @Mock
    private MinioClient minioClient;
    @Mock
    private DocumentContentRepository documentContentRepository;
    @Mock
    private DocumentRepository documentRepository;
    @Mock
    private YourEntityController yourEntityController;

    @InjectMocks
    private OCRServiceImpl ocrService;

    @BeforeEach
    void setUp() {
        initMocks(this);
        lenient().when(documentRepository.save(any(Document.class))).thenAnswer(invocation -> {
            Document doc = invocation.getArgument(0);
            doc.setId(1L); // Set a sample ID
            return doc;
        });
    }



    @Test
    void saveDocument_WithEmptyMessage() {
        String message = "";

        ocrService.saveDocument(message);

        verify(documentRepository, never()).save(any(Document.class));
        verify(documentContentRepository, never()).saveAll(anyList());
    }

    @Test
    void extractTitleFromJson_validTitle1() {
        // Arrange
        String validJson = "{\"original_file_name\":\"title1.pdf\"}";

        // Act
        String title = ocrService.extractTitleFromJson(validJson);

        // Assert
        assertEquals("title1.pdf", title);
    }
    @Test
    void extractTitleFromJson_validTitle2() {
        // Arrange
        String validJson = "{\"original_file_name\":\"title2.pdf\"}";

        // Act
        String title = ocrService.extractTitleFromJson(validJson);

        // Assert
        assertEquals("title2.pdf", title);
    }
    @Test
    void extractTitleFromJson_validTitle3() {
        // Arrange
        String validJson = "{\"original_file_name\":\"title3.pdf\"}";

        // Act
        String title = ocrService.extractTitleFromJson(validJson);

        // Assert
        assertEquals("title3.pdf", title);
    }
    @Test
    void extractTitleFromJson_validTitle4() {
        // Arrange
        String validJson = "{\"original_file_name\":\"title4.pdf\"}";

        // Act
        String title = ocrService.extractTitleFromJson(validJson);

        // Assert
        assertEquals("title4.pdf", title);
    }
    @Test
    void extractTitleFromJson_validTitle5() {
        // Arrange
        String validJson = "{\"original_file_name\":\"title5.pdf\"}";

        // Act
        String title = ocrService.extractTitleFromJson(validJson);

        // Assert
        assertEquals("title5.pdf", title);
    }
    @Test
    void saveDocument_WithEmptyMessages() {
        String message = "";

        ocrService.saveDocument(message);

        verify(documentRepository, never()).save(any(Document.class));
        verify(documentContentRepository, never()).saveAll(anyList());
    }
    @Test
    void extractTitleFromJson_validTitle6() {
        // Arrange
        String validJson = "{\"original_file_name\":\"title6.pdf\"}";

        // Act
        String title = ocrService.extractTitleFromJson(validJson);

        // Assert
        assertEquals("title6.pdf", title);
    }
    @Test
    void extractTitleFromJson_validTitle7() {
        // Arrange
        String validJson = "{\"original_file_name\":\"title7.pdf\"}";

        // Act
        String title = ocrService.extractTitleFromJson(validJson);

        // Assert
        assertEquals("title7.pdf", title);
    }
    @Test
    void saveToTempFile1() throws IOException {
        // Arrange
        String sampleContent = "PDFContent1";
        InputStream inputStream = new ByteArrayInputStream(sampleContent.getBytes());

        // Act
        Path tempFilePath = OCRServiceImpl.saveToTempFile(inputStream);

        // Assert
        assertTrue(Files.exists(tempFilePath));
        assertEquals(sampleContent, new String(Files.readAllBytes(tempFilePath)));
        Files.delete(tempFilePath); // Cleanup
    }
    @Test
    void saveToTempFile2() throws IOException {
        // Arrange
        String sampleContent = "PDFContent2";
        InputStream inputStream = new ByteArrayInputStream(sampleContent.getBytes());

        // Act
        Path tempFilePath = OCRServiceImpl.saveToTempFile(inputStream);

        // Assert
        assertTrue(Files.exists(tempFilePath));
        assertEquals(sampleContent, new String(Files.readAllBytes(tempFilePath)));
        Files.delete(tempFilePath); // Cleanup
    }
    @Test
    void saveToTempFile3() throws IOException {
        // Arrange
        String sampleContent = "PDFContent3";
        InputStream inputStream = new ByteArrayInputStream(sampleContent.getBytes());

        // Act
        Path tempFilePath = OCRServiceImpl.saveToTempFile(inputStream);

        // Assert
        assertTrue(Files.exists(tempFilePath));
        assertEquals(sampleContent, new String(Files.readAllBytes(tempFilePath)));
        Files.delete(tempFilePath); // Cleanup
    }
    @Test
    void saveToTempFile4() throws IOException {
        // Arrange
        String sampleContent = "PDFContent4";
        InputStream inputStream = new ByteArrayInputStream(sampleContent.getBytes());

        // Act
        Path tempFilePath = OCRServiceImpl.saveToTempFile(inputStream);

        // Assert
        assertTrue(Files.exists(tempFilePath));
        assertEquals(sampleContent, new String(Files.readAllBytes(tempFilePath)));
        Files.delete(tempFilePath); // Cleanup
    }
    @Test
    void saveToTempFile5() throws IOException {
        // Arrange
        String sampleContent = "PDFContent5";
        InputStream inputStream = new ByteArrayInputStream(sampleContent.getBytes());

        // Act
        Path tempFilePath = OCRServiceImpl.saveToTempFile(inputStream);

        // Assert
        assertTrue(Files.exists(tempFilePath));
        assertEquals(sampleContent, new String(Files.readAllBytes(tempFilePath)));
        Files.delete(tempFilePath); // Cleanup
    }
    @Test
    void saveToTempFile6() throws IOException {
        // Arrange
        String sampleContent = "PDFContent6";
        InputStream inputStream = new ByteArrayInputStream(sampleContent.getBytes());

        // Act
        Path tempFilePath = OCRServiceImpl.saveToTempFile(inputStream);

        // Assert
        assertTrue(Files.exists(tempFilePath));
        assertEquals(sampleContent, new String(Files.readAllBytes(tempFilePath)));
        Files.delete(tempFilePath); // Cleanup
    }    @Test
    void saveToTempFile7() throws IOException {
        // Arrange
        String sampleContent = "PDFContent7";
        InputStream inputStream = new ByteArrayInputStream(sampleContent.getBytes());

        // Act
        Path tempFilePath = OCRServiceImpl.saveToTempFile(inputStream);

        // Assert
        assertTrue(Files.exists(tempFilePath));
        assertEquals(sampleContent, new String(Files.readAllBytes(tempFilePath)));
        Files.delete(tempFilePath); // Cleanup
    }
    @Test
    void getFile1() throws Exception {
        // Arrange
        String bucketName = "test-bucket1";
        String objectName = "test1.pdf";
        GetObjectResponse mockResponse = mock(GetObjectResponse.class);
        when(minioClient.getObject(any(GetObjectArgs.class))).thenReturn(mockResponse);

        // Act
        InputStream result = ocrService.getFile(bucketName, objectName);

        // Assert
        assertNotNull(result);
    }
    @Test
    void getFile2() throws Exception {
        // Arrange
        String bucketName = "test-bucket2";
        String objectName = "test2.pdf";
        GetObjectResponse mockResponse = mock(GetObjectResponse.class);
        when(minioClient.getObject(any(GetObjectArgs.class))).thenReturn(mockResponse);

        // Act
        InputStream result = ocrService.getFile(bucketName, objectName);

        // Assert
        assertNotNull(result);
    }
    @Test
    void getFile3() throws Exception {
        // Arrange
        String bucketName = "test-bucket3";
        String objectName = "test3.pdf";
        GetObjectResponse mockResponse = mock(GetObjectResponse.class);
        when(minioClient.getObject(any(GetObjectArgs.class))).thenReturn(mockResponse);

        // Act
        InputStream result = ocrService.getFile(bucketName, objectName);

        // Assert
        assertNotNull(result);
    }
    @Test
    void getFile4() throws Exception {
        // Arrange
        String bucketName = "test-bucket4";
        String objectName = "test4.pdf";
        GetObjectResponse mockResponse = mock(GetObjectResponse.class);
        when(minioClient.getObject(any(GetObjectArgs.class))).thenReturn(mockResponse);

        // Act
        InputStream result = ocrService.getFile(bucketName, objectName);

        // Assert
        assertNotNull(result);
    }
    @Test
    void getFile5() throws Exception {
        // Arrange
        String bucketName = "test-bucket5";
        String objectName = "test5.pdf";
        GetObjectResponse mockResponse = mock(GetObjectResponse.class);
        when(minioClient.getObject(any(GetObjectArgs.class))).thenReturn(mockResponse);

        // Act
        InputStream result = ocrService.getFile(bucketName, objectName);

        // Assert
        assertNotNull(result);
    }








}
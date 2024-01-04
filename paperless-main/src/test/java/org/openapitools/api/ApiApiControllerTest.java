package org.openapitools.api;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.Document;
import org.openapitools.services.DocumentService;
import org.openapitools.services.MinioService;
import org.openapitools.services.RabbitMQSenderService;
import org.openapitools.services.impl.DocumentServiceImpl;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.multipart.MultipartFile;
import org.openapitools.model.Document;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.multipart;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
@ExtendWith(SpringExtension.class)
@WebMvcTest(ApiApiController.class)
class ApiApiControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private DocumentService documentService;

    @MockBean
    private RabbitMQSenderService rabbitMQSenderService;

    @MockBean
    private MinioService minioService;

    @Test
    void getRequest() {
    }
/*
    @Test
    void testUploadDocument() throws Exception {
        MultipartFile file = new MockMultipartFile("file", "filename.txt", "text/plain", "some xml".getBytes());
        List<MultipartFile> files = Arrays.asList(file);

        // Perform test request
        mockMvc.perform(multipart("/upload")
                        .file("file", file.getBytes())
                        .param("title", "TestTitle")
                        .param("documentType", "1")
                        .contentType(MediaType.MULTIPART_FORM_DATA))
                .andExpect(status().isOk());

        // Create a Document object to match the expected input to saveDocument
        Document expectedDocument = Document.builder()
                .correspondent(JsonNullable.of(2)) // and so on for other fields
                .build();

        // Verify that saveDocument was called with the expected Document
        verify(documentService, times(1)).saveDocument(refEq(expectedDocument));

        // Verify other service interactions
        verify(rabbitMQSenderService, times(1)).sendDocumentMessage(anyString());
        verify(minioService, times(1)).save(anyList());
    }*/
}
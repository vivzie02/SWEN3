package org.openapitools.services.impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.Document;
import org.openapitools.persistence.entities.DocumentEntity;
import org.openapitools.persistence.repositories.DocumentRepository;

import java.time.OffsetDateTime;
import java.util.Arrays;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
class DocumentServiceImplTest {

    @Mock
    private DocumentRepository documentRepository;
    @InjectMocks
    private DocumentServiceImpl documentService;
    @Test
    void testSaveDocument1() {
        Document document = Document.builder()
                .id(1)
                .correspondent(JsonNullable.of(2))
                .documentType(JsonNullable.of(3))
                .storagePath(JsonNullable.of(4))
                .title(JsonNullable.of("TestTitle"))
                .content(JsonNullable.of("TestContent"))
                .tags(JsonNullable.of(Arrays.asList(5, 6, 7)))
                .created(OffsetDateTime.now())
                .createdDate(OffsetDateTime.now())
                .modified(OffsetDateTime.now())
                .added(OffsetDateTime.now())
                .archiveSerialNumber(JsonNullable.of("ASN123"))
                .archivedFileName(JsonNullable.of("archived.txt"))
                .build();
        when(documentRepository.save(any(DocumentEntity.class))).thenReturn(new DocumentEntity());
        documentService.saveDocument(document);

        verify(documentRepository, times(1)).save(any(DocumentEntity.class));
    }
    @Test
    void testSaveDocument2() {
        Document document = Document.builder()
                .id(2)
                .correspondent(JsonNullable.of(3))
                .documentType(JsonNullable.of(4))
                .storagePath(JsonNullable.of(5))
                .title(JsonNullable.of("AnotherTitle"))
                .content(JsonNullable.of("AnotherContent"))
                .tags(JsonNullable.of(Arrays.asList(7, 8, 9)))
                .created(OffsetDateTime.now())
                .createdDate(OffsetDateTime.now())
                .modified(OffsetDateTime.now())
                .added(OffsetDateTime.now())
                .archiveSerialNumber(JsonNullable.of("1234"))
                .archivedFileName(JsonNullable.of("example.txt"))
                .build();
        when(documentRepository.save(any(DocumentEntity.class))).thenReturn(new DocumentEntity());
        documentService.saveDocument(document);

        verify(documentRepository, times(1)).save(any(DocumentEntity.class));
    }

    @Test
    void testSaveDocument3() {
        Document document = Document.builder()
                .id(3)
                .correspondent(JsonNullable.of(1))
                .documentType(JsonNullable.of(1))
                .storagePath(JsonNullable.of(1))
                .title(JsonNullable.of("ThisTitle"))
                .content(JsonNullable.of("ThisContent"))
                .tags(JsonNullable.of(Arrays.asList(7, 8, 9)))
                .created(OffsetDateTime.now())
                .createdDate(OffsetDateTime.now())
                .modified(OffsetDateTime.now())
                .added(OffsetDateTime.now())
                .archiveSerialNumber(JsonNullable.of("4444"))
                .archivedFileName(JsonNullable.of("ThisOne.txt"))
                .build();
        when(documentRepository.save(any(DocumentEntity.class))).thenReturn(new DocumentEntity());
        documentService.saveDocument(document);

        verify(documentRepository, times(1)).save(any(DocumentEntity.class));
    }
    @Test
    void testSaveDocument4() {
        Document document = Document.builder()
                .id(3)
                .correspondent(JsonNullable.of(2))
                .documentType(JsonNullable.of(2))
                .storagePath(JsonNullable.of(2))
                .title(JsonNullable.of("ThatTitle"))
                .content(JsonNullable.of("ThatContent"))
                .tags(JsonNullable.of(Arrays.asList(5, 5, 5)))
                .created(OffsetDateTime.now())
                .createdDate(OffsetDateTime.now())
                .modified(OffsetDateTime.now())
                .added(OffsetDateTime.now())
                .archiveSerialNumber(JsonNullable.of("5555"))
                .archivedFileName(JsonNullable.of("ThatOne.txt"))
                .build();
        when(documentRepository.save(any(DocumentEntity.class))).thenReturn(new DocumentEntity());
        documentService.saveDocument(document);

        verify(documentRepository, times(1)).save(any(DocumentEntity.class));
    }

    @Test
    void testSaveDocument5() {
        Document document = Document.builder()
                .id(3)
                .correspondent(JsonNullable.of(5))
                .documentType(JsonNullable.of(5))
                .storagePath(JsonNullable.of(5))
                .title(JsonNullable.of("HisTitle    "))
                .content(JsonNullable.of("HisContent"))
                .tags(JsonNullable.of(Arrays.asList(5, 5, 5)))
                .created(OffsetDateTime.now())
                .createdDate(OffsetDateTime.now())
                .modified(OffsetDateTime.now())
                .added(OffsetDateTime.now())
                .archiveSerialNumber(JsonNullable.of("55555"))
                .archivedFileName(JsonNullable.of("ThatGuy.txt"))
                .build();
        when(documentRepository.save(any(DocumentEntity.class))).thenReturn(new DocumentEntity());
        documentService.saveDocument(document);

        verify(documentRepository, times(1)).save(any(DocumentEntity.class));
    }
}
package org.openapitools;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.Document;
import org.openapitools.persistence.entities.DocumentEntity;
import org.openapitools.services.mapper.DocumentMapper;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.OffsetDateTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class OpenApiGeneratorApplicationTests {

    @Test
    void contextLoads() {
    }

    private DocumentMapper documentMapper;

    @BeforeEach
    public void setUp() {
        documentMapper = DocumentMapper.INSTANCE;
    }

    @Test
    public void shouldMapDocumentEntityToDocument() {
        DocumentEntity documentEntity = DocumentEntity.builder()
                .id(1)
                .correspondent(2)
                .documentType(3)
                .storagePath(4)
                .title("TestTitle")
                .content("TestContent")
                .tags(Arrays.asList(5, 6, 7))
                .created(OffsetDateTime.now())
                .createdDate(OffsetDateTime.now())
                .modified(OffsetDateTime.now())
                .added(OffsetDateTime.now())
                .archiveSerialNumber("ASN123")
                .originalFileName("original.txt")
                .archivedFileName("archived.txt")
                .build();

        Document document = documentMapper.toDTO(documentEntity);

        assertNotNull(document);
        assertEquals(documentEntity.getId(), document.getId());
        assertEquals(documentEntity.getCorrespondent(), document.getCorrespondent().get());
        assertEquals(documentEntity.getDocumentType(), document.getDocumentType().get());
        assertEquals(documentEntity.getStoragePath(), document.getStoragePath().get());
        assertEquals(documentEntity.getTitle(), document.getTitle().get());
        assertEquals(documentEntity.getContent(), document.getContent().get());
        assertEquals(documentEntity.getTags(), document.getTags().get());
        assertEquals(documentEntity.getCreated(), document.getCreated());
        assertEquals(documentEntity.getCreatedDate(), document.getCreatedDate());
        assertEquals(documentEntity.getModified(), document.getModified());
        assertEquals(documentEntity.getAdded(), document.getAdded());
        assertEquals(documentEntity.getArchiveSerialNumber(), document.getArchiveSerialNumber().get());
        assertEquals(documentEntity.getOriginalFileName(), document.getOriginalFileName().get());
        assertEquals(documentEntity.getArchivedFileName(), document.getArchivedFileName().get());
    }

    @Test
    public void shouldMapDocumentToDocumentEntity() {
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
                .originalFileName(JsonNullable.of("original.txt"))
                .archivedFileName(JsonNullable.of("archived.txt"))
                .build();

        DocumentEntity documentEntity = documentMapper.toEntity(document);

        assertNotNull(documentEntity);
        assertEquals(document.getId(), documentEntity.getId());
        assertEquals(document.getCorrespondent().get(), documentEntity.getCorrespondent());
        assertEquals(document.getDocumentType().get(), documentEntity.getDocumentType());
        assertEquals(document.getStoragePath().get(), documentEntity.getStoragePath());
        assertEquals(document.getTitle().get(), documentEntity.getTitle());
        assertEquals(document.getContent().get(), documentEntity.getContent());
        assertEquals(document.getTags().get(), documentEntity.getTags());
        assertEquals(document.getCreated(), documentEntity.getCreated());
        assertEquals(document.getCreatedDate(), documentEntity.getCreatedDate());
        assertEquals(document.getModified(), documentEntity.getModified());
        assertEquals(document.getAdded(), documentEntity.getAdded());
        assertEquals(document.getArchiveSerialNumber().get(), documentEntity.getArchiveSerialNumber());
        assertEquals(document.getOriginalFileName().get(), documentEntity.getOriginalFileName());
        assertEquals(document.getArchivedFileName().get(), documentEntity.getArchivedFileName());
    }


}
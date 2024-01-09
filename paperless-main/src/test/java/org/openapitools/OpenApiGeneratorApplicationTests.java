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
    public void DocumentEntityToDocumentMapperTest1() {
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
        assertEquals(documentEntity.getArchivedFileName(), document.getArchivedFileName().get());
    }
    @Test
    public void DocumentEntityToDocumentMapperTest2() {
        DocumentEntity documentEntity = DocumentEntity.builder()
                .id(2)
                .correspondent(2)
                .documentType(2)
                .storagePath(2)
                .title("TestTitle2")
                .content("TestContent2")
                .tags(Arrays.asList(2, 2, 2))
                .created(OffsetDateTime.now())
                .createdDate(OffsetDateTime.now())
                .modified(OffsetDateTime.now())
                .added(OffsetDateTime.now())
                .archiveSerialNumber("222")
                .archivedFileName("222.txt")
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
        assertEquals(documentEntity.getArchivedFileName(), document.getArchivedFileName().get());
    }
    @Test
    public void DocumentEntityToDocumentMapperTest3() {
        DocumentEntity documentEntity = DocumentEntity.builder()
                .id(3)
                .correspondent(3)
                .documentType(3)
                .storagePath(3)
                .title("TestTitle3")
                .content("TestContent3")
                .tags(Arrays.asList(3, 3, 3))
                .created(OffsetDateTime.now())
                .createdDate(OffsetDateTime.now())
                .modified(OffsetDateTime.now())
                .added(OffsetDateTime.now())
                .archiveSerialNumber("333")
                .archivedFileName("333.txt")
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
        assertEquals(documentEntity.getArchivedFileName(), document.getArchivedFileName().get());
    }
    @Test
    public void DocumentEntityToDocumentMapperTest4() {
        DocumentEntity documentEntity = DocumentEntity.builder()
                .id(4)
                .correspondent(4)
                .documentType(4)
                .storagePath(4)
                .title("TestTitle4")
                .content("TestContent4")
                .tags(Arrays.asList(4, 4, 4))
                .created(OffsetDateTime.now())
                .createdDate(OffsetDateTime.now())
                .modified(OffsetDateTime.now())
                .added(OffsetDateTime.now())
                .archiveSerialNumber("444")
                .archivedFileName("444.txt")
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
        assertEquals(documentEntity.getArchivedFileName(), document.getArchivedFileName().get());
    }
    @Test
    public void DocumentToDocumentEntityMapperTest1() {
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
        assertEquals(document.getArchivedFileName().get(), documentEntity.getArchivedFileName());
    }
    @Test
    public void DocumentToDocumentEntityMapperTest2() {
        Document document = Document.builder()
                .id(2)
                .correspondent(JsonNullable.of(2))
                .documentType(JsonNullable.of(2))
                .storagePath(JsonNullable.of(2))
                .title(JsonNullable.of("TestTitle2"))
                .content(JsonNullable.of("TestContent2"))
                .tags(JsonNullable.of(Arrays.asList(2, 2, 2)))
                .created(OffsetDateTime.now())
                .createdDate(OffsetDateTime.now())
                .modified(OffsetDateTime.now())
                .added(OffsetDateTime.now())
                .archiveSerialNumber(JsonNullable.of("222"))
                .archivedFileName(JsonNullable.of("222.txt"))
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
        assertEquals(document.getArchivedFileName().get(), documentEntity.getArchivedFileName());
    }
    @Test
    public void DocumentToDocumentEntityMapperTest3() {
        Document document = Document.builder()
                .id(1)
                .correspondent(JsonNullable.of(3))
                .documentType(JsonNullable.of(3))
                .storagePath(JsonNullable.of(3))
                .title(JsonNullable.of("TestTitle3"))
                .content(JsonNullable.of("TestContent3"))
                .tags(JsonNullable.of(Arrays.asList(3, 3, 3)))
                .created(OffsetDateTime.now())
                .createdDate(OffsetDateTime.now())
                .modified(OffsetDateTime.now())
                .added(OffsetDateTime.now())
                .archiveSerialNumber(JsonNullable.of("333"))
                .archivedFileName(JsonNullable.of("333.txt"))
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
        assertEquals(document.getArchivedFileName().get(), documentEntity.getArchivedFileName());
    }
    @Test
    public void DocumentToDocumentEntityMapperTest4() {
        Document document = Document.builder()
                .id(1)
                .correspondent(JsonNullable.of(4))
                .documentType(JsonNullable.of(4))
                .storagePath(JsonNullable.of(4))
                .title(JsonNullable.of("TestTitle4"))
                .content(JsonNullable.of("TestContent4"))
                .tags(JsonNullable.of(Arrays.asList(4, 4, 4)))
                .created(OffsetDateTime.now())
                .createdDate(OffsetDateTime.now())
                .modified(OffsetDateTime.now())
                .added(OffsetDateTime.now())
                .archiveSerialNumber(JsonNullable.of("444"))
                .archivedFileName(JsonNullable.of("444.txt"))
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
        assertEquals(document.getArchivedFileName().get(), documentEntity.getArchivedFileName());
    }

}
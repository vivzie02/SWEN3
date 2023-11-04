package org.openapitools.persistence.entities;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.OffsetDateTime;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DocumentEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "native")
    @Column
    private Integer id;

    @Column
    private Integer correspondent;

    @Column(name = "document_type")
    private Integer documentType;

    @Column(name = "storage_path")
    private Integer storagePath;

    @Column
    private String title;

    @Column
    private String content;

    @ElementCollection
    @CollectionTable(name = "document_tags", joinColumns = @JoinColumn(name = "document_id"))
    @Column(name = "tag")
    private List<Integer> tags; // @ElementCollection is used to indicate that tags is a collection of values that should be stored in a separate table (document_tags)
                                // The @CollectionTable annotation is used to specify the name of the table for the collection, and @Column(name = "tag") is used to specify the name of the column in the collection table where each element of the tags list will be stored.
    @Column
    private OffsetDateTime created;

    @Column(name = "created_date")
    private OffsetDateTime createdDate;

    @Column
    private OffsetDateTime modified;

    @Column
    private OffsetDateTime added;

    @Column(name = "archive_serial_number")
    private String archiveSerialNumber;

    @Column(name = "original_file_name")
    private String originalFileName;

    @Column(name = "archived_file_name")
    private String archivedFileName;
}

package org.openapitools.persistence.entities;

import java.time.OffsetDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@Entity
public class CorrespondentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "native")

    private Long id;

    @Column
    private String slug;

    @Column
    private String name;

    @Column
    private String match;

    @Column
    private Long matchingAlgorithm;

    @Column
    private Boolean isInsensitive;

    @Column
    private Long documentCount;
    @Column
    private OffsetDateTime lastCorrespondence;

}

package org.openapitools.persistence.repositories;

import org.openapitools.persistence.entities.NewDocumentTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewDocumentTypeRepository  extends JpaRepository<NewDocumentTypeEntity, Long> {
}

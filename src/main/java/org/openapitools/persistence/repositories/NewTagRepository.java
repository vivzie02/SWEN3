package org.openapitools.persistence.repositories;

import org.openapitools.persistence.entities.NewTagEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewTagRepository extends JpaRepository<NewTagEntity, Long> {
}

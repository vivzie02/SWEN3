package org.openapitools.persistence.repositories;

import org.openapitools.persistence.entities.NewCorrespondentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewCorrespondentRepository  extends JpaRepository<NewCorrespondentEntity, Long> {
}

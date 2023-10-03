package org.openapitools.services.mapper;

import org.mapstruct.Mapper;
import org.openapitools.persistence.entities.CorrespondentEntity;
import org.openapitools.persistence.entities.DocTagEntity;
import org.openapitools.services.model.Correspondent;
import org.openapitools.services.model.DocTag;

@Mapper
public interface CorrespondentMapper {
    Correspondent EntityToDto(CorrespondentEntity correspondentEntity);
    CorrespondentEntity dtoToDEntity(Correspondent correspondent);
}

package org.openapitools.services.mapper;

import org.openapitools.services.model.DocTag;
import org.openapitools.persistence.entities.DocTagEntity;
import org.mapstruct.Mapper;

@Mapper
public interface DocTagMapper {
    DocTag EntityToDto(DocTagEntity docTagEntity);
    DocTagEntity dtoToDEntity(DocTag docTagDTO);
}

package org.openapitools.services.mapper;

import org.mapstruct.Mapper;
import org.openapitools.persistence.entities.NewDocumentTypeEntity;
import org.openapitools.services.model.NewDocumentType;
@Mapper
public interface NewDocumentTypeMapper {
    NewDocumentType EntityToDto(NewDocumentTypeEntity newDocumentTypeEntity);
    NewDocumentTypeEntity dtoToEntity(NewDocumentType newDocumentType);
}

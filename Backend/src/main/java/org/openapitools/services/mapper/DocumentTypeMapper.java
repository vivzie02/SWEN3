package org.openapitools.services.mapper;

import org.mapstruct.Mapper;
import org.openapitools.persistence.entities.DocumentEntity;
import org.openapitools.persistence.entities.DocumentTypeEntity;
import org.openapitools.services.model.Document;
import org.openapitools.services.model.DocumentType;
@Mapper
public interface DocumentTypeMapper {
    DocumentType EntityToDto(DocumentTypeEntity documentTypeEntity);
    DocumentTypeEntity dtoToDEntity(DocumentType documentType);
}

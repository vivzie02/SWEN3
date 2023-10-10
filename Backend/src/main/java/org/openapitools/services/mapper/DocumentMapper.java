package org.openapitools.services.mapper;

import org.mapstruct.Mapper;
import org.openapitools.persistence.entities.DocTagEntity;
import org.openapitools.persistence.entities.DocumentEntity;
import org.openapitools.services.model.DocTag;
import org.openapitools.services.model.Document;

@Mapper
public interface DocumentMapper {
    Document EntityToDto(DocumentEntity documentEntity);
    DocumentEntity dtoToDEntity(Document document);
}

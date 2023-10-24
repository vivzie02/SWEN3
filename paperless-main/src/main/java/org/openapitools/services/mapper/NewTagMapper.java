package org.openapitools.services.mapper;

import org.mapstruct.Mapper;
import org.openapitools.persistence.entities.NewTagEntity;
import org.openapitools.services.model.NewTag;
@Mapper
public interface NewTagMapper {
    NewTag EntityToDto(NewTagEntity newTagEntity);
    NewTagEntity dtoToEntity(NewTag newTag);
}

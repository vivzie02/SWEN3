package org.openapitools.services.mapper;

import org.mapstruct.Mapper;
import org.openapitools.persistence.entities.NewCorrespondentEntity;
import org.openapitools.services.model.NewCorrespondent;
@Mapper
public interface NewCorrespondentMapper {
    NewCorrespondent entityToDto(NewCorrespondentEntity newCorrespondentEntity);
    NewCorrespondentEntity dtoToEntity(NewCorrespondent newCorrespondent);
}

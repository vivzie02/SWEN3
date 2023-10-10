package org.openapitools.services.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.openapitools.persistence.entities.UserInfoEntity;
import org.openapitools.services.model.UserInfo;

@Mapper
public interface UserInfoMapper {

    UserInfoMapper INSTANCE = Mappers.getMapper(UserInfoMapper.class);

    @Mapping(target = "id", ignore = true)
    UserInfoEntity dtoToEntity(UserInfo userInfo);

    UserInfo entityToDto(UserInfoEntity userInfoEntity);
}

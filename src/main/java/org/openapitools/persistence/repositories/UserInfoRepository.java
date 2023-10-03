package org.openapitools.persistence.repositories;

import org.openapitools.persistence.entities.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserInfoRepository extends JpaRepository<UserInfoEntity, Long>{
}

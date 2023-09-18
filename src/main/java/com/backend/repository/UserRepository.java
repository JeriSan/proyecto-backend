package com.backend.repository;

import com.backend.entity.UserEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
    @Modifying
    @Query("Update UserEntity u set u.username = :username, u.password = :password where u.id = :id")
    void update(Long id, String username, String password);
}

package com.amalitech.intermediate_lab3.repository;

import com.amalitech.intermediate_lab3.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByUsername(String username);
}

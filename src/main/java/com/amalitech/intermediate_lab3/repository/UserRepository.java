package com.amalitech.intermediate_lab3.repository;

import com.amalitech.intermediate_lab3.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
    Users findByUsername(String username);
}

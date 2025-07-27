package com.example.demo.repository;

import com.example.demo.model.User;

import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, UUID> {
    // Additional query methods can be defined here if needed
    public Optional<User> findByEmail(String email);

}

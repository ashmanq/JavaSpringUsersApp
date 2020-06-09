package com.codeclan.example.JavaSpringApp.repositories;

import com.codeclan.example.JavaSpringApp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

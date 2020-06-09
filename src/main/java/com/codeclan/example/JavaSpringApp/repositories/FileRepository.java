package com.codeclan.example.JavaSpringApp.repositories;

import com.codeclan.example.JavaSpringApp.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}

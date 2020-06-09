package com.codeclan.example.JavaSpringApp.controllers;

import com.codeclan.example.JavaSpringApp.models.File;
import com.codeclan.example.JavaSpringApp.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FileController {
    @Autowired
    private FileRepository fileRepository;

    // Index Route
    @GetMapping(value = "/files")
    public ResponseEntity<List<File>> getFiles() {
        return new ResponseEntity<>(fileRepository.findAll(), HttpStatus.OK);
    }

    // Show Route
    @GetMapping(value = "/files/{id}")
    public ResponseEntity getFile(@PathVariable Long id) {
        return new ResponseEntity<>(fileRepository.findById(id), HttpStatus.OK);
    }

    // Create Route
    @PostMapping(value = "/files")
    public ResponseEntity addFile(@RequestBody File file) {
        fileRepository.save(file); // mutates the file object to include id once saved
        return new ResponseEntity<>(file, HttpStatus.CREATED); // returns the mutated file including id
    }
}

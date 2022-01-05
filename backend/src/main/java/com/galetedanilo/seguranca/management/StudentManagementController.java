package com.galetedanilo.seguranca.management;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/management/api/v1/students")
public class StudentManagementController {

    @GetMapping
    public ResponseEntity<String> findAllStudents() {
        return new ResponseEntity<>("Alunos", HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<String> findStudentByPrimaryKey(@PathVariable Long id) {
        return new ResponseEntity<>("Get por id", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> registeNewStudent() {
        return new ResponseEntity<>("Deu", HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<String> updateStudent(@PathVariable Long id) {
        return new ResponseEntity<>("Update", HttpStatus.OK);
    }
}

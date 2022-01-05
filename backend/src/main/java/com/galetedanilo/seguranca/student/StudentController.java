package com.galetedanilo.seguranca.student;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/students")
public class StudentController {

    @GetMapping(value = "/{id}")
    public ResponseEntity<String> findStudentByPrimaryKey(@PathVariable Long id) {
        return new ResponseEntity<>("dgfh", HttpStatus.OK);
    }

}

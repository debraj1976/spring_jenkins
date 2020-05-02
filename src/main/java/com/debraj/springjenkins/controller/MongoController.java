package com.debraj.springjenkins.controller;

import com.debraj.springjenkins.domain.Student;
import com.debraj.springjenkins.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MongoController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/get")
    public List<Student> get() {
        return studentRepository.findAll();
    }
}

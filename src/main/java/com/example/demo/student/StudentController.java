package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {
    // Student service
    private final StudentService studentService;

    // Constructor for student service
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // Get method map
    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
}
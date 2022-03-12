package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    // Get students method
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1l,
                        "Mariam",
                        "mariam.jamal@gmail.com",
                        LocalDate.of(2000, Month.APRIL, 5),
                        21
                )
        );
    }
}

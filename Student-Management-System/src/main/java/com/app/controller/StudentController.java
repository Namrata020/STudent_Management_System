package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.User;
import com.app.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {
	@Autowired
    private StudentService studentService;

    @PostMapping
    public User createStudent(@RequestBody User student) {
        return studentService.addStudent(student);
    }

    @GetMapping
    public List<User> getAllStudents() {
        return studentService.getAllStudents();
    }
}

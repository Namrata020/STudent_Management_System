package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.User;
import com.app.entities.Subject;
import com.app.service.SubjectService;

@RestController
@RequestMapping("/api/subjects")
public class SubjectController {
	@Autowired
    private SubjectService subjectService;

	@PostMapping
    public Subject createStudent(@RequestBody Subject subject) {
        return subjectService.addSubject(subject);
    }
	
    @GetMapping
    public List<Subject> getAllSubjects() {
        return subjectService.getAllSubjects();
    }
}

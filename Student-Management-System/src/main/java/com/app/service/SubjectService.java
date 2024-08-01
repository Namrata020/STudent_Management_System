package com.app.service;

import java.util.List;

import com.app.entities.Student;
import com.app.entities.Subject;

public interface SubjectService {
	public List<Student> getAllSubjects();
	public Student addSubject(Subject subject);
}

package com.app.service;

import java.util.List;

import com.app.entities.Student;

public interface StudentService {
	public List<Student> getAllStudents();
	public Student addStudent(Student student);
}

package com.app.service;

import java.util.List;

import com.app.entities.User;

public interface StudentService {
	public List<User> getAllStudents();
	public User addStudent(User student);
}

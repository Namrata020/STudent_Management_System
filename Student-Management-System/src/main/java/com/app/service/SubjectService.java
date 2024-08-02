package com.app.service;

import java.util.List;

import com.app.entities.User;
import com.app.entities.Subject;

public interface SubjectService {
	public List<Subject> getAllSubjects();
	public Subject addSubject(Subject subject);
}

package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.SubjectDao;
import com.app.entities.Subject;

@Service
public class SubjectServiceImpl implements SubjectService{

	@Autowired
	private SubjectDao subjectDao;
	
	@Override
	public List<Subject> getAllSubjects() {
		return subjectDao.findAll();
	}

	@Override
	public Subject addSubject(Subject subject) {
		return subjectDao.save(subject);
	}

}

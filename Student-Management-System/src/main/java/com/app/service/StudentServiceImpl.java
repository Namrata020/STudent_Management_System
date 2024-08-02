package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.UserDao;
import com.app.entities.User;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
    private UserDao studentDao;
	
	@Override
	public List<User> getAllStudents() {
		return studentDao.findAll();
	}

	@Override
	public User addStudent(User student) {
		return studentDao.save(student);
	}

}

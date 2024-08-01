package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.*;

public interface StudentDao extends JpaRepository<Student,Long>{

}

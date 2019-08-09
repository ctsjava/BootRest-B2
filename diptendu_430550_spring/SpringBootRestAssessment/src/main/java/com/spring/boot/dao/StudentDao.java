package com.spring.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.entity.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {

}

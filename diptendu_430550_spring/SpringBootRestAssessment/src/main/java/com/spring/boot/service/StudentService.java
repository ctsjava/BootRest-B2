package com.spring.boot.service;

import java.util.List;

import com.spring.boot.entity.Student;

public interface StudentService {

	void saveStudent(Student student);

	List<Student> findAllStudent();

	Student findStudentById(int admissionId);

	void deleteStudent(Student student);

}
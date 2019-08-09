package com.spring.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.dao.StudentDao;
import com.spring.boot.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentDao studentDao;

	@Override
	public void saveStudent(Student student) {
		studentDao.save(student);
	}

	@Override
	public List<Student> findAllStudent() {
		return studentDao.findAll();
	}

	@Override
	public Student findStudentById(int admissionId) {
		return studentDao.findById(admissionId).orElse(null);
	}
	
	@Override
	public void deleteStudent(Student student) {
		studentDao.delete(student);
	}

}

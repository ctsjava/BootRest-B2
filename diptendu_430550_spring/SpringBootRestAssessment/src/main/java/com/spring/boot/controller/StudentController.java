package com.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.entity.Student;
import com.spring.boot.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {
	
	@Autowired
	StudentService ss;
	
	@GetMapping
	public ResponseEntity<?> getStudents(){
		
		return ResponseEntity.ok(ss.findAllStudent());
	}
	
	@GetMapping("{admissionId}")
	public ResponseEntity<?> getProduct(@PathVariable("admissionId") int admissionId){
		
		Student student = ss.findStudentById(admissionId);
		if(student != null) {
			return ResponseEntity.ok(student);
		}
		return ResponseEntity.badRequest().body("Student id " + admissionId + " not found!");
	}
	
	@PostMapping
	public ResponseEntity<?> saveStudent(@RequestBody Student student){
		ss.saveStudent(student);
		return ResponseEntity.ok(ss.findAllStudent());
	}
	
	@PutMapping
	public ResponseEntity<?> updateStudent(@RequestBody Student student){
		ss.saveStudent(student);
		return ResponseEntity.ok(ss.findAllStudent());
	}
	
	@DeleteMapping("{admissionId}")
	public ResponseEntity<?> deleteProducts(@PathVariable("admissionId") int admissionId){
		Student student = ss.findStudentById(admissionId);
		if(student != null) {
			ss.deleteStudent(student);
			return ResponseEntity.ok(student);
		}
		return ResponseEntity.badRequest().body("Student id " + admissionId + " not found!");
	}

}

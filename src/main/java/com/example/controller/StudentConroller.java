package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.service.StudentService;

@RestController
public class StudentConroller {

	@Autowired
	private StudentService studentService;

	@PostMapping("/student")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
		Student studentResponse = studentService.save(student);

		ResponseEntity<Student> entity = new ResponseEntity<Student>(studentResponse, HttpStatus.OK);
		return entity;

	}
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudents() {
		List<Student> studentResponse = studentService.getAllStudents();

		ResponseEntity<List<Student>> entity = new ResponseEntity<List<Student>>(studentResponse, HttpStatus.OK);
		return entity;

	}

}

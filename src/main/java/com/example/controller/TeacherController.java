package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Teacher;
import com.example.service.TeacherService;

@RestController
public class TeacherController {
	@Autowired
	private TeacherService teacherService;

	@PostMapping("/teacher")
	public ResponseEntity<Teacher> saveTeacher(@RequestBody Teacher teacher) {
		Teacher teacherResponse = teacherService.save(teacher);

		ResponseEntity<Teacher> entity = new ResponseEntity<Teacher>(teacherResponse, HttpStatus.OK);
		return entity;

	}

	@GetMapping("/teachers")
	public ResponseEntity<List<Teacher>> getAllTeachers() {
		List<Teacher> teacherResponse = teacherService.getAllTeachers();

		ResponseEntity<List<Teacher>> entity = new ResponseEntity<List<Teacher>>(teacherResponse, HttpStatus.OK);
		return entity;

	}
}

package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.CourseStudent;
import com.example.model.StudentMarksResponse;
import com.example.service.CourseStudentService;

@RestController
public class CourseStudentController {
	@Autowired
	private CourseStudentService courseStudentService;

	@PostMapping("/courseStudent")
	public ResponseEntity<CourseStudent> save(@RequestBody CourseStudent student) {
		CourseStudent courseStudentResponse = courseStudentService.save(student);

		ResponseEntity<CourseStudent> entity = new ResponseEntity<CourseStudent>(courseStudentResponse, HttpStatus.OK);
		return entity;

	}

	@GetMapping(value = "/studentMarks")
	public ResponseEntity<List<Object>> getStudentMarks(
			@RequestParam(name = "courseId", required = true) int courseId) {
		List<Object> courses = courseStudentService.findStudentMarksByCourseId(courseId);

		ResponseEntity<List<Object>> entity = new ResponseEntity<List<Object>>(courses,
				HttpStatus.OK);
		return entity;

	}
	
	@GetMapping(value = "/coursesAndMarks")
	public ResponseEntity<List<Object>> getCoursesByStudentId(
			@RequestParam(name = "studentId", required = true) int studentId) {
		List<Object> coursesAndMarks = courseStudentService.getCoursesByStudentId(studentId);

		ResponseEntity<List<Object>> entity = new ResponseEntity<List<Object>>(coursesAndMarks,
				HttpStatus.OK);
		return entity;

	}
}

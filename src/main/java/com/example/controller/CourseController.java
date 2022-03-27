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

import com.example.model.Course;
import com.example.service.CourseService;
import com.example.service.CourseServiceI;

@RestController
public class CourseController {

	@Autowired
	private CourseServiceI courseService;
	
	@Autowired
	private List<CourseServiceI> courseServices;

	@PostMapping("/course")
	public ResponseEntity<Course> saveCourse(@RequestBody Course request) {
		Course course = courseService.save(request);

		ResponseEntity<Course> entity = new ResponseEntity<Course>(course, HttpStatus.OK);
		return entity;

	}

	@GetMapping(value = "/courses")
	public ResponseEntity<List<Course>> getAllCourses() {
		List<Course> courses = courseService.getAllCourses();

		ResponseEntity<List<Course>> entity = new ResponseEntity<List<Course>>(courses, HttpStatus.OK);
		
		for(CourseServiceI courseService : courseServices) {
			courseService.getAllCourses();
		}
		
		return entity;

	}
	
	@GetMapping(value = "/CoursesByTeacher")
	public ResponseEntity<List<Course>> getCoursesByTeacherId(@RequestParam(name = "teacherId", required = true) int teacherId) {
		List<Course> courses = courseService.getCoursesByTeacherId(teacherId);

		ResponseEntity<List<Course>> entity = new ResponseEntity<List<Course>>(courses, HttpStatus.OK);
		return entity;

	}
		
}

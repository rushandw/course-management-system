package com.example.service;

import java.util.List;

import com.example.model.Course;

public interface CourseServiceI {
	Course save(Course course);
	List<Course> getAllCourses();	
	List<Course> getCoursesByTeacherId(int teacherId);
}

package com.example.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.model.Course;
import com.example.repository.CourseRepository;

@Component
public class CourseDao {

	@Autowired
	private CourseRepository courseRepository;
	
	public Course save(Course course) {
		return courseRepository.save(course);
	}
	
	public List<Course> getAllCourses(){
		return courseRepository.findAll();
	}
	
	public List<Course> getCoursesByTeacherId(int teacherId){
		return courseRepository.findCourseByTeacherId(teacherId);
	}
}

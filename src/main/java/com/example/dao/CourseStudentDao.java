package com.example.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.model.CourseStudent;
import com.example.model.StudentMarksResponse;
import com.example.repository.CourseStudentRepository;

@Component
public class CourseStudentDao {
	@Autowired
	private CourseStudentRepository courseStudentRepository;

	public CourseStudent save(CourseStudent courseStudent) {
		return courseStudentRepository.save(courseStudent);
	}
	
	public List<Object> findStudentMarksByCourseId(int courseId) {
		return courseStudentRepository.getstudentMarks(courseId);
	}

	public List<Object> getCoursesByStudentId(int studentId) {
		return courseStudentRepository.getCoursesByStudentId(studentId);
	}
}

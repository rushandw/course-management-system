package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CourseStudentDao;
import com.example.model.CourseStudent;
import com.example.model.StudentMarksResponse;

@Service
public class CourseStudentService {
	@Autowired
	private CourseStudentDao courseStudentDao;

	public CourseStudent save(CourseStudent course) {
		return courseStudentDao.save(course);
	}
	
	public List<Object> findStudentMarksByCourseId(int courseId) {
		return courseStudentDao.findStudentMarksByCourseId(courseId);
	}
	
	public List<Object> getCoursesByStudentId(int studentId) {
		return courseStudentDao.getCoursesByStudentId(studentId);
	}
}

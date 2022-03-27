package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CourseDao;
import com.example.model.Course;


	
	@Service
	public class CourseServiceTwo implements CourseServiceI{

		@Autowired
		private CourseDao courseDao;

		public Course save(Course course) {
			return courseDao.save(course);
		}
		
		public List<Course> getAllCourses(){
			System.out.println("two");
			return null;
		}
		
		public List<Course> getCoursesByTeacherId(int teacherId){
			return courseDao.getCoursesByTeacherId(teacherId);
		}

	}



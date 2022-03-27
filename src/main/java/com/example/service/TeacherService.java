package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.TeacherDao;
import com.example.model.Teacher;

@Service
public class TeacherService {
	@Autowired
	private TeacherDao teacherDao;

	public Teacher save(Teacher teacher) {

		return teacherDao.save(teacher);
	}
	
	public List<Teacher> getAllTeachers() {
		return teacherDao.getAllTeachers();
	}
}

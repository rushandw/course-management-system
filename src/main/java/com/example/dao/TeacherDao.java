package com.example.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.model.Teacher;
import com.example.repository.TeacherRepository;

@Component
public class TeacherDao {
	@Autowired
	private TeacherRepository teacherRepository;

	public Teacher save(Teacher teacher) {
		return teacherRepository.save(teacher);
	}

	public List<Teacher> getAllTeachers() {
		return teacherRepository.findAll();
	}
}

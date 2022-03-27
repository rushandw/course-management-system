package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.StudentDao;
import com.example.model.Student;

@Service
public class StudentService {
	@Autowired
	private StudentDao studentDao;

	public Student save(Student student) {

		return studentDao.save(student);
	}

	public List<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}
}

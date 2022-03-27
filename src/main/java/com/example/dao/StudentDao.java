package com.example.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.model.Student;
import com.example.repository.StudentRepository;

@Component
public class StudentDao {
	@Autowired
	private StudentRepository studentrepository;

	public Student save(Student student) {
		return studentrepository.save(student);
	}

	public List<Student> getAllStudents() {
		return studentrepository.findAll();
	}
}

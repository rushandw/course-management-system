package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

}

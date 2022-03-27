package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

	@Query(value = "select * from course where teacherId = :teacherId", nativeQuery = true)
	public List<Course> findCourseByTeacherId(@Param("teacherId") int teacherId);

}

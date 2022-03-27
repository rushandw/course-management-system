package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.model.CourseStudent;

public interface CourseStudentRepository extends JpaRepository<CourseStudent, Integer> {

	@Query(value = "SELECT c.studentId,s.firstName,s.lastName,c.marksOne,c.marksTwo FROM sms.coursestudent c join sms.student s on c.studentId = s.id where c.courseId = :courseIdParam", nativeQuery = true)
	public List<Object> getstudentMarks(@Param("courseIdParam") int courseId);

	@Query(value = "SELECT cs.studentId,c.name,c.startDate,c.endDate,c.price,cs.marksOne,cs.marksTwo  FROM sms.coursestudent cs join sms.course c on cs.courseId = c.id where cs.studentId = :studentIdParam", nativeQuery = true)
	public List<Object> getCoursesByStudentId(@Param("studentIdParam") int studentId);

}

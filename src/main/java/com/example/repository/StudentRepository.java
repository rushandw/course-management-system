package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	 /*  @Query(value="select * from author a where a.first_name= :firstName", nativeQuery=true)
	    List<Author> getStudentsByCourseId(int courseId);
*/
}

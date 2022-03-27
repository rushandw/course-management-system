package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "coursestudent")
public class CourseStudent {

	@Id
	private int id;
	private int courseId;
	private int studentId;
	private String marksOne;
	private String marksTwo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getMarksOne() {
		return marksOne;
	}

	public void setMarksOne(String marksOne) {
		this.marksOne = marksOne;
	}

	public String getMarksTwo() {
		return marksTwo;
	}

	public void setMarksTwo(String marksTwo) {
		this.marksTwo = marksTwo;
	}

}

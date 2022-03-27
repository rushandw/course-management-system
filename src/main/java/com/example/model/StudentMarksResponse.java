package com.example.model;

import javax.persistence.Column;

public class StudentMarksResponse {

	public StudentMarksResponse(String studentId, String firstName, String lastName, String marksOne, String marksTwo) {

		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.marksOne = marksOne;
		this.marksTwo = marksTwo;
	}

	private String studentId;
	private String firstName;
	private String lastName;
	private String marksOne;
	private String marksTwo;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

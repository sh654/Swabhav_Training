package com.techlabs.model;

public class Student {

	private IStudentService studentService;
	
	public Student(IStudentService studentService) {
		// TODO Auto-generated constructor stub
		this.studentService = studentService;
	}

	public double getPercentage() {
		return (studentService.getMarks()/studentService.getNumberOfSubjets());
	}
	
}

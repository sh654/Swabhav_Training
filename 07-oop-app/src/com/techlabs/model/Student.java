package com.techlabs.model;

public class Student {

	public int rollNo;
	public String studentName;
	public int age;
	public float percentage;
	
	public Student() {
		rollNo = 10;
		studentName = "Shivam Upadhyay";
		age = 16;
		percentage = 67.89f;
	}
	
	public Student(int rollNo, String studentName, int age, float percentage) {
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.age = age;
		this.percentage = percentage;
	}
	public void setRollNo(int r) {
		rollNo = r;
	}
	public void setStudentName(String s) {
		studentName = s;
	}
	
	public void setAge(int a) {
		age = a;
	}
	public void setPercentage(float p) {
		percentage = p;
	}
	
	public int getRollNO() {
		return rollNo;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public int getAge() {
		return age;
	}
	
	public float getPercentage() {
		return percentage;
	}
}

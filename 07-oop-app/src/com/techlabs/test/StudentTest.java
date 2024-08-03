package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Student student1 = new Student();
		System.out.println(student1.getRollNO());
		System.out.println(student1.getStudentName());
		System.out.println(student1.getAge());
		System.out.println(student1.getPercentage());
		
		
		System.out.println("Enter Roll No: ");
		int rollNo = scanner.nextInt();
		
		System.out.println("Enter Student Name: ");
		String studentName = scanner.next();
		System.out.println("Enter Age: ");
		int age = scanner.nextInt();
		System.out.println("Enter Percentage: ");
		float percentage = scanner.nextFloat();
		Student student2 = new Student(rollNo, studentName, age, percentage);
		
//		student.setRollNo(rollNo);
//		student.setStudentName(studentName);
//		student.setAge(age);
//		student.setPercentage(percentage);
//		
		System.out.println("Roll_No: "+student2.getRollNO());
		System.out.println("Name: "+student2.getStudentName());
		System.out.println("Age: "+student2.getAge());
		System.out.println("Percentage: "+student2.getPercentage());

	}

}

package com.techlabs.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.techlabs.model.IStudentService;
import com.techlabs.model.Student;

class StudentTest {

	private IStudentService studentService;
	private Student student;
	
	@BeforeEach
	void Init() {
		studentService = Mockito.mock(IStudentService.class);
		student = new Student(studentService);
	}
	
	@Test
	void testGetPercentage() {
		Mockito.when(studentService.getMarks()).thenReturn(650);
		Mockito.when(studentService.getNumberOfSubjets()).thenReturn(10);
		
		assertEquals(65, student.getPercentage());
	}

}

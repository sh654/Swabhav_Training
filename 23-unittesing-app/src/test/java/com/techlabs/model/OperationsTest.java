package com.techlabs.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperationsTest {
	Operations operation;
	
	@BeforeEach
	void init() {
		operation = new Operations();
	}
	
	@AfterEach
	void status(){
		System.out.println("Test Executed");
	}
	
	@Test
	void testAddition() {
		int actual = operation.addition(5, 5);
		int expected = 10;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void testSubtraction() {
		
		assertEquals(20, operation.subtraction(30, 10));
		assertEquals(20, operation.subtraction(40, 20));
	}
	@Test
	void testMultiplication() {
		assertEquals(45, operation.multiplication(9, 5));
	}
	@Test
	void testDivision() {
		assertEquals(4, operation.division(8, 2));
		assertThrows(ArithmeticException.class, ()-> operation.division(6, 0));
	}
	@Test
	void testModulus() {
		assertEquals(0, operation.modulus(4, 2));
	}

}

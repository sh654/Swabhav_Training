package com.techlabs.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AreaCalculatorTest {

	AreaCalculator calculator;
	
	@BeforeEach
	void init() {
		calculator = new AreaCalculator();
	}
	
	@AfterEach
	void status() {
		System.out.println("Calculator Fine");
	}
	
	@Test
	void testCalculateAreaOfCircle() {
		assertEquals(78.5, calculator.calculateAreaOfCircle(5));
	}
	
	@Test
	void testCalculateAreaOfRectangle() {
		assertEquals(25, calculator.calculateAreaOfRectangle(5, 5));
	}
	
	@Test
	void testCalculateAreaOfSquare() {
		assertEquals(36, calculator.calculateAreaOfSquare(6));
	}
	
	@Test
	void testCalculateAreaOfTriangle() {
		assertEquals(12, calculator.calculateAreaOfTriangle(6, 4));
	}
	
}

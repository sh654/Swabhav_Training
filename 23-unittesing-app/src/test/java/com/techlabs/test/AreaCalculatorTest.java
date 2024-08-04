package com.techlabs.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.model.AreaCalculator;

class AreaCalculatorTest {

	AreaCalculator calculator;
	
	@Test
	void testCalculateAreaOfCircle() {
		assertEquals(78.5, calculator.calculateAreaOfCircle(5));
	}

	void testCalculateAreaOfRecatngle() {
		assertEquals(25, calculator.calculateAreaOfRectangle(5, 5));
	}
	

}

package com.techlabs.model;

public class AreaCalculator {

	public double calculateAreaOfCircle(int radius) {
		return 3.14 * radius *radius;
	}
	
	public double calculateAreaOfRectangle(int length, int breadth) {
		return length * breadth;
	}
	
	double calculateAreaOfSquare(int side) {
		return Math.pow(side, 2);
	}
	
	double calculateAreaOfTriangle(int height, int base) {
		return 0.5 * height * base;
	}
}

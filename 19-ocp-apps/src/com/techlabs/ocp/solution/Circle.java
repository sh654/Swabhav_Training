package com.techlabs.ocp.solution;

public class Circle implements Shape{

	private int radius;
	
	
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}



	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 3.142 * radius * radius;
	}

}

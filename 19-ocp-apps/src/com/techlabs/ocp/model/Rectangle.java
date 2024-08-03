package com.techlabs.ocp.model;

import com.techlabs.ocp.solution.Shape;

public class Rectangle implements Shape {
	
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return width * height;
	}
}

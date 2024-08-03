package com.techlabs.model;

public class Triangle implements shape{

	int height;
	int base;
	
	public Triangle(int height, int base) {
		super();
		this.height = height;
		this.base = base;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of triangle "+(1/2 *(base*height)));
	}

}

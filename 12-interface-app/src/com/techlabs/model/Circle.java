package com.techlabs.model;

public class Circle implements shape{

	private int radius;
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of circle "+ (3.142*radius*radius));
	}

}

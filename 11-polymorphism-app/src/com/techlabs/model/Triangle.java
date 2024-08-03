package com.techlabs.model;

public class Triangle extends shape{

	private int base;
	private int height;
	
	
	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}


	@Override
	public
	void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of Rectangle is :"+ (1/2 * base * height));
	}
	
	
}

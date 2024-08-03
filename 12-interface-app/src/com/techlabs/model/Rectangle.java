package com.techlabs.model;

public class Rectangle implements shape{

	int length ;
	int breadth;
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		
		System.out.println("Area of rectangle : "+(length*breadth));
	}

}

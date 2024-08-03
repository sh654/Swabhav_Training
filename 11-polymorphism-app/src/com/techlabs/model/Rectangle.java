package com.techlabs.model;

public class Rectangle extends shape{

	private int length ;
	private int breadth;
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public
	void  area() {
		// TODO Auto-generated method stub
		System.out.println("Area of rectangle is: "+(length * breadth));
	}

}

package com.techlabs.model;

public class Rectangle {
	private int height;
	private int width;
	 
	
	public Rectangle() {
	height =10;
	width = 20;
	}
	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}
	public void setHeight(int h) {
		height = h;
	}
	
	public void setWidth(int w) {
		width = w;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int area ;
	
	public int area() {
		area = height*width;
		return area;
	}

	
	
	
	
}

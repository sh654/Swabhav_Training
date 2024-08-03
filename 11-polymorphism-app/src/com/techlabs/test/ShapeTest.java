package com.techlabs.test;

import com.techlabs.model.shape;

import com.techlabs.model.Circle;
import com.techlabs.model.Rectangle;
import com.techlabs.model.Triangle;

public class ShapeTest {
	
	public static void main(String args[]) {
		
		shape circle = new Circle(10);
		circle.area();
		shape rectangle = new Rectangle(10, 20);
		rectangle.area();
		shape triangle = new Triangle(11, 22);
		triangle.area();
		
		shape shape = new Circle(10);
		shape.area();
		shape = new Rectangle(10, 20);
		shape.area();
		shape = new Triangle(11, 22);
		shape.area();
	}
}

package com.techlabs.test;

import com.techlabs.model.Circle;
import com.techlabs.model.Rectangle;
import com.techlabs.model.Triangle;
import com.techlabs.model.shape;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle circle = new Circle(25);
		circle.area();
		
		shape rectangle = new Rectangle(10, 20);
		rectangle.area();
		
		shape triangle = new Triangle(10, 20);
		triangle.area();
	}

}

package com.techlabs.ocp.test;

import com.techlabs.ocp.model.Rectangle;
import com.techlabs.ocp.solution.Circle;
import com.techlabs.ocp.solution.Shape;

public class AreaCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape shape = new Rectangle(4,5);
		System.out.println(shape.area());
		Shape circle = new Circle(7);
		System.out.println(circle.area());
		
	}

}

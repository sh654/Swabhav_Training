package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Rectangle;
public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println(rectangle.area());
		
		Rectangle rectangle1 = new Rectangle();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter height of rectangle");
		int height = scanner.nextInt();
		
		System.out.println("Enter width of rectangle");
		int width = scanner.nextInt();
		System.out.println("height of rectangle: "+rectangle1.getHeight());
		System.out.println("height of rectangle: "+rectangle1.getWidth());
		System.out.println(rectangle1.area()); 
		
		
	}

}


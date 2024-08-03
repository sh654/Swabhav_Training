package com.techlabs.test;

import java.util.Scanner;
import com.techlabs.model.Box;

public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Box Details for box : "); 
		
		Scanner scanner = new Scanner(System.in);
		
		Box box1 = new Box();
		System.out.println("Heigth: "+box1.getHeight());
		System.out.println("Width: "+box1.getWidth());
		System.out.println("Depth: "+box1.getDepth());
		System.out.println("Enter value for width: ");
		int width = scanner.nextInt();
//		box.setWidth(width); 
		System.out.println("Enter value for Height: ");
		int height = scanner.nextInt();
//		box.setHeight(height);
		System.out.println("Enter value for depth: ");
		int depth = scanner.nextInt();
//		box.setDepth(depth);
		
		Box box2 = new Box( height, width,  depth);
		System.out.println("Heigth: "+box2.getHeight());
		System.out.println("Width: "+box2.getWidth());
		System.out.println("Depth: "+box2.getDepth());

		
		
	}

}

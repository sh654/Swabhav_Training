package com.operators.model;

import java.util.Scanner;
public class Logical {

	public static void main(String args[]) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter value of first operand: ");
		boolean x = obj.nextBoolean();
		System.out.println("Enter value of second operand: ");
	    boolean y = obj.nextBoolean();
	      
	    System.out.println("x && y: " + (x && y)); //Logical AND
	    System.out.println("x || y: " + (x || y)); //Logical OR
	    System.out.println("!x: " + (!x)); //Logical NOT
	}
}

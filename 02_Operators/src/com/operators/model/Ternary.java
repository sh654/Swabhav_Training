package com.operators.model;

import java.util.Scanner;

public class Ternary {
public static void main(String args[]) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter value of num1: ");
		int number1 = obj.nextInt();
		System.out.println("Enter value of num2: ");
		int number2 = obj.nextInt();
		System.out.println("Enter value of num3: ");
		int number3 = obj.nextInt();
		
		
		int large = largestofnum(number1, number2, number3);
		System.out.println("Largest of " + number1  + "," + number2 + "," + number3 +" is :" + large);
		
	}
	
	static int largestofnum(int a, int b, int c) {

	    return ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
	}
}

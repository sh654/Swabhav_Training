package com.techlabs.selection.test;

import java.util.*;

public class MaximumOfTwoNumbers {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter value of number1 : ");
		int number1 = scanner.nextInt();
		
		System.out.println("Enter value of number2 : ");
		int number2 = scanner.nextInt();
		
		maximumOfTwo(number1, number2);
		
	}
	
	public static int maximumOfTwo(int number1, int number2) {
		if(number1> number2) {
			System.out.println("Entered value " +number1+ " is greater than "+ number2);
			return number1;
		} else {
			System.out.println("Entered value " +number2+ " is greater than "+ number1);
			return number2;
		}
	}
}

package com.operators.model;

import java.util.Scanner;
public class Arithmetic {
	
	public static void main(String args[]) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter value of number 1: ");
		int number1 = obj.nextInt();
		System.out.println("Enter value of number 1: ");
		int number2 = obj.nextInt();
		
		add(number1, number2);
		multiply(number1, number2);
	}
	
	static int add(int number1, int number2) {
		int addition = number1+number2;
		System.out.println("Addition of "+number1+" and "+number2+" is : "+addition);
		return addition;
	}
	
	static int multiply(int number1, int number2) {
		int multiply = number1 * number2;
		System.out.println("Multiplication of "+ number1+" and "+number2+" is: "+multiply);
		return multiply;
	}
}

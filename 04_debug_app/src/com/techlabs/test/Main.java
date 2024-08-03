package com.techlabs.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		
		int result = addition(number1, number2);
		System.out.println("Your Addition result is: "+ result);
		
		result =subtraction(number1,number2);
		System.out.println("Your Subtraction result is: "+ result);
		
		result =multiplication(number1,number2);
		System.out.println("Your multiplication result is: "+ result);
		
		result =division(number1,number2);
		System.out.println("Your division result is: "+ result);
		
	}
	
	private static int addition(int num1, int num2) {
		int addition = num1+num2;
		multiplication(num1, num2);
		return addition;
	}
	
	private static int subtraction(int num1, int num2) {
		int subtraction = num1-num2;
		division(num1, num2);
		return subtraction;
	}
	
	private static int multiplication(int num1, int num2) {
		int multiplication = num1*num2;
		return multiplication;
	}

	private static int division(int num1, int num2) {
		int division = num1/num2;
		return division;
	}

}

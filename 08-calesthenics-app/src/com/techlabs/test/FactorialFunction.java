package com.techlabs.test;

import java.util.Scanner;

public class FactorialFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int number =scanner.nextInt();
		
		int factorial = calculateFactorial(number);
		
		if(factorial == -1) {
			System.out.println("Can not calculate factorial of negative number");
			return;
		}
		System.out.println("Factorial : " +factorial);
	}

	private static int calculateFactorial(int number) {
		// TODO Auto-generated method stub
		
		if(number == 0)
			return 1;
		if(number < 0)
			return -1;
		
		int fact = 1;
		for(int i=1; i<=number; i++) 
			fact = fact * i;
		
		return fact;
	}

}

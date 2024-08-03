package com.techlabs.iterative.test;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter Number for factorial: ");
		int number = scanner.nextInt();
		
		
		System.out.println("Factorial : "+ factorial(number));
	}
	
	static int factorial(int number) {
		int fact = 1;
		for(int i=1; i<=number; i++) {
			fact = fact * i;
		}
		return fact;
	}
}

package com.techlabs.test;

import java.util.Scanner;

public class NoElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int number = scanner.nextInt();
		
		if(number%2 ==0) {
			System.out.println("Number is even");
			return; // for always using early exists
		} 
		
		System.out.println("Number is odd");
	}

}

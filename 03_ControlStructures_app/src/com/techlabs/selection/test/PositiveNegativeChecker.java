package com.techlabs.selection.test;

import java.util.*;
public class PositiveNegativeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter value of Number: ");
		
		int number = scanner.nextInt();
		
		if(number>=0) {
			System.out.println("Number is Positive");
		}
		else {
			System.out.println("Number is Negative");
		}
	}

}

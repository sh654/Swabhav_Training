package com.techlabs.iterative.test;

import java.util.Scanner;
public class SumDigitOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number =scanner.nextInt();
		int digit=0;
		int sum =0;
		while(number>0) {
			
			digit = number%10;
			sum = sum +digit;
			number = number /10;
			
		}
		System.out.println("Sum of the digits of the number is: "+sum);
	}

}

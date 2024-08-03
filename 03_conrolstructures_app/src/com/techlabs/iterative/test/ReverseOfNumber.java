package com.techlabs.iterative.test;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = scanner.nextInt();
		
		System.out.print("Reverse of your number: "+reverseOfNumber(number));
	}
	
	static int reverseOfNumber(int number) {
		int reverse =0;
		int remainder=0;
		while(number>0) {
			remainder = number%10;
			reverse = (reverse*10) + remainder;
			number = number /10;
		}
		return reverse;
	}

}

package com.techlabs.iterative.test;

import java.util.Scanner;
public class OddNumberPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		while( number<10) {
			if(number%2 !=0) {
			System.out.println("Odd Number is"+number);
			}
			number++;
		}
	}

}

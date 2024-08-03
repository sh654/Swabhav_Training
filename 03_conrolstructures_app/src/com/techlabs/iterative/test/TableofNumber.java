package com.techlabs.iterative.test;

import java.util.Scanner;

public class TableofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number =scanner.nextInt();
		System.out.print(tableOfNumber(number));
	}
	
	static int tableOfNumber(int number) {
		int result=0;
		for(int i=1; i<=10; i++) {
			result = i*number;
			System.out.println(result);
		}
		return result;
	}
}

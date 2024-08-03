package com.techlabs.iterative.test;

import java.util.Scanner;

public class SumByFor {
public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter number for sum: ");
	int number = scanner.nextInt();
	
	System.out.println("Sum of N numbers : "+ sumForN(number));
}

static int sumForN(int number) {
	int sum =0;
	for(int i=1; i<=number; i++) {
		sum = sum + i;
	}
	return sum;
}
}

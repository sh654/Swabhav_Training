package com.techlabs.test;

import java.util.Scanner;
public class PrimeNumber {

public static boolean isPrime(int number) {
	if(number<=1) {
		return false;
	}
	for(int i=2; i<=Math.sqrt(number); i++) {
		if(number%i==0) {
			return false; // for getting non prime
		}
	}
	
	return true; //Prime number 
}

public static void main(String args []) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter value of number: ");
	int number =scanner.nextInt();
	if(isPrime(number)) {
	System.out.println("Number prime is: "+number);
	
	} else {
		System.out.println("not Prime");
	}
	}
}

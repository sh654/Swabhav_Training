package com.techlabs.iterative.test;

import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		int i=2;
		int sum=0;
		while(i<number) {
			if(number%i ==0) {
				break;	
			}
			i++;
	}
		if(i>=number) {
			System.out.println("Enter is Prime");
		}
		else {
			System.out.println("not");
		}
		
	}

}

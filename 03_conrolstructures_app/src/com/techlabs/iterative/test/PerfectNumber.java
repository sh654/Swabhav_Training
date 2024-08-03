package com.techlabs.iterative.test;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		if(isPerfect(number)) {
			System.out.println("P");
		} else {
			System.out.println("N");
		}
}

//static boolean isPerfect(int number) {
//	int sum=0;
//	int i=1;
//	while(i<=number/2) {
//		if(number%i==0) {
//			sum = sum +i;
//		}
//		i++;
//	}
//	if(number==sum) {
//		return true;
//	} else {
//		return false;
//	}
//}
	
	static boolean isPerfect(int number) {
		int sum =0;
		int i =1;
		
		while(i<= number/2) {
			if(number%i == 0) {
				sum = sum + i;
			}
			i++;
		}
		
		if(number == sum ) 
			return true;
		
		return false;
	}
}

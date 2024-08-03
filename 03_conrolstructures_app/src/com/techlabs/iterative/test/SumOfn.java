package com.techlabs.iterative.test;

import java.util.Scanner;
public class SumOfn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
//		int sum =0;
//		while(number>0) {
//			if(number%2==0) {
//				sum = sum+number;
//			}
//			number--;
//		}
//		System.out.println("Sum: "+sum);
		
		int result =isSum(number);
		System.out.print("Sum: "+result);
	}
	
	static int isSum(int number) {
		int sum=0;
		while(number>0) {
			if(number%2==0) {
				sum = sum+number;
			}
			number--;
		}
		return sum;
	}

}

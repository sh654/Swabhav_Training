package com.techlabs.iterative.test;

public class SumCalculator {

	public static void main(String args[]) {
		
		int number = 1;
		
		int sum =0;
		
		while(number<=100) {
		
			sum = sum + number;
			number++;
		}
		System.out.println(sum);
	}
}

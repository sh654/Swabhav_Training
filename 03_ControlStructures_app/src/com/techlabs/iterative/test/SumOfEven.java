package com.techlabs.iterative.test;

public class SumOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 1;
		int sum = 0;
		
		while(number<10) {
			if(number%2==0) {
				sum = sum + number;
				
			}
			number++;
		} System.out.println("Even numbers sum are: " + sum);
		
	}

}

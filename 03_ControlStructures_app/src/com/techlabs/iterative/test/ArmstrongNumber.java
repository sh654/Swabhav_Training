package com.techlabs.iterative.test;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 169;
		
		int sum=0;
		
		int digit=0;
		
		while(number>0) {
			digit = number %10;
			sum = sum + (int)Math.pow(digit, 3);
			
			number = number /10;
		} if(number==sum) {
			System.out.println("Armstrong ");
		} else {
			System.out.println("No Armstrong");
		}
		
	}

}

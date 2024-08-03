package com.techlabs.iterative.test;

import java.util.Scanner;
public class ArmsstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an number: ");
		int number = scanner.nextInt();
		
		if(isArmstrong(number)) {
			System.out.println("A");
		} else {
			System.out.println("N");
		}
	}
	

	public static boolean isArmstrong(int number) {
		int sum =0 ;
		int temp = number;
		int remainder = 0;
		int digits = 0;
		
		while(temp>0) {
			temp = temp /10;
			digits++;
		}
		
		temp= number;
		while(temp>0) {
			
			remainder = temp %10;
			sum = (int) (sum + Math.pow(remainder, digits));
			temp = temp /10;
		}
		
		if(number == sum )
			return true;
		
		return false;
	}
}

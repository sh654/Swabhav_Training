package com.techlabs.iterative.test;

import java.util.Scanner;
public class ArmstrongNumberOFN {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		isAmstrong(number);
	}
	
	public static boolean isAmstrong(int n) {
		int digits =0, temp;
		int sum =0;
		temp = n;
		while(temp>0) {
			temp = temp/10;
			digits++;
		}
		System.out.println("Number of Digits" +digits);
		
		temp = n;
		while(temp>0) {
			int remainder = temp%10;
			sum =(int) (sum +Math.pow(remainder, digits));
			
			temp = temp/10;
		}
		
		if(sum == n) {
			System.out.print("Armstrong");
			return true;
		} else {
			return false;
		}
	}
}

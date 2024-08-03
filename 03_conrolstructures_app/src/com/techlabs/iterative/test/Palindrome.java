package com.techlabs.iterative.test;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		if(!isPalindrome(number)) {
			System.out.println("Palindrome ");
		} else {
			System.out.println("Not Palindrome");
		}
	}
static boolean isPalindrome(int number) {
	int sum =0;
	int remainder=0;
	while(number> 0) {
		remainder = number%10;
		sum = (sum*10)+remainder;
		number = number/10;
	}
	System.out.println(sum);
	
	if(number==sum) {
		return true;
	}else {
		return false;
	}
}
}

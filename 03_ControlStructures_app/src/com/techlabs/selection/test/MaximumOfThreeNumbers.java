package com.techlabs.selection.test;

import java.util.*;
public class MaximumOfThreeNumbers {
		public static void main(String args[]) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter value of number1 : ");
			int number1 = scanner.nextInt();
			
			System.out.println("Enter value of number2 : ");
			int number2 = scanner.nextInt();
			
			System.out.println("Enter value of number3 : ");
			int number3 = scanner.nextInt();
			maximumOfThree(number1, number2, number3);
			
		}
		
		public static int maximumOfThree(int number1, int number2, int number3) {
			if((number1> number2) && (number2> number3)) {
				System.out.println("Entered value " +number1+ " is greater than "+ number2+ " and " + number3);
				return number1;
			} else if((number2>number1) && (number2>number3)){
				System.out.println("Entered value " +number2+ " is greater than "+ number1+ " and " + number3);
				return number2;
			}
			else {
				System.out.println("Entered value " +number3+ " is greater than "+ number1+ " and " + number2);
				return number3;
			}
		}
		
		
	

}

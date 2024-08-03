package com.operators.model;

import java.util.*;
public class Relational {

	public static void main(String args[]) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter value of number 1: ");
		int number1 = obj.nextInt();
		System.out.println("Enter value of number 1: ");
		int number2 = obj.nextInt();
		
		System.out.println("Is "+number1+" Equal to "+number2 +" "+(number1==number2));
		
		System.out.println("Is "+number1+" Not Equal to "+number2 +" "+(number1!=number2));
		
		System.out.println("Is "+number1+" less than "+number2 +" "+(number1<number2));
		
		System.out.println("Is "+number1+" less than equal to "+number2 +" "+(number1<=number2));
		
		System.out.println("Is "+number1+" great than "+number2 +" "+(number1 > number2));
		
		System.out.println("Is "+number1+" great than equal to "+number2 +" "+(number1 >= number2));
	}
}

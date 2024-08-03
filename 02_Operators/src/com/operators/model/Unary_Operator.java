package com.operators.model;

import java.util.Scanner;
public class Unary_Operator {
	public static void main(String args[]) {
		
	Scanner object = new Scanner(System.in);
	System.out.println("Enter value of number1: ");
	int number1 = object.nextInt();
	System.out.println("Enter value of number2: ");
    int number2 = object.nextInt();

    // Using unary operators
    System.out.println("Postincrement : " + (number1++));
    System.out.println("Preincrement : " + (++number1));

    System.out.println("Postdecrement : " + (number2--));
    System.out.println("Predecrement : " + (--number2));
	}
}

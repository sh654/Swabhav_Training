package com.operators.model;

import java.util.Scanner;
public class Assignment_Operator {
	
	public static void main(String args[]) {
		
		Scanner object = new Scanner(System.in);
		
		int number = object.nextInt();
        System.out.println("Number += 3: " + (number += 3));
        System.out.println("Number -= 2: " + (number -= 2));
        System.out.println("Number *= 4: " + (number *= 4));
        System.out.println("Number /= 3: " + (number /= 3));
        System.out.println("Number %= 2: " + (number %= 2));
	}
}

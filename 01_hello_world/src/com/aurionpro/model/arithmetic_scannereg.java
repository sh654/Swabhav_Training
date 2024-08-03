package com.aurionpro.model;

import java.util.Scanner;
public class arithmetic_scannereg {
	
public static void main(String args[]) {	
	// use of scanner class in main method to take input from user
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter value of number 1:"); 
	int num1= obj.nextInt();
	System.out.println("Enter value of number 2:");
	int num2= obj.nextInt();
	add(num1, num2);
	subtract(num1,num2);
	multiply(num1,num2);
	division(num1,num2);
	
}

//creation of add method 
public static int add(int num1,int num2) {
	int add = num1+num2;
	System.out.println("Addition of " + num1+" + "+ num2+" is : "+ add);
	return add;
}

// Creation of Subtract method
public static int subtract(int num1,int num2) {
	int sub = num1-num2;
	System.out.println("Subtraction of " + num1+" - "+ num2+" is : "+ sub);
	return sub;
}

// Creation of multiply method 
public static int multiply(int num1,int num2) {
	int mul = num1*num2;
	System.out.println("Multiplication of " + num1+ " * "+ num2 +" is : "+ mul);
	return mul;
}

//Creation of division method 
public static int division(int num1,int num2) {
	int div = num1/num2;
	System.out.println("Division of " + num1+ " / "+ num2 +" is : "+ div);
	return div;
}
}

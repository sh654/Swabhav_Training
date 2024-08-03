package com.swabhav.training;
import java.util.Scanner;

public class Swapper_alternative {
 public static void main(String args[]) {
	 
	 Scanner obj = new Scanner(System.in);
	 System.out.println("Enter Value of number1: ");
	 int number1 = obj.nextInt();
	 System.out.println("Enter Value of number2: ");
	 int number2 = obj.nextInt();
	 
	 
	 System.out.println("Before Swapping");
	 System.out.println("Number 1 : "+ number1 +" Number 2: "+number2);
	 
	 number1 = number1 + number2;
	 number2 = number1 - number2;
	 number1 = number1 - number2;
	 
	 System.out.println("After Swapping");
	 System.out.println("Number 1 : "+ number1 +" Number 2: "+number2);
 }
}

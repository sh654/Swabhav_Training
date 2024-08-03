package com.swabhav.training;

// Use of Command line Arguments ie we prefer giving while running the class 
public class Examplecla {
public static void main(String args[]) {
	
	 int number1 = Integer.parseInt(args[0]);
	 
	 int number2 = Integer.parseInt(args[1]);
	 
	 
	 System.out.println("Before Swapping");
	 System.out.println("Number 1 : "+ number1 +" Number 2: "+number2);
	 
	 number1 = number1 + number2;
	 number2 = number1 - number2;
	 number1 = number1 - number2;
	 
	 System.out.println("After Swapping");
	 System.out.println("Number 1 : "+ number1 +" Number 2: "+number2);
}


}

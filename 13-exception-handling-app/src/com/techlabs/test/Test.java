package com.techlabs.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { //code you want to monitor for exception
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		
		double result = number1/number2;
		System.out.println("Result :" + result);
		}
		catch(ArithmeticException e) { // code to handle exception
			System.out.println("Invalid Input for Number, cannot be zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter all arguments, Division require two arguments");
		}
		catch(NumberFormatException e) {
			System.out.println("Please enter only Number values");
		}
		
		catch(Exception e) {
			System.out.println("Exception Occured take care of your inputs");
		}
		
		finally { //exceute exception occured or not, closing activity eg file opening or db should be closed 
			System.out.println("Inside Finallly");
		}
		System.out.println("Exitng");
	}

}

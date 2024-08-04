package com.techlabs.model;

public class Operations {

	public int addition(int number1, int number2) {
		return number1+number2;
	}
	
	public int subtraction(int number1, int number2) {
		return number1- number2;
	}
	
	public int multiplication(int number1, int number2) {
		return number1*number2;
	}
	
	public int division(int number1, int number2) {
		if(number2 ==0)
			throw new NullPointerException();
		int result = number1/number2;
		return result;
		
	}
	
	
	public int modulus(int number1, int number2) {
		return number1 %number2;
	}
}

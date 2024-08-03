package com.techlabs.test;

import com.techlabs.model.IAdditon;

public class Addition {

	public static void main(String args[]) {
		
		IAdditon adder =(int number1, int number2)-> number1+number2;
			
			System.out.println(adder.addition(10, 30));
	}
}

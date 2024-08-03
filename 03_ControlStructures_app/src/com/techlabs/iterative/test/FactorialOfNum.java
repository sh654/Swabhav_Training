package com.techlabs.iterative.test;

public class FactorialOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 15,  fact=1;
		for(int i=1; i<=num; i++) {
			fact = fact *i;
		}
		System.out.println("Factorial is :" +fact);
	}

}

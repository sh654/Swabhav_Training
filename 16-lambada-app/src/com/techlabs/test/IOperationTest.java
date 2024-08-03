package com.techlabs.test;

import com.techlabs.model.Operation;

public class IOperationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		performOperation(5, 3, (a, b)-> a+b);
		
	}
	
	public static void performOperation(int a, int b, Operation operation) {
		int result = operation.apply(a, b);
		System.out.println(result);
	}

}

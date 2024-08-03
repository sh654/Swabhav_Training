package com.techlabs.test;

import com.techlabs.model.ITest;
import com.techlabs.model.Reference;

public class ReferenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ITest test = Reference:: new; //passing constructor 
		method(test);
		
		ITest test1Static = Reference:: staticPrint;
		method(test1Static);
		
		Reference reference = new Reference();
		ITest test2 = reference::print;
		method(test2);
	}
	
	public static void method(ITest test) {
		test.display();
	}

}

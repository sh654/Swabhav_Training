package com.techlabs.test;

import com.techlabs.model.Sayable;
//import com.techlabs.model.Sayableimplement;

public class SayableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sayable saye = new Sayable() {

			@Override
			public void say() {
				// TODO Auto-generated method stub
				System.out.println("I am inside Sayable");
			}
//		saye.say();
	};
	
		Sayable bol = () ->System.out.println("I am again inside Sayable");
		
	saye.say();
	bol.say();
	sayHello(saye);
	}
	
	public static void sayHello(Sayable saye) {
		
		System.out.println("Passing Definition of another method as argument to other method");
		saye.say();
	}

}

package com.techlabs.test;

public class DemoTest {

	private int a = 1;
	private static int b=1;
	private int c =1;
	
	
	public void increment() {
		a++;
		b++;
		c++;		
	}
	
	public void display() {
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
	}
}

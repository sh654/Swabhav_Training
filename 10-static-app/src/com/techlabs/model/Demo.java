package com.techlabs.model;

public class Demo {

	private int a = 1;
	private static int b=1;
	private int c =1;
	
	
	public void increment() {
		a++;
		b++;
		c++;		
	}
	
	public void display() {
		System.out.println("Value of a: "+(a));
		System.out.println("Value of b: "+(b));
		System.out.println("value of c: "+(c));
	}
	
	{
		System.out.println("Magic run because of main method in DemoTest as object is called");
	}
	
	static {
		System.out.println("Will run if Demo object is made in main method of Test class");
	}
}

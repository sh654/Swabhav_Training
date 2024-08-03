package com.techlabs.test;

import java.util.Scanner;
public class Typecast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int a = (int)10.5;
		double b = 9;
		
		byte x =10;
		byte z = (byte) (x+10); //Type promotion by Explicit Casting 
		
		System.out.println("Double now Integer ie Narrowing "+a);
		System.out.println("Integer now Double ie Widening "+b);
	}

}

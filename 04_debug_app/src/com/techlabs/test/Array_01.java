package com.techlabs.test;

import java.util.Scanner;

class Array_01{
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] array = new int[5];
		for(int i=0; i<array.length; i++) {
			array[i] = scanner.nextInt();
		}
		for(int i=0; i<array.length; i++) {
			System.out.print(" "+ array[i]+ " ");
		}
	}
}
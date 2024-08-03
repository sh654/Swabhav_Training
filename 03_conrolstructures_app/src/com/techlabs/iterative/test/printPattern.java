package com.techlabs.iterative.test;

import java.util.Scanner;

public class printPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Problem of solid rectangle
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rows = scanner.nextInt();
		System.out.println("Enter number of columns: ");
		int columns = scanner.nextInt();
		
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}

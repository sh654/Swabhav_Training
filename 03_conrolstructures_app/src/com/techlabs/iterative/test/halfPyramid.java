package com.techlabs.iterative.test;

import java.util.Scanner;

public class halfPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rows = scanner.nextInt();
//		System.out.println("Enter number of columns: ");
//		int columns = scanner.nextInt(); No need as * apend as i increase 
//		
		
		for(int i =1; i<=rows;i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}

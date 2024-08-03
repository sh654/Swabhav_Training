package com.techlabs.iterative.test;

import java.util.Scanner;

public class hollowRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rows = scanner.nextInt();
		System.out.println("Enter number of columns: ");
		int columns = scanner.nextInt();
		
		
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=columns; j++) {
				if(i==1 || j==1 || i==rows || j==columns) {
					System.out.print(" * ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		scanner.close();
	}

}

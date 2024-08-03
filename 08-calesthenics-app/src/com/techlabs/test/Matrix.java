package com.techlabs.test;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int[][] matrix =  new int[3][3];
		System.out.println("Enter Elements of matrix: ");
		createRow(matrix, scanner);
		
		System.out.println("");
		printRow(matrix, scanner);
	}
	private static void printRow(int[][] matrix, Scanner scanner) {
		// TODO Auto-generated method stub
		for(int i=0; i<matrix.length; i++) {
			printRowElement(matrix, scanner, i);
			System.out.println();
		}
	}
	private static void printRowElement(int[][] matrix, Scanner scanner, int i) {
		// TODO Auto-generated method stub
		for(int j=0; j<matrix.length; j++) {
			System.out.println(matrix[i][j]);
		}
	}
	private static void createRow(int[][] matrix, Scanner scanner) {
		// TODO Auto-generated method stub
		for(int i=0; i<3; i++) {
			readRowElements(matrix, scanner, i);
		}
	}

	private static void readRowElements(int[][] matrix, Scanner scanner, int row) {
		// TODO Auto-generated method stub
		for(int j=0; j<3; j++) {
			matrix[row][j] = scanner.nextInt();
		}
	}
	
	
}

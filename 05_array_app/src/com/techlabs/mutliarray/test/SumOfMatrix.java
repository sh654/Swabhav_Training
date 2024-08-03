package com.techlabs.mutliarray.test;

import java.util.Scanner;

public class SumOfMatrix {

	public static  int[][] createArray(int rows, int columns){
		Scanner scanner = new Scanner(System.in);
		
		int[][] matrix = new int[rows][columns];
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				matrix[i][j] = scanner.nextInt();
			}
			System.out.println();
		}
		return matrix;
	} 
	
	
	
	public static int sumOfArray(int[][] array){
		int sum =0;
		for(int[] rows:  array) {
			for(int element: rows) {
				sum = sum + element;
			}
		}
		return sum;
	}
	

	 public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	       System.out.println("enter number of rows: ");
	       int rows = scanner.nextInt();
	       System.out.println("enter number of columns: ");
	       int columns = scanner.nextInt();	
	       
	       int [][] array = createArray(rows, columns);
	       
	       int sum = sumOfArray(array);
	       System.out.println("Sum of Array : "+sum);
	 }

}

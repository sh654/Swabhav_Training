package com.techlabs.mutliarray.test;
import java.util.Scanner;
public class MatrixArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rows = scanner.nextInt();
		System.out.println("Enter number of columns: ");
		int columns = scanner.nextInt();
		
		int array[][] = multiArray(rows, columns);
	}
	//create function for multiArray
	public static int [][] multiArray(int rows, int columns){
		
		Scanner scanner = new Scanner(System.in);
		int[][] multiArray = new int[rows][columns];
		
		for(int i=0; i<rows; i++) {
			for(int j =0; j<columns; j++) {
				multiArray[i][j] = scanner.nextInt();
			}
		}
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				System.out.print(multiArray[i][j] + " " );
			}
			System.out.println();
		}
		return multiArray;
	}

}

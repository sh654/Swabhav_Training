package com.techlabs.mutliarray.test;
import java.util.Scanner;
public class SearchNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rows = scanner.nextInt();
		System.out.println("Enter number of columns: ");
		int columns = scanner.nextInt();
		
		int[][] array = createArray(rows, columns);
		printArray(array);
		
		System.out.println("enter target to find: ");
		int target= scanner.nextInt();
		if(findElement(array, target)) {
			System.out.println("milgaya");
		}
		else {
			System.out.println("nahi hai bhai ");
		}
	}
	
	public static int[][] createArray(int rows, int columns){
		Scanner scanner = new Scanner(System.in);
		int [][] array = new int[rows][columns];
		for(int i =0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				array[i][j] = scanner.nextInt();
			}
			System.out.println();
		}
		return array;
	}
	
	static void printArray(int[][] array) {
		for(int[] row: array) {
			for(int element: row) {
				System.out.print( element + " ");
			}
			System.out.println();
		}
	}
	public static boolean findElement(int[][] matrix, int target) {
        // Iterate through each row of the matrix
        for (int[] row : matrix) {
            // Iterate through each element of the current row
            for (int element : row) {
                // If the element matches the target, return true
                if (element == target) {
                    return true;
                }
            }
        }
        // If element is not found, return false
        return false;
    }

}

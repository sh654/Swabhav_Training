package com.techlabs.mutliarray.test;
import java.util.Scanner;

public class max{
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter number of rows: ");
			int rows = scanner.nextInt();
			System.out.println("Enter number of columns: ");
			int columns = scanner.nextInt();
			
			int[][] array = createArray(rows, columns);
			printArray(array);
			int maxelement = findElement(array);
			System.out.println("Maximum : "+maxelement);
			
		}
		
		public static int[][] createArray(int rows, int columns){
			Scanner scanner = new Scanner(System.in);
			int [][] array = new int[rows][columns];
			for(int i =0; i<rows; i++) {
				for(int j=0; j<columns; j++) {
					array[i][j] = scanner.nextInt();
				}
//				System.out.println();
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
		
//		public static int findElement(int[][] matrix) {
//	        // Iterate through each row of the matrix
//			int max = matrix[0][0];
//	        for (int[] row : matrix) {
//	            // Iterate through each element of the current row
//	            for (int element : row) {
//	            	
//	                if(element > max) {
//	                	max = element;
//	                }
//	            }
//	        }
//	        
//	        return max;
//	    }
		
		public static int findElement(int[][] matrix) {
			int max = matrix[0][0];
			for(int[] rows : matrix) {
				for(int element : rows) {
					if(element > max) {
						max = element;
					}
				}
			}
			return max;
		} 

	}




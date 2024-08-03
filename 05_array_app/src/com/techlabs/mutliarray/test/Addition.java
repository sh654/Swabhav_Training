package com.techlabs.mutliarray.test;
import java.util.Scanner;
public class Addition {
    
    // Function to create and fill a 2D array
    public static int[][] createArray(int rows, int columns) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[rows][columns];
        System.out.println("Enter elements for a " + rows + "x" + columns + " array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        return array;
    }

    // Function to add two 2D arrays
    public static int[][] addArrays(int[][] array1, int[][] array2){
    	int rows = array1.length;
    	int columns = array1[0].length;
    	
    	int[][] sumArray = new int[rows][columns];
    	for(int i=0; i<rows; i++) {
    		for(int j=0; j<columns; j++) {
    			sumArray[i][j] = array1[i][j] + array2[i][j];
    		}
    		System.out.println();
    	}
    	return sumArray;
    }
//    

    // Function to print a 2D array
    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get dimensions for the arrays
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns:");
        int columns = scanner.nextInt();

        // Create and fill the first array
        int[][] array1 = createArray(rows, columns);

        // Create and fill the second array
        int[][] array2 = createArray(rows, columns);

        // Add the two arrays
        int[][] sumArray = addArrays(array1, array2);

        // Print the resulting array
        System.out.println("The resulting array after addition is:");
        printArray(sumArray);
    }
}
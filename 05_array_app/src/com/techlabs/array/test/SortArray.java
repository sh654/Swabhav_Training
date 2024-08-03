package com.techlabs.array.test;

import java.util.*;
public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {64, 34, 25, 12, 22, 11, 90};

	    System.out.println("Original Array: " + Arrays.toString(array));

	    bubbleSort(array);

	    System.out.println("Sorted Array: " + Arrays.toString(array));
	}
	
//	public static void bubbleSort(int[] array) {
//	    int n = array.length;
//	    boolean swapped;
//	    do {
//	      swapped = false;
//	      for (int i = 1; i < n; i++) {
//	        if (array[i - 1] > array[i]) {
//	          // Swap elements
//	          int temp = array[i - 1];
//	          array[i - 1] = array[i];
//	          array[i] = temp;
//	          swapped = true;
//	        }
//	      }
//	      n--;
//	    } while (swapped);
//	  }
	
	public static void bubbleSort(int [] array) {
		int n = array.length;
		boolean swapped;
		do {
			swapped = false;
			for(int i =1; i<n ; i++) {
				if(array[i-1] > array[i]) {
					int temp = array[i-1];
					array[i-1] = array[i];
					array[i] = temp;
					swapped = true;
				}
			}
			n--;
		} while(swapped);
	}

}

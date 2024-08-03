package com.techlabs.array.test;

import java.util.Scanner;
public class MaxOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = scanner.nextInt();
		int array[] = new int[size];
		
		for(int i=0; i<size; i++) {
			array[i] = scanner.nextInt();
		}
		
		int max = 0;
		for(int i=0; i<array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("Maximum of Array : "+max);
	}

}

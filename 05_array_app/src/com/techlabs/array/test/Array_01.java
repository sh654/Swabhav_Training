package com.techlabs.array.test;
import java.util.Scanner;
public class Array_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int size=scanner.nextInt();
		System.out.println("Enter value of arrays: ");
		int [] array = new int[size];
		
		for(int i=0; i<size; i++) {
			array[i]=scanner.nextInt();
		}
		
		System.out.println("Array: ");
		
		for(int i=0; i<size; i++) {
			System.out.println(array[i]);
		}
	}

}

	



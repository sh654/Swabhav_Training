package com.techlabs.array.test;
import java.util.Scanner;
public class CheckArray {
public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("enter size of array: ");
	int size = scanner.nextInt();
	System.out.println("enter element of array: ");
	int array[] = new int[size];
	
	for(int i=0; i<size; i++) {
		array[i]=scanner.nextInt();
	}
	System.out.println("enter element to search: ");
	
	int search = scanner.nextInt();
	boolean flag = false;
	for(int i=0; i<array.length; i++) {
		if(search == array[i]) {
			System.out.println("Element is found at : "+ i);
			flag = true;
			break;
		}
	}
	
	if(!flag) {
		System.out.println("Element not present ");
	}
	
}
}

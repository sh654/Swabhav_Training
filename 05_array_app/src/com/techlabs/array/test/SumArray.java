package com.techlabs.array.test;
import java.util.Scanner;
public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int array[]	= new int[size];
		int sum =0;
		for(int i=0; i<size; i++) {
			array[i]= scanner.nextInt();
		}
		
		for(int i=0; i<size; i++) {
			sum = sum +array[i];
		}
		System.out.println(sum);
}
}

package com.techlabs.iterative.test;

public class PrintNumberPyramidofIncreaseOrder {
public static void main(String args[]) {
	int k=1;
	 int rows = 4;
     for (int i = 1; i <= rows; ++i) {
         for (int j = 1; j <= i; j++) {
             System.out.print(k + " ");
             k++;
         }
         System.out.println();
     }
}
}

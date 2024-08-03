package com.techlabs.ocp.test;

import com.techlabs.ocp.violation.FestivalType;
import com.techlabs.ocp.violation.FixedDeposit;

public class FDTest {

	    public static void main(String[] args) {
	        // Creating FixedDeposit objects with different festival types
	        FixedDeposit fd1 = new FixedDeposit(101, "Alice", 10000, 2, FestivalType.DIWALI);
	        FixedDeposit fd2 = new FixedDeposit(102, "Bob", 15000, 3, FestivalType.HOLI);
	        FixedDeposit fd3 = new FixedDeposit(103, "Charlie", 20000, 1, FestivalType.NEWYEAR);
	        FixedDeposit fd4 = new FixedDeposit(104, "Diana", 25000, 5, FestivalType.OTHERS);
	        FixedDeposit fd5 = new FixedDeposit(104, "Diana", 25000, 5, FestivalType.WEDDING);
	        
	        // Displaying information and calculating simple interest for each FixedDeposit
	        System.out.println(fd1);
	        System.out.println("Simple Interest: " + fd1.calculateSimpleInterest());
	        
	        System.out.println(fd2);
	        System.out.println("Simple Interest: " + fd2.calculateSimpleInterest());
	        
	        System.out.println(fd3);
	        System.out.println("Simple Interest: " + fd3.calculateSimpleInterest());
	        
	        System.out.println(fd4);
	        System.out.println("Simple Interest: " + fd4.calculateSimpleInterest());
	        
	        System.out.println(fd5);
	        System.out.println("Simple Interest: " + fd4.calculateSimpleInterest());
	    }
	}

package com.techlabs.test;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Integer> evenPredicate = (Integer number) -> (number%2 == 0);
			
		System.out.println(evenPredicate.test(5)); //false
		
		Predicate<Integer> oddPredicate = (Integer number)-> (number%2!=0);
		
		System.out.println(oddPredicate.test(5)); //true
		
		BiPredicate<Integer, Integer> great = (Integer number1, Integer number2) -> 
		(number1 > number2);
		
		System.out.println(great.test(10, 20));
	}

}

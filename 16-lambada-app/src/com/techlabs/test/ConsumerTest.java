package com.techlabs.test;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//accept any argument does not return anything
		Consumer<Integer> consumer = (Integer number) ->
		System.out.println("Square of number : "+ number*number);
		
		consumer.accept(5);
		
		double input = 5;
		Consumer<Double> factorial = (Double number) ->{
		
		double fact = 1;
		for(double n=1; n<= number; n++) {
			fact = fact*n;
		}
		System.out.println("Factorial Consumer: "+number+": "+fact);
		
		};
		
		BiConsumer<Integer, Integer> adder = (Integer number1, Integer number2) ->{
			int result =number1 + number2; 
			System.out.println(result);
		};
		
		factorial.accept(input);
		adder.accept(15, 15);
		
	}

}

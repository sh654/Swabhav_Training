package com.techlabs.test;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Integer, Integer> sqrFunction = (Integer number)-> number*number;
		
		System.out.println(sqrFunction.apply(5));
		
		Function<Integer, Integer> cubeFunction = (Integer number) -> number*number*number;
		System.out.println(cubeFunction.apply(5));
		
		BiFunction<Integer, Integer, Integer> addition = (Integer number1, Integer number2) ->
		number1+number2;
		System.out.println(addition.apply(5, 10));
		
		Function<String, Integer> lengthFunction = (s) -> s.length();
		System.out.println(lengthFunction.apply("Hello World!"));
		
		
		Function<String, Integer> combineFunction = lengthFunction.andThen(sqrFunction);
		System.out.println(combineFunction.apply("Hello World!"));
		
		
	}

}

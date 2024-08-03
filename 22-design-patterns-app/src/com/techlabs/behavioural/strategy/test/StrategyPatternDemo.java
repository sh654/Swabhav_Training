package com.techlabs.behavioural.strategy.test;

import com.techlabs.behavioural.strategy.model.AddOperation;
import com.techlabs.behavioural.strategy.model.MultiplyOperation;
import com.techlabs.behavioural.strategy.model.OperationStrategy;

public class StrategyPatternDemo {

	public static void main(String args[]) {
		
		OperationStrategy op = new OperationStrategy(new AddOperation());
		System.out.println(op.dooperate(5, 12));
		
		op.setOperation(new MultiplyOperation());
		System.out.println(op.dooperate(2, 2));
	}
}

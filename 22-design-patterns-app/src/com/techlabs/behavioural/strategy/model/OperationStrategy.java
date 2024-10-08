package com.techlabs.behavioural.strategy.model;

public class OperationStrategy {

	private IOperation operation;

	
	
	public OperationStrategy(IOperation operation) {
		super();
		this.operation = operation;
	}

	public void setOperation(IOperation operation) {
		this.operation = operation;
	}
	
	public int dooperate(int a, int b) {
		return operation.doOperation(a, b);
	}
	public IOperation getOperation() {
		return operation;
	}

	
	
	
}

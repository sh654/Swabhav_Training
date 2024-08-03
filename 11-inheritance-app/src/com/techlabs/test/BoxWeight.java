package com.techlabs.test;

public class BoxWeight extends Box{

	private int weight;
	public BoxWeight(int weight, int height, int depth, int width) {
		super(height, depth, width);
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "BoxWeight [weight=" + weight + ", getHeight()=" + getHeight() + ", getDepth()=" + getDepth()
				+ ", getWidth()=" + getWidth() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}

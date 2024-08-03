package com.techlabs.model;

public class Box {
	
	public int depth;
	public int height;
	public int width;
	
//	public void initialize(int d, int h, int w) {
//		depth = d;
//		height = h;
//		width = w;
//	
//	}
	
	public Box() {
		this.width = 10;
		this.depth = 20;
		this.height =13;
	}
	
	public Box(int width,int height, int depth) {
		this.width = width;
		this.depth =depth;
		this.height =height;
	}
	public void setWidth(int w) {
		this.width = w;
	}
	
	
	
	public void setHeight(int h) {
		this.height = h;
	}
	
	
	
	public void setDepth(int d) {
		this.depth = d;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	
	public int getDepth() {
return this.depth;
	}
}

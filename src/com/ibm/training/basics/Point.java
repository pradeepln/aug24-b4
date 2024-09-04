package com.ibm.training.basics;

public class Point {
	
	int x,y;
	
	public Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	public String whereAmI() {
		return "I am at x = "+x+" , y = "+y;
	}
	
	//this is not fully correct, to be fixed later
	public boolean equals(Point other) {
		
		return (this.x == other.x && this.y == other.y);
	
	}

}

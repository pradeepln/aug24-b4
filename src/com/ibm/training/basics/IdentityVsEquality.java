package com.ibm.training.basics;

public class IdentityVsEquality {

	public static void main(String[] args) {
		int i = 4;
		int j = 4;
		
		System.out.println("i == j ? "+(i == j));
		
		int[] iArray = new int[1];
		iArray[0] = 4;
		
		int[] jArray = new int[1];
		jArray[0] = 4;
		
		System.out.println("iArray == jArray ? "+(iArray == jArray));
		
		Point p1 = new Point(10, 20);
		Point p2 = new Point(10,20);
		Point p3 = p1;
		
		System.out.println("p1 == p2 ? "+(p1 == p2));
		System.out.println("p1 == p3 ? "+(p1 == p3));
		
		System.out.println("p1.equals(p2) ? "+(p1.equals(p2)));

	}

}

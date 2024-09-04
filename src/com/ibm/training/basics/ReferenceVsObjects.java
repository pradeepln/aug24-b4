package com.ibm.training.basics;

public class ReferenceVsObjects {

	public static void main(String[] args) {
		Point p1; //this is a ref
		
		p1 = new Point(10, 20);
		
		Point p2 = p1;
		
		System.out.println("p1 x "+p1.x);
		System.out.println("p2.x "+p2.x);
		
		p2.x = 11;
		
		System.out.println("p1 x "+p1.x);
		System.out.println("p2.x "+p2.x);
		
		//========================== ref com
		
		

	}

}

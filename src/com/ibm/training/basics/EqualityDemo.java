package com.ibm.training.basics;

public class EqualityDemo {

	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		Point p2 = new Point(11, 20);
		
		System.out.println("p1 == p2 "+(p1 == p2));
		System.out.println("p1.eq p2 "+(p1.equals(p2)));
		
		String answer = "yes";
		
		String userInput = args[0]; 

		if(userInput.equals(answer)) {
			System.out.println("user said yes....");
		}else {
			System.out.println("user said no....");
		}
			
	}

}

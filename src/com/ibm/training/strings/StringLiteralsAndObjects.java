package com.ibm.training.strings;



import com.ibm.training.basics.Car;

public class StringLiteralsAndObjects {

	public static void main(String[] args) {
		Car c = new Car();
		
		String s1 = "hello"; // literal
		
		System.out.println(s1.toUpperCase());
		
		
		String s2 = "hello"; // literal
		
		String s3 = new String("hello"); //not a literal
		
		System.out.println("s1 == s2 ? "+(s1 == s2));
		System.out.println("s1 == s3 ? "+(s1 == s3));
		
		System.out.println("s1.eq(s2) ? "+(s1.equals(s2)));
		System.out.println("s1.eq(s3) ? "+(s1.equals(s3)));
		
		String joined = s1.concat(" world!");
		
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		System.out.println("joined = "+joined);
		
	
	}

}

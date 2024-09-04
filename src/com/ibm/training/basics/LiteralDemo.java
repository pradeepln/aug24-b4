package com.ibm.training.basics;

public class LiteralDemo {

	public static void main(String[] args) {
		
		
		int i = 42;
		
		String s = "hello";
		
		boolean b = true;
		
		char c = 'z';
		
		long l = 42;

		float f = 42;
		
		double d = 42;
		
		m1(42);
		m1(42L);
		m1(42f);
		m1(42d);
		m1(42.0);
		m1(41.2f);
		
		int x = 0x123ab; //hexadecimal literal
		System.out.println(x);
		int y = 042; //octal literal
		System.out.println(y);
		
		char special = '\u0236'; //unicode literal
		System.out.println(special);
	}
	
	public static void m1(int someVal) {
		System.out.println("Doing something with int");
	}
	
	public static void m1(long someVal) {
		System.out.println("Doing something with long");
	}
	
	public static void m1(float someVal) {
		System.out.println("Doing something with float");
	}
	
	public static void m1(double someVal) {
		System.out.println("Doing something with int");
	}

}

package com.ibm.training.basics;

public class TypeCastPrimitivesDemo {

	public static void main(String[] args) {
		int i = 42;
		
		long l = i; //implicit type cast
		
		System.out.println(l);

		long bigNumber = Integer.MAX_VALUE;
		
		bigNumber++;
		bigNumber++;
		
		System.out.println(bigNumber);
		
		int myInt = (int) bigNumber; //explicit
		
		System.out.println(myInt);
	}

}

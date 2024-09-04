package com.ibm.training.basics;

public class PrimitiveVsReferenceDemo {

	public static void main(String[] args) {
		
		int answer = 42;
		
		boolean available = true;
		
		char c = 'a';
		
		//------------------
		
		StringBuffer sb = new StringBuffer();
		
		int[] numbers = new int[10];
		numbers[0] = 42;
		
		increment(answer);
		incrementFirstElement(numbers);
		
		System.out.println(answer);
		System.out.println(numbers[0]);
	}
	
	public static void increment(int i) {
		//i = i+1;
		i++;
		System.out.println("i = "+i);
	}
	
	public static void incrementFirstElement(int[] iArray) {
		//iArray[0] = iArray[0] + 1;
		iArray[0]++;
	}

}

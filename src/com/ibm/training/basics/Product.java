package com.ibm.training.basics;



public class Product {
	
	int id;
	String name;
	static int count;

	public Product(int id, String name) {
		this.id = id;
		this.name = name;
		++count;
	}

	public static int getCount() {
		
		return count;
	}
}
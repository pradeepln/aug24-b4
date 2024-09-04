package com.ibm.training.basics;

public class StaticVsNonStatic {

	public static void main(String[] args) {
		
		System.out.println(Product.count);
		
		Product p1 = new Product(99, "soap");
		Product p2 = new Product(23, "shampoo");
		
		System.out.println(Product.count);
		
		Product.getCount();

	}

}

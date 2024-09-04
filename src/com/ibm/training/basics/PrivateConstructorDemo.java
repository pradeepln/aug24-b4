package com.ibm.training.basics;

public class PrivateConstructorDemo {
	
	private PrivateConstructorDemo() {
		System.out.println("Inside constr");
	}

	public static void main(String[] args) {
		new PrivateConstructorDemo();

	}

}


class AnotherClass{
	
	public static void main(String[] args) {
		//new PrivateConstructorDemo();
	}
}
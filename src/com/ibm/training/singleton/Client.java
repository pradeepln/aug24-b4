package com.ibm.training.singleton;

public class Client {

	public static void main(String[] args) {
		ExpensiveResource r1 = ExpensiveResource.getInstance(); //new ExpensiveResource();

		
		//some other place
		
		ExpensiveResource r2 = ExpensiveResource.getInstance(); //new ExpensiveResource();
		
		//ExpensiveResource.instance = null;
	}

}

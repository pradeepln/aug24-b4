package com.ibm.training.singleton;

public class ExpensiveResource {
	
	private static ExpensiveResource instance; // = new ExpensiveResource();
	
	private ExpensiveResource() {
		
	}
	
	//lots of memory
	//or opens lots of network connections
	//creates lots of threads

	public static ExpensiveResource getInstance() {
		if(instance == null) {
			instance = new ExpensiveResource();
		}
		return instance;
	}
}

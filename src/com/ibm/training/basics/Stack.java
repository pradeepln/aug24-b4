package com.ibm.training.basics;

public interface Stack {

		
	public void push(Object anElement);
	public Object pop();
	
	public default int size() {
		return -1;
	}
}

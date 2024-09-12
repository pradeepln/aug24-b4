package com.ibm.training.threads;

public class FixedArrayStack implements Stack {
	
	private Object[] contents;
	private int top = -1;

	public FixedArrayStack(int capacity) {
		contents = new Object[capacity];
	}
	
	@Override
	public synchronized void push(Object anElement) {
		contents[++top] = anElement;
	}
	
	@Override
	synchronized public Object pop() {
		return contents[top--];
	}
}

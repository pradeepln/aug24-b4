package com.ibm.training.basics;

public class FixedArrayStack implements Stack {
	
	private Object[] contents;
	private int top = -1;

	public FixedArrayStack(int capacity) {
		contents = new Object[capacity];
	}
	
	@Override
	public void push(Object anElement) {
		contents[++top] = anElement;
	}
	
	@Override
	public Object pop() {
		return contents[top--];
	}
}

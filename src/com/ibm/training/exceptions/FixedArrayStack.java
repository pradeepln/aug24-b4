package com.ibm.training.exceptions;

public class FixedArrayStack implements Stack {
	
	private Object[] contents;
	private int top = -1;

	public FixedArrayStack(int capacity) {
		contents = new Object[capacity];
	}
	
	@Override
	public void push(Object anElement) {
		if(top == contents.length - 1) {
			throw new StackFullException();
		}
		contents[++top] = anElement;
	}
	
	@Override
	public Object pop() {
		if(top == -1) {
			throw new StackEmptyException();
		}
		return contents[top--];
	}
}

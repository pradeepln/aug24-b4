package com.ibm.training.exceptions;

public class StackUser {
	
	
	public void fill(Stack s) {
		for(int i = 0; i < 10; i++) {
			try {
				s.push(i);
				System.out.println("Pushed -----------> "+i);
			}catch (StackFullException e) {
				System.out.println("Seems stack is full , therefore breaking out of loop");
				break;
			}
		}
	}

}

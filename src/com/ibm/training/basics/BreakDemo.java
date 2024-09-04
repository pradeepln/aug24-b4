package com.ibm.training.basics;

public class BreakDemo {

	public static void main(String[] args) {
		int i = 1;
		
		loop1:while(true) {
			System.out.println("Inside infinite loop i = "+i);
			i++;
			if(i == 13) {
				System.out.println("Hit an unlucky number :(, breaking out");
				break;
			}
			
			System.out.println("Finished processing "+i);
			
			for(int j = 15; j > 0; j--) {
				if(j == i) {
					System.out.println("i and j are same, so breaking....");
					break loop1;
				}
			}
			
			System.out.println("After for loop i = "+i);
		}
		
		System.out.println("After infinite loop....");

	}

}

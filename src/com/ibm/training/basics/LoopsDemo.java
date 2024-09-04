package com.ibm.training.basics;

public class LoopsDemo {

	public static void main(String[] args) {
		int i = 11;

		while (i <= 10) {
			System.out.print(i + "\t");
			i++;
		}

		System.out.println("\n___________________________________");
		
		i = 1;
		
		do {
			System.out.println("in do while "+i);
			i++;
		} while (i <= 10);
		
		System.out.println("__________________________");
		
		for(i=0;i <=10;i++)
		{
		  System.out.println(i);
		}


	}

}

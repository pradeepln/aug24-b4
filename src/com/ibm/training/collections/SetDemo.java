package com.ibm.training.collections;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
//		Set<String> uniqueWords = new HashSet<>(); //iteration order is not same as insertion order
//		Set<String> uniqueWords = new LinkedHashSet<>(); //iteration order is same as insertion order
		Set<String> uniqueWords = new TreeSet<>(); //elements are held in asc order
		
		Scanner kb = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter a word: ");
			String input = kb.nextLine();
			if(input.equals("quit")) {
				break;
			}
			
			boolean added = uniqueWords.add(input);
			if(!added) {
				System.out.println("That was a duplicate!");
			}
		}
		
		System.out.println("____________ All Values ______________");
		
		for(String aWord : uniqueWords) {
			System.out.println(aWord);
		}

	}

}

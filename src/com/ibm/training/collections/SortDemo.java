package com.ibm.training.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.ibm.training.basics.Employee;

public class SortDemo {

	public static void main(String[] args) {
		
		//sortStringArrayNatural();
		//sortStringListNatural();
		//sortListOfUserDefinedType();
		
		sortStringArrayBasedOnLength();
	}

	private static void sortStringArrayBasedOnLength() {
		String[] words = new String[]{"this","is","a","list","of","beautiful","words","like","zebra","and","gorilla"};
		System.out.println("before sort\n" + Arrays.toString(words));
		
		Arrays.sort(words, new StringLengthComparator());
		
		System.out.println("after sort\n" + Arrays.toString(words));
		
	}

	private static void sortListOfUserDefinedType() {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(91, "ninety one", 12345));
		empList.add(new Employee(71, "seventy one", 43333));
		empList.add(new Employee(11, "onety one",933333));
		empList.add(new Employee(31, "thirty one", 566));
		
		System.out.println("before sorting emp list\n"+empList);
		
		Collections.sort(empList);
		
		System.out.println("after sorting emp list\n"+empList);
	}

	private static void sortStringListNatural() {
		String[] words = new String[]{"this","is","a","list","of","beautiful","words","like","zebra","and","gorilla"};
		List<String> wordList = Arrays.asList(words);
		
		System.out.println("list before sort\n"+wordList);
		Collections.sort(wordList);
		System.out.println("list after sort\n"+wordList);
		
	}

	private static void sortStringArrayNatural() {
		String[] words = new String[]{"this","is","a","list","of","beautiful","words","like","zebra","and","gorilla"};
		System.out.println("before sort\n" + Arrays.toString(words));
		Arrays.sort(words);
		System.out.println("after sort\n" + Arrays.toString(words));
	}

}

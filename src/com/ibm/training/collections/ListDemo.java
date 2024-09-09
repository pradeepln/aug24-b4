package com.ibm.training.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// simpleRawListOps();
		// simpleGenericOps();
		linkedListOps();
	}

	public static void someAlgo(List<String> l) {
		//assume u have a million elements in l

		l.add(0, "he he he"); // linear time op O(n) in arrayList
		
		int n = 2;
		//assume n is a large num
		
		String s = l.get(n); // O(1) in AL, O(n) in LL
		
		l.remove(0);
		System.out.println("--------------------Loop in someAlgo");
//		for(int i = 0; i < l.size(); i++) {
//			String aValue = l.get(i);
//			//do something with aValue
//			System.out.println(aValue);
//		}
		
//		Iterator<String> it = l.iterator();
//		while(it.hasNext()) {
//			String aValue = it.next();
//			System.out.println(aValue);
//		}
		
		for(String aValue : l) {
			System.out.println(aValue);
		}
		
	}

	private static void linkedListOps() {
		LinkedList<String> ll = new LinkedList<>();

		ll.add("first");
		ll.add("2nd");
		ll.add("three");

		System.out.println(ll);

		ll.addFirst("new first"); // constant time op, O(1) in LinkedList
		System.out.println(ll);

		ll.removeFirst(); // constant time op, O(1) in LinkedList, O(n) in AL
		System.out.println(ll);

		ll.add(1, "new second");
		System.out.println(ll);

		System.out.println(ll.get(2));

		System.out.println("____________ loop ____________");

		for (int i = 0; i < ll.size(); i++) {
			String aValue = ll.get(i); // bad
			System.out.println(aValue);
		}
		
		someAlgo(ll);
	}

	private static void simpleGenericOps() {
		ArrayList<String> sList = new ArrayList<>();

		sList.add("abc");
		sList.add("123");

		ArrayList<Integer> iList = new ArrayList<Integer>();
		iList.add(123);
		iList.add(832);

		// iList.add("jkkk");

		// sList.add(345);

		// String sVal = (String) iList.get(0);

		String sVal = sList.get(2);
		int ii = iList.get(0);

		// assume u have a million elements in sList

//		sList.add(0, "he he he");

		System.out.println("____________ loop ____________");

		for (int i = 0; i < sList.size(); i++) {
			String aValue = sList.get(i);
			System.out.println(aValue);
		}

		someAlgo(sList);
	}

	private static void simpleRawListOps() {
		ArrayList l = new ArrayList();
		System.out.println("size: " + l.size());

		l.add("first");
		l.add("second");
		l.add("fourth");

		System.out.println("size: " + l.size());
		System.out.println("tostring " + l);

		l.add(2, "third");

		l.set(0, "new first");

		System.out.println("size: " + l.size());
		System.out.println("tostring " + l);

		System.out.println("element at 3: " + l.get(3));

		l.remove("fourth");
		System.out.println("size: " + l.size());
		System.out.println("tostring " + l);

		System.out.println("_________________ loop _____________");
		for (int i = 0; i < l.size(); i++) {
			String aValue = (String) l.get(i);
			System.out.println(aValue);
		}
	}

}

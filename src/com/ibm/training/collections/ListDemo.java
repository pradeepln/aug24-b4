package com.ibm.training.collections;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {
		//simpleRawListOps();
		simpleGenericOps();
	}

	private static void simpleGenericOps() {
		ArrayList<String> sList = new ArrayList<>();
		
		sList.add("abc");
		sList.add("123");
		
		ArrayList<Integer> iList = new ArrayList<Integer>();
		iList.add(123);
		iList.add(832);
		
		//iList.add("jkkk");
		
		//sList.add(345);
		
		//String sVal = (String) iList.get(0);
		
		String sVal = sList.get(2);
		int ii = iList.get(0);
		
		System.out.println("____________ loop ____________");
		
		for(int i = 0; i < sList.size(); i++) {
			String aValue = sList.get(i);
			System.out.println(aValue);
		}
		
	}

	private static void simpleRawListOps() {
		ArrayList l = new ArrayList();
		System.out.println("size: "+l.size());
		
		l.add("first");
		l.add("second");
		l.add("fourth");
		
		System.out.println("size: "+l.size());
		System.out.println("tostring "+l);
		
		
		l.add(2,"third");;
		l.set(0, "new first");
		
		System.out.println("size: "+l.size());
		System.out.println("tostring "+l);
		
		System.out.println("element at 3: "+l.get(3));
		
		l.remove("fourth");
		System.out.println("size: "+l.size());
		System.out.println("tostring "+l);
		
		System.out.println("_________________ loop _____________");
		for(int i = 0; i < l.size(); i++) {
			String aValue = (String) l.get(i);
			System.out.println(aValue);
		}
	}

}

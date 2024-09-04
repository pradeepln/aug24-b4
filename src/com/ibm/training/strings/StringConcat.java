package com.ibm.training.strings;

import com.ibm.training.basics.ChemicalElement;

public class StringConcat {

	public static void main(String[] args) {
		String s1 = "hello ";
		String s2 = "world";
		
		//String s3 = s1.concat(s2);
		
		String s3 = s1 + s2; // ===> s1.concat(s2)
		
		System.out.println(s3);
		
		int i = 42;
		
		String s4 = "answer = ".concat(String.valueOf(i));
		String s5 = "answer = " + i;

		System.out.println(s4);
		System.out.println(s5);
		
		ChemicalElement c = new ChemicalElement(1, "H", "hydrogen");
		
		//String s6 = "Ocean is mostly ".concat(c.toString());
		String s6 = "Ocean is mostly " + c;
		System.out.println(s6);
	}

}

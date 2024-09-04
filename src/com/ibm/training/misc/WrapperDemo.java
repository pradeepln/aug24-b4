package com.ibm.training.misc;

public class WrapperDemo {

	public static void main(String[] args) {
		int i = 10;
		
		//Integer intObj = new Integer(i);
		
		Integer intObj = i;
		
		int j = intObj.intValue();
		
		int fromStr = Integer.parseInt("123");
		
		float fl = Float.parseFloat("23.9");
		
		double d = Double.parseDouble("23.2");
		
		i++;
		intObj++; //avoid. math is more efficient on primitives

	}

}

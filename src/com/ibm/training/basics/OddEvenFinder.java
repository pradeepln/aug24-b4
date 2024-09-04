package com.ibm.training.basics;

/**
 * This class was created to demo ternary and % operators.
 * Now, also being used to demo javadocs
 * @author pradeep
 */
public class OddEvenFinder {

	public static void main(String[] args) {

		System.out.println("11 is " + oddOrEven(11));
		System.out.println("12 is " + oddOrEven(12));

	}

	/**
	 * This is a method to find whether a given number is odd or even
	 * 
	 * This is actually an embarrassingly simple method..
	 * 
	 * @param aNum The number to determine odd or even
	 * @return String value "Odd" or "Even"
	 */
	public static String oddOrEven(int aNum) {

		return (aNum % 2 == 0) ? "Even" : "Odd";

	}

}

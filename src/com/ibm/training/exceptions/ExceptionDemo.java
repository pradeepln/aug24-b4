package com.ibm.training.exceptions;

import com.ibm.training.basics.Car;

public class ExceptionDemo {

	static Car c;

	public static void main(String[] args) {
		System.out.println("Inside main before calling m1");
		m1();
		System.out.println("Inside main after calling m1");
	}

	private static void m1() {
		System.out.println("Inside m1 before calling m2");
		m2();
		System.out.println("Inside m1 after calling m2");

	}

	private static void m2() {
		try {
			System.out.println("Inside m2 before calling m3");
			m3();
			System.out.println("Inside m2 after calling m3");
		}catch (ArithmeticException e) {
			System.out.println("Handling division by zero in m2... .....");
		}
		
	}

	private static void m3() throws ArithmeticException {
		System.out.println("Inside m3 before any ops");

		try {
			System.out.println("Trying to access 3rd element of the array of length 2");
			int[] nums = new int[] { 23, 71 };
			System.out.println(nums[1]);

			//System.out.println("Trying to play musix on a null car? huh...");
			//c.playMusic();

			int i = 23;
			int j = 0;
			System.out.println("What you expect to be infinite isn't always so...");
			int k = i / j;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Handling exception with msg : " + e.getMessage());
			System.out.println("May be i'll allocate a larger array. ");
		} catch (NullPointerException e) {
			System.out.println("Seems like car is null---"+e.getMessage());
			System.out.println("Do a new?");
			e.printStackTrace();
		}finally {
			System.out.println("Inside finally...");
		}
		
		System.out.println("Inside m3 after any ops");
	}

}

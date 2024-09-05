package com.ibm.training.misc;

import java.io.IOException;
import java.util.Scanner;

public class SystemClassDemo {

	public static void main(String[] args) throws IOException {
		//System.out.print("this ");
		System.out.println("this is the text written to std out");
		System.err.println("This goes into std error");
		System.out.println("Enter a line into the std in and press enter:");
		
		Scanner kb = new Scanner(System.in);
		String line = kb.nextLine();
		
		System.out.println(line);
		//int abyte = System.in.read();
		
		//System.out.println(abyte);
		
		long currentDateTime = System.currentTimeMillis();
		System.out.println(currentDateTime);
		
		System.out.println("user.name = "+System.getProperty("user.name"));
		System.out.println("user.home = "+System.getProperty("user.home"));
		System.out.println("os.name = "+System.getProperty("os.name"));
		System.out.println(System.getProperties());
		

	}

}

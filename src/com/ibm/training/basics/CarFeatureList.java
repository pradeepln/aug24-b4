package com.ibm.training.basics;

public class CarFeatureList {

	public static void main(String[] args) {
		
		printFeatures("VX");
		System.out.println("_________________");
		printFeatures("LX");
		System.out.println("________________");
		printFeatures("L");

	}
	
	public static void printFeatures(String variant) {
		// L - airbags, power windows, LX - music system, RV Cam, VX - ventilated seats
		switch(variant) {
		case "VX":
			System.out.println("Ventilated Seats");
		case "LX":
			System.out.println("Music System");
			System.out.println("RV Cam");
		case "L":
			System.out.println("Airbags");
			System.out.println("Powered Windows");
		}
	}

}

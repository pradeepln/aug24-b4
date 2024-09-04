package com.ibm.training.basics;
//					IS-A
public class Truck extends Vehicle {

	@Override
	public void start() {
		System.out.println("[[ Truck Starting ]]");
	}
	
	@Override
	public void stop() {
		System.out.println("[[ Truck Stopping ]]");
	}
}

package com.ibm.training.basics;

abstract public class Vehicle  {
	
	int seatingCapacity;
	//common structure for all vehicles
	
	public abstract void start(); /*{	System.out.println("{{ Vehicle Starting }}"); }*/
	
	public void stop() {
		System.out.println("{{ Vehicle Stopping }}");
	}

}

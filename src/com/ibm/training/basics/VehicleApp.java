package com.ibm.training.basics;

public class VehicleApp {

	public static void main(String[] args) {
		Driver d = new Driver();
		
		Car c = new Car(); 
		
		d.drive(c); //type substitution
			
		
		Truck t = new Truck();
		
		d.drive(t); //type substitution

		
		Vehicle v1 = new Car();
		Vehicle v2 = new Truck();
		
		//Vehicle v3 = new Vehicle();
		
		//d.drive(v3);
		
		Motorbike b = new Motorbike();
		d.drive(b);
	}

}

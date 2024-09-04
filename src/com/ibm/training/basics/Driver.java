package com.ibm.training.basics;
//DRY
public class Driver {

	public void drive(Vehicle v) {

		v.start();
		System.out.println("Taking it out for a spin.....");
		
		if(v instanceof Car) {
			Car c = (Car) v;
			c.playMusic();
		}
		
		v.stop();
	}

	

}

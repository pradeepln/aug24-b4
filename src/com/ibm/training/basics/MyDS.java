package com.ibm.training.basics;

public class MyDS {
	
	public void addElement(Object o) {}

}

class DSUser{
	
	public static void main(String[] args) {
		MyDS ds = new MyDS();
		
		ds.addElement("first element");
		ds.addElement("sec");
		
		Car c = new Car();
		ds.addElement(c);
		
		Driver d = new Driver();
		ds.addElement(d);
		
		Object o1 = new Point(12, 23);
		Object o2 = new ChemicalElement(8, "O", "ox");
	}
}

package com.ibm.training.basics;
//DRY
public class ChemicalApp {

	public static void main(String[] args) {
		ChemicalElement h = new ChemicalElement(1,"H","Hydrogen");
		ChemicalElement k = new ChemicalElement(19, "K", "Potassium");
		ChemicalElement li = new ChemicalElement(3, "Li", "Lithium");
		ChemicalElement o = new ChemicalElement(8, "O", "Oxygen");

		//k.setName("Kalium");
		
		printDetails(h);
		printDetails(o);
		printDetails(li);
		printDetails(k);
		
	}

	private static void printDetails(ChemicalElement e) {
		//e.atomicNumber = -1;
		//e.setAtomicNumber(-1);
		
		System.out.println("Name of the element: "+e.getName());
		System.out.println("Is it a metal? "+e.isMetal());
		System.out.println("Is it a trans metal? "+e.isTransitionMetal());
		System.out.println("Is it an alkali? "+e.isAlkaliMetal());
		System.out.println("________________________________________");
	}

}

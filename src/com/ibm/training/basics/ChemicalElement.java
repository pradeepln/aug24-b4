package com.ibm.training.basics;

public class ChemicalElement {
	
	private int atomicNumber;
	private String symbol;
	private String name;
	
	private static boolean[] alkaliMetals = new boolean[120];
	
	static {
		alkaliMetals[3] = true;
		alkaliMetals[11] = true;
		alkaliMetals[19] = true;
		alkaliMetals[37] = true;
		alkaliMetals[55] = true;
		alkaliMetals[87] = true;
	}
	
	public ChemicalElement(int atomicNumber,String symbol,String name) {
		this.atomicNumber = atomicNumber;
		this.symbol = symbol;
		this.name = name;
	}
	
	public boolean isMetal() {
		
		switch(atomicNumber) {
		case 13, 49, 50, 81, 82, 83, 113, 114, 115, 116:
			return true;
		default:
			return false;
		}
	
	}
	
	public boolean isTransitionMetal() {
		
		return (atomicNumber >= 21 && atomicNumber <= 31) ||
			   (atomicNumber >= 39 && atomicNumber <= 48) || 
			   (atomicNumber >= 72 && atomicNumber <= 80) || 
			   (atomicNumber >= 104 && atomicNumber <= 112);
	}
	
	public boolean isAlkaliMetal() {
		
		return alkaliMetals[atomicNumber];
	}

	public int getAtomicNumber() {
		return this.atomicNumber;
	}
	
//	public void setAtomicNumber(int atomicNumber) {
//		if(atomicNumber > 0) {
//			this.atomicNumber = atomicNumber;
//		}
//	}

	public String getSymbol() {
		return symbol;
	}

//	public void setSymbol(String symbol) {
//		this.symbol = symbol;
//	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}
	
	
	
}

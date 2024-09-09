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

	@Override
	public String toString() {
		return "ChemicalElement [atomicNumber=" + atomicNumber + ", symbol=" + symbol + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + atomicNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChemicalElement other = (ChemicalElement) obj;
		if (atomicNumber != other.atomicNumber)
			return false;
		return true;
	}

//	public void setName(String name) {
//		this.name = name;
//	}
	
//	@Override
//	public String toString() {
//		return "He he he :)";
//	}
	
	
	
}

package com.ibm.training.basics;

class OuterClass{
	private int i = 27;
	
	public void outerOp() {
		CloseHelper innerObj = new CloseHelper();
		innerObj.someOperationOfHelper();
	}
	
		
	class CloseHelper {
		
		private void someOperationOfHelper() {
			i++;
			System.out.println("i after increment = " + i);
		}
	}
}



public class InnerClassDemo {

	public static void main(String[] args) {
		OuterClass obj = new OuterClass();
		obj.outerOp();

	}

}

package com.ibm.training.misc;

class Parent1{
	public void aVeryValuableMethod() {
		//kkkkkkkkkkkk
	}
}

class Parent2{
	public void anotherVeryImpMethod(){
		//kkkkkkkkllllllll
	}
}

class Child extends Parent1{
	
	class MultiHelper extends Parent2{
		
	}
	public void anotherVeryImpMethod(){
		new MultiHelper().anotherVeryImpMethod();
	}
	
	
}

public class AlternativeToMulInh {

	public static void main(String[] args) {
		Child obj = new Child();
		obj.aVeryValuableMethod();
		obj.anotherVeryImpMethod();
	}
}

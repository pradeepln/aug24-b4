package com.ibm.training.basics;

public class FinalDemo {

	public static void main(String[] args) {
		int i = 25;
		
		i = 27;
		
		i++;
		
		final int FI = 42;
		
//		FI = 71;
//		FI++;
//		FI += 12;
		
		final Employee e = new Employee(1, "hhhh");
		
		e.salary = 23344;
		e.setName("pradeep");
		
		//e = new Employee(23, "kkkk");
		Employee e1 = new Employee(88, "jjjj");
		
		//e = e1;
	}
	
	

}


//final 
class Parent{
	//final 
	public void doSomething() {}
}

class Child extends Parent{
	
	@Override
	public void doSomething() {
		
	}
}
package com.ibm.training.basics;



class Manager extends Employee{
	
	int teamSize;

	public Manager(int id,String name,float salary,int teamSize) {
		super(id,name,salary);
		this.teamSize = teamSize;
		System.out.println("In manager constr....");
	}
	
	
	public int getTeamSize() {
		return teamSize;
	}
	
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	
	
}

public class ConstructorChainingDemo {

	public static void main(String[] args) {
		
		Manager m = new Manager(12,"aaaa",12233,10);

	}

}

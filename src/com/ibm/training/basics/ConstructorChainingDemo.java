package com.ibm.training.basics;

class Employee {
	int id;
	String name;
	float salary;
	
	public Employee(int id,String name,float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		System.out.println("In emp constr");
	}
	
	public Employee(int id,String name) {
		this(id,name,0);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}

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

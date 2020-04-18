package com.syntax.class26;

public class Employee {
	
	// define private variable in order to achieve encapsulation
	// getters
	private String name; // the reason of making variable is to secure them
	
	private int age;
	
	private double salary;
	
	// define public methods to give an access to private variables
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getSalary() {
		return salary;
	}
	
	//setters
	public void setName(String name) { // what variable you will give me I will initialize it like this
		if (!name.isEmpty()&& name.length()>3) { // we give verification. if the name that you give is not empty we'll initialize it
		this.name=name;
		}
	}
	
	
	public void setAge(int age) {
		if (age>1)
		this.age=age;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}

}

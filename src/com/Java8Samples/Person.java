package com.Java8Samples;

public class Person {
	private String firstName;
	private int salary;
	
	public Person(String fn, int sal){
		this.firstName = fn;
		this.salary = sal;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

}

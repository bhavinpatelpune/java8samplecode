package com.Java8SEII.OCP.Samples;

public class Employee {
	
	String dept, name;
	
	public Employee(String d, String n){
		dept = d;
		name = n;
	}

	public String toString() {
		return getDept() + ":" + getName();
	}

	public String getDept() {
		return dept;
	}

	public String getName() {
		return name;
	}
}

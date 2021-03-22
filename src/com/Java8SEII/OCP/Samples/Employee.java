package com.Java8SEII.OCP.Samples;

public class Employee {
	
	String dept, name, lname;
	
	public Employee(String d, String n, String l){
		dept = d;
		name = n;
		lname = l;
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
	
	public String getLName() {
		return lname;
	}
}

package com.EmployeeDetails;

public class Employee {
	private int empId;
	private String empName;
	private int ssn;
	private double salary;

	public Employee(int empId,String empName, int ssn, double salary){
		this.empId = empId;
		this.empName = empName;
		this.ssn = ssn;
		this.salary = salary;
	}
	
	public int getID(){
		return this.empId;
	}
	
	public String getName(){
		return this.empName;
	}
	
	public int getSSN(){
		return this.ssn;
	}
	
	public double getSalary(){
		return this.salary;
	}
	
	public void setName(String empName){
		this.empName = empName;
	}	
}

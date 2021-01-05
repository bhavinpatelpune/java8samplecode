package com.myDemo.Sample;
// Java program to illustrate the 
// concept of Association 
//import java.io.*; 

// class bank 
class Bank 
{ 
	private String name; 
	
	// bank name 
	Bank(String name) 
	{ 
		this.name = name; 
	} 
	
	public String getBankName() 
	{ 
		return this.name; 
	} 
} 

// employee class 
class Employee 
{ 
	private String name; 
	
	// employee name 
	Employee(String name) 
	{ 
		this.name = name; 
	} 
	
	public String getEmployeeName() 
	{ 
		return this.name; 
	} 
} 

// Association between both the 
// classes in main method 
class Association 
{ 
	public static void main (String[] args) 
	{ 
		Bank bank = new Bank("ORACLE"); 
		Employee emp = new Employee("BHAVIN"); 
		
		System.out.println(emp.getEmployeeName() + 
			" is employee of " + bank.getBankName()); 
	} 
} 

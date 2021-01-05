package com.EmployeeDetails;

public class EmployeeTest {
	public static void main(String args[]){
		Employee em = new Employee(1, "Bhavin", 123456789, 100.20);
		System.out.println("Employee ID - " + em.getID());
		System.out.println("Employee Name - " + em.getName());
		System.out.println("Employee SSN - " + em.getSSN());
		System.out.println("Employee Salary - " + em.getSalary());
	}
}

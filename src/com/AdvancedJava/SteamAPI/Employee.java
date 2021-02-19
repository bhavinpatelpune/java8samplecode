package com.AdvancedJava.SteamAPI;

import java.util.Date;

public class Employee {

	private Integer id;
	private String name;
	private String department;
	private Double salary;
	private Date joiningdate; 

	public Employee(Integer id, 
					String name, 
					String department, 
					Double salary,
					Date date) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.joiningdate = date;
	}
	
	// Setter Methods for each private variable
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void setJoiningdate(Date joiningdate) {
		this.joiningdate = joiningdate;
	}

	// Getter Methods for each private variable
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}	

	public String getDepartment() {
		return department;
	}	

	public Double getSalary() {
		return salary;
	}
	
	public Date getJoiningdate() {
		return joiningdate;
	}	

	@Override
	public String toString() {
		return "Employee: ID=" + id + ", NAME=" + name + ", DEPARTMENT=" + department + ", SALARY=" + salary + ", Joining Date=" + joiningdate ;
	}    
}

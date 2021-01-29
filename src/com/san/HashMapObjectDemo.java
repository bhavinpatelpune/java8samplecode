package com.san;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HashMapObjectDemo {

	public static void main(String[] args) {
		
			try( Scanner in = new Scanner(System.in)){
				
				
		        System.out.println("How many employees?\n");
		        int noOfEmployees = in.nextInt();
		        Employee[] employees = new Employee[noOfEmployees];
		        
		   
		        for (int i = 0; i < employees.length; i++) {
		        	
		            Employee employee = new Employee();
		            
		            System.out.print("Enter employee id: ");
		            int employeeID = in.nextInt();
		            employee.setId(employeeID);
		            
		            System.out.print("Enter employee name: ");
		            String employeeName = in.next();
		            employee.setName(employeeName);
	
		            System.out.print("Enter employee depatment: ");
		            String department = in.next();
		            employee.setDepartment(department);
		            
		            System.out.print("Enter salary: ");
		            Double salary = in.nextDouble();
		            employee.setSalary(salary);
	
		            employees[i] = employee;
		        }
			
	        Arrays.sort(employees);
	        
	       /* for (Employee employee : employees) {
	            System.out.println(employee.getName() + "'s salary = " + employee.getSalary());
	        }*/
	        
	        List<Employee> allEmployees=Arrays.asList(employees);
			Map<String, Employee> topEmployees =
				    allEmployees.stream()
				                .collect(Collectors.groupingBy(
				                    e -> e.department,
				                    Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(e -> e.salary)), Optional::get) 
				                ));
			
			System.out.println(topEmployees);
			}
			catch(Exception e){
				e.printStackTrace();
			}
	    }
		
		

	}



package com.AdvancedJava.SteamAPI;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collector;
//import java.util.stream.Stream;
import java.util.stream.Collectors;

public class StreamMain {
	
	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();	
		
		empList.add(new Employee(1, "Bhavin", "Consulting", 19999.00, new Date()));
		empList.add(new Employee(2, "Manoj", "Consulting", 29999.00, new Date()));
		empList.add(new Employee(3, "Ranjit", "Consulting", 39999.00, new Date()));
		empList.add(new Employee(4, "Yogesh", "Support", 19999.00, new Date()));
		empList.add(new Employee(5, "Sanjay", "Support", 29999.00, new Date()));
		empList.add(new Employee(6, "Manoj", "HR", 9999.00, new Date()));
		
		// Print all employee from given ArrayList
		// empList.stream().forEach(System.out::println);
		
		// find employees whose salaries are above 20000
        empList.stream()
        	   .filter(e -> e.getSalary() > 20000)
        	   .forEach(System.out::println);
        
        System.out.println("---------------------------------");
        
        // find employees whose belong to Support group
        empList.stream()
        	   .filter(e -> e.getDepartment().contains("Support"))
        	   .forEach(System.out::println);
        
        System.out.println("---------------------------------");
        
        // Find salary>30000 , get only List of name, print only 1st value and collect list into new List<> object & print
        List<String> empNames = empList.stream()
						        	   .filter(e -> e.getSalary() > 30000)
						        	   .map(Employee::getName)
						        	   .limit(1)
						        	   .collect(Collectors.toList());
        System.out.println(empNames);
        //empNames.stream().forEach(System.out::println);
        
        System.out.println("---------------------------------");
        
        // find distinct employee count
        long count = empList.stream()
			                .filter(d -> d.getSalary() > 30000)
			                .distinct()
			                .limit(3)
			                .count();
        System.out.println(count);
        
        System.out.println("---------------------------------");
        
        // print only Even number of employee-ID
        empList.stream().filter(e -> e.getId()%2 == 0).forEach(System.out::println);
 	    
        System.out.println("---------------------------------");
        
        // print only Odd number of employee-ID
        empList.stream().filter(e -> e.getId()%2 == 1).forEach(System.out::println);
        
	}

}

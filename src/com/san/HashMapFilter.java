package com.san;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class HashMapFilter {

		public static void main(String [] args){
			
			Map<Integer,String> hmap=new HashMap<Integer,String>();
			hmap.put(1, "Sanjay");
			hmap.put(2, "Sanjay");
			hmap.put(3, "Kiran");
			
			//forEach to iterate over map
			hmap.forEach((k, v) ->System.out.println(k + " : " + v));
				
			//filter by key and value
			Map<Integer, String> result = hmap.entrySet()
			         .stream()
			         .filter(p -> p.getKey().intValue() == 3) //filter by key
			         .filter(map -> map.getValue().contains("r")) //filter by value
			         .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

			     System.out.println("Result: " + result);
			     
			     Employee employee1=new Employee(1,"Sanjay","Dept1",5000);
			     Employee employee2=new Employee(1,"Sanja","Dept2",5000);
			     Employee employee3=employee1;
			     Map<Employee,String> hMapObject=new HashMap();
			     hMapObject.put(employee1, "Employee 1");
			     hMapObject.put(employee2, "Employee 2");
			     hMapObject.put(employee3, "Employee 3");
			     
			     hMapObject.forEach((k, v) ->System.out.println(k + " : " + v));
			     
			     for(Entry<Employee, String> e : hMapObject.entrySet()) {
						System.out.println(e.getKey()+" "+e.getValue());
					}
			     
			     System.out.println("The Value is: " + hMapObject.get(employee1));
			     System.out.println("The Value is: " + hMapObject.get(employee3));
			     
			     TreeSet<Employee> ts=new TreeSet(Comparator.comparing(Employee::getName));
			     ts.add(employee1);
			     //ts.add(employee2);
			     
			     for(Employee e : ts){
			    	 System.out.println(e);
			     }
			     
		}
}

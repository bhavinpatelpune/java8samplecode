package com.Java8SEII.OCP.Samples;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;
import java.util.stream.Stream;

public class SetExample {

	public static void main(String[] args) {

//		Set<Vehicle> vehicles = new TreeSet<>();
//		vehicles.add(new Vehicle (10123, "Ford"));
//		vehicles.add(new Vehicle (10124, "BMW"));
//		System.out.println(vehicles);
		// Exception in thread "main" java.lang.ClassCastException: com.Java8SEII.OCP.Samples.Vehicle cannot be cast to java.lang.Comparable

		
		Set list = new HashSet();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("1");
		list.forEach(System.out::print); // 123
		
		System.out.println("---------------------------");
		
//		Stream<String> stream = Arrays.stream(new String[] {"a","b","c"});
//		String output = stream.filter(s->{ 
//			if(s.compareTo("abc") > 0)
//				return true;
//		})
//		.peek(System.out::print)
//		.collect(Collectorsjoining()); //Compilation Fail Here
//		System.out.println(output);
		
		
		Vector obj = new Vector(4,2);
		obj.addElement(new Integer(3));
		obj.addElement(new Integer(2));
		obj.addElement(new Integer(5));
		System.out.println(obj.capacity());
		
		System.out.println("---------------------------");
		
//		Set _set = new HashSet();
		Set _set = new TreeSet();
		_set.add(new Integer(2));
		_set.add(new Integer(1));
		System.out.println(_set); // [1,2] TreeSet will Guaranteed Sorting
		
		System.out.println("---------------------------");
		
		Set<Integer> ss = new HashSet<Integer>();
		Integer i1 = 45;
		Integer i2 = 46;
		ss.add(i1);
		ss.add(i1);
		ss.add(i2);
		System.out.print(ss.size() + " ");
		ss.remove(i1);
		System.out.print(ss.size() + " ");
		i2=47;
		ss.remove(i2);
		System.out.print(ss.size() + " ");
		
		System.out.println("---------------------------");
	}

}

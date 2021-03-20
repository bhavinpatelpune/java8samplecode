package com.Java8SEII.OCP.Samples;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {

		Set<Vehicle> vehicles = new TreeSet<>();
		vehicles.add(new Vehicle (10123, "Ford"));
		vehicles.add(new Vehicle (10124, "BMW"));
		System.out.println(vehicles);
		// Exception in thread "main" java.lang.ClassCastException: com.Java8SEII.OCP.Samples.Vehicle cannot be cast to java.lang.Comparable

	}

}

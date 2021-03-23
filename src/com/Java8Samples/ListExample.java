package com.Java8Samples;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleFunction;

public class ListExample {

	public static void main(String[] args) {

		List<Person> prog = Arrays.asList(
				new Person("Smith",1500),
				new Person("John",2000),
				new Person("Joe",1000)
				);
		
		double dval = prog.stream()
				.filter(s->s.getFirstName().startsWith("J"))
				.mapToInt(Person::getSalary)
				.average()
				.getAsDouble();
		
		System.out.println(dval); //1500.0
		
		System.out.println("---------------------------");
				
		
		List<Double> doubles = Arrays.asList (100.12, 200.32);
		DoubleFunction funD = d -> d + 100.0;
		//doubles.stream().forEach(funD); // line n1
		doubles.stream().forEach(e -> System.out.println(e)); // line n2

	}

}

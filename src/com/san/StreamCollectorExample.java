package com.san;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectorExample {

	public static void main(String[] args) {
		
		List<Student> list =new ArrayList<Student>();
		list.add(new Student(1, "Sanjay", 20));
		list.add(new Student(2, "San", 21));
		list.add(new Student(2, "Abhi", 21));
		
		List<String> names=list
				.stream().map(s->s.name)
				.collect(Collectors.toList());
		
		List<String> namesWithA=list
				.stream().map(s->s.name)
				.filter(s->s.startsWith("A"))
				.collect(Collectors.toList());
		
		List<Integer> ageCheck=list
				.stream().map(s->s.age)
				.filter(s->s.intValue() ==21)
				.collect(Collectors.toList());
		
		System.out.println(names);
		System.out.println(namesWithA);
		System.out.println(ageCheck);
	}

}

class Student{
	
	int id;
	String name;
	int age;
	
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	
}

package com.Java8SEII.OCP.Samples;

class Person implements Comparable<Person> {
	
	String name;
	
	Person(String name){
		this.name = name;
	}

	public int compareTo(Person p1, Person p2) {
		return p1.name.compareTo(p2.name);
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}

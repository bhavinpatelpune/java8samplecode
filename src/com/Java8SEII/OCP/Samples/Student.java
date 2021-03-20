package com.Java8SEII.OCP.Samples;

public class Student {

	String course, name, city;
	
	public Student(String name, String course, String city){
		this.course = course;
		this.name = name;
		this.city = city;
	}
	
	public String toString(){
		return course + " : " + name + " : " + city;
	}

	public String getCourse() {
		return course;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}
	
}

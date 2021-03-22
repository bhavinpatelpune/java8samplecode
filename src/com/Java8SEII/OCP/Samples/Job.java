package com.Java8SEII.OCP.Samples;

import java.util.function.DoubleSupplier;

public class Job {
	
	String name;
	Integer cost;
		
	Job(String name, Integer cost){
		this.name = name;
		this.cost = cost;
	}
	
	String getName(){
		return name;
	}
	
	int getCost(){
		return cost;
	}

	public static void main(String[] args) {
		Job j1 = new Job("IT", null);
		DoubleSupplier js1 = j1::getCost;
		System.out.println(j1.getName() + ":" + js1.getAsDouble()); ///Exception in thread "main" java.lang.NullPointerException
	}

}

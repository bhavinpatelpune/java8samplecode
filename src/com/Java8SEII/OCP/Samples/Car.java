package com.Java8SEII.OCP.Samples;

public class Car {
	int vno;
	String name;
	
	public Car(int vno, String name){ 
		this.vno = vno;
		this.name = name;
	}
	
	public String toString () { 
		return vno + " : " + name;
	}
}

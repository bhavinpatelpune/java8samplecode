package com.Java8SEI.OCA.Samples;

public class TestBoolean {

	public static void main(String[] args) {
		TestBoolean ts = new TestBoolean();
		System.out.println(isAvailable + " "); //true 
		
		isAvailable = ts.doStuff();
		System.out.println(isAvailable);  // false
	}
	
	public static boolean doStuff(){
		return !isAvailable;
	}
	
	static boolean isAvailable = true;

}

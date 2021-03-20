package com.Java8SEI.OCA.Samples;

public class MainCall {
	
	public static void main(String[][] args) {
		System.out.println("PATEL");
	}
	
	public static void main(int[] args) {
		System.out.println("JAVA");
	}
	
	public static void main(String... args) {
		System.out.println("BHAVIN");  
		// OP: BHAVIN, bcs String... is same as String[]
		//The three dots ( ... ) are used in a function's declaration as a parameter. 
		//These dots allow zero to multiple arguments to be passed when the function is called. 
		//The three dots are also known as var args .
	}
}

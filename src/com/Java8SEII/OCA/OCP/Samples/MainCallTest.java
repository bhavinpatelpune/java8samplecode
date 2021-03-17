package com.Java8SEII.OCA.OCP.Samples;

public class MainCallTest {

	public static void main(String[] args) {
		System.out.println("String Main " + args[0]);
	}
	
	public static void main(int[] args) {
		System.out.println("int Main " + args[0]);
	}
	
	public static void main(Object[] args) {
		System.out.println("Object Main " + args[0]);
	}
	
//	Run command as below
//	javac MainCallTest.java
//	java MainCallTest 1 2 3
	
// OP: 	String Main 1

}

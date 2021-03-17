package com.Java8SEII.OCA.OCP.Samples;

public class PrintValues {
	
	public static void main(String[] args) {
	
		System.out.println("5+2=" + 3 + 4);		// OP: 5+2=34
		System.out.println("5+2=" + (3 + 4));	// OP: 5+2=7
		
		System.out.println("-----------------");
		
		String str = " ";
		str.trim();
		System.out.println(str.equals("") + " " + str.isEmpty());  // OP: false false
	}
}

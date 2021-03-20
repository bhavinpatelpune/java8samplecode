package com.Java8SEI.OCA.Samples;

public class PrintValues {
	
	int count;
	
//	public static void displayCount(){
//		count++; //Cannot make a static reference to the non-static field count
//	}
	
	public static void main(String[] args) {
	
		System.out.println("5+2=" + 3 + 4);		// OP: 5+2=34
		System.out.println("5+2=" + (3 + 4));	// OP: 5+2=7
		
		System.out.println("-----------------");
		
		String str = " ";
		str.trim();
		System.out.println(str.equals("") + " " + str.isEmpty());  // OP: false false
		
		
	}
}

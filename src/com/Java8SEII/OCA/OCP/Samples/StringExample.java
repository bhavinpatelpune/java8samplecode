package com.Java8SEII.OCA.OCP.Samples;

public class StringExample {

	public static void main(String[] args) {

		String str = "JavaSE";
		int strLoc = str.indexOf("S");
		char cTxt = str.charAt(strLoc);
		System.out.println(cTxt); // OP: S
		
		String name = "";
		name.concat("Bhavin");
		name.concat("Patel");
		System.out.println("My Name is : " + name); // OP: My Name is : 
		
		String txt = "Bhavin Patel";
		System.out.println(txt.length());  // OP: 12
		
		float price = 120;
		System.out.println(price + " INR");
		
		
		

		String ta = "A ";
		ta = ta.concat("B ");
		String tb = "C ";
		ta = ta.concat(tb);
		ta.replace('C', 'D');
		ta = ta.concat(tb);
		System.out.println(ta); // A B C C 
		
		
		
	}

}

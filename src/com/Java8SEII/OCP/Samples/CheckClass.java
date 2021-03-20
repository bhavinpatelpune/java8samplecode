package com.Java8SEII.OCP.Samples;

import java.util.Arrays;

public class CheckClass {
	
	public static int checkValue (String s1, String s2)	{ 
		return s1.length() - s2.length();
	}

	public static void main(String[] args) {
		String[] strArray = new String[]{"Tiger","Rat","Cat","Lion"};
		
		Arrays.sort(strArray, CheckClass::checkValue);
		
		for(String s: strArray){
			System.out.print(s + " "); //OP: Rat Cat Lion Tiger 
		}

	}

}

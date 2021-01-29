package com.san;

import java.util.Arrays;

/*
Logic:
1] Sort both strings
2] Compare the sorted strings
*/

public class AnagramsCheck {
	
	static void Method1(String s1, String s2){        
	    boolean isAnagram1= Arrays.equals(s1.chars().sorted().toArray(),
	        	    					  s2.chars().sorted().toArray());
	    System.out.println("Given string is Anagram: " + isAnagram1);
	}

	public static void main(String[] args) {
		Method1("Cat","cAB");	    
	}
}
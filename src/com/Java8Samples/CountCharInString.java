package com.Java8Samples;

import java.util.*;

public class CountCharInString {

	public static void CountCharInString(String pStr) {
		//Using Hashmap of char,int for key value
		HashMap<Character, Integer> chCount = new
		HashMap<Character, Integer>();
		
		//Converting String to Char Array for counting
		char[] chrArray = pStr.toCharArray();
		
		// Read each char from loop and add count value if contain same key
		for(char c: chrArray){
			if(chCount.containsKey(c)){
				chCount.put(c, chCount.get(c)+1);
			}
			else{
				chCount.put(c, 1);
			}
		}
		
		//finally print hashmap values
		for(Map.Entry _entry: chCount.entrySet()){
			System.out.println(_entry.getKey() + " " + _entry.getValue());
		}		
	}
	
	public static void main(String[] args) {
		String _str = "Bhavin Patel";
		
		// Call the replaceAll() method - > Will remove all whitespace from given string 
		_str = _str.replaceAll("\\s", ""); 
		CountCharInString(_str);
	}

}

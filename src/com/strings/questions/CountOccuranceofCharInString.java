package com.strings.questions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountOccuranceofCharInString {
	
	// Using LinkedHashMap / HashMap
	public static void countOccuranceChar(String _str){
		
		// This will give un-ordered group of char values in map
		// Map<Character, Integer> _map = new HashMap<>(_str.length());
		
		// This will give ordered group of char values in Linked hash  map
		Map<Character, Integer> _map = new LinkedHashMap<>(_str.length());
		for (char c : _str.toCharArray()) {
			_map.put(c, _map.containsKey(c) ? _map.get(c) + 1 : 1);
		}
		
		System.out.println(_map);
		
		for(Entry<Character, Integer> _entry : _map.entrySet()){
				System.out.println("Key : " + _entry.getKey() + ", Value : " + _entry.getValue());
			}	
	}
	
	
	// Tradition looping method
	public static void countOccuranceCharTraditional(String _pstr){
		char someChar = 'e';
		int count = 0;
		 
		for (int i = 0; i < _pstr.length(); i++) {
		    if (_pstr.charAt(i) == someChar) {
		    	System.out.println(i);
		        count++;
		    }
		}
	}
	
	
	// Using recursion
	private static int countOccurencesRecursion(String someString, char searchedChar, int index) {
	    if (index >= someString.length()) {
	        return 0;
	    }
	    
	    int count = someString.charAt(index) == searchedChar ? 1 : 0;
	    return count + countOccurencesRecursion(someString, searchedChar, index + 1);
	}
	
	
	// Using Java-8
	private static long countOccurencesJava8(String someString, char searchedChar) {
		return  someString.chars().filter(ch -> ch == searchedChar).count();
	}
	
	
	public static void main(String[] args) {
		
		String _str = "BhavinPatelPune";	
		countOccuranceChar(_str);
		countOccuranceCharTraditional(_str);
	}

}

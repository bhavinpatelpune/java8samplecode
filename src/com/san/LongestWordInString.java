package com.san;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LongestWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Today is the  happyanniversari a happyanniversary day of my life";
		
		//first longest word in string that is even
	    System.out.println(Arrays
	    		.stream(s.split(" "))
	    		.filter(s1 -> s1.length() % 2 == 0) 
	    		.max(Comparator.comparingInt(String::length)).orElse(null));
	    
	   String s1="nayak";
	    
	   System.out.println(
			   	s1.chars()
			   .sorted()
			   .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
			   .reverse()
	    	   );
	   
	   System.out.println(
			   s1.chars()
			   .sorted()
			   .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	    	  );   
	   
	   Map<Character, Integer> frequencies = s1.chars().boxed()
		        .collect(Collectors.toMap(
		                // key = char
		                k -> Character.valueOf((char) k.intValue()),
		                v -> 1,         // 1 occurence
		                Integer::sum));
	   
	   Map<Character, Integer> freqs = new HashMap<>();
	   for (char c : s1.toCharArray()) {
	       freqs.merge(c,                  // key = char
	                   1,                  // value to merge
	                   Integer::sum);      // counting
	   }
	   System.out.println("Frequencies:\n" + freqs);
	   System.out.println(frequencies);
	   
	}

}

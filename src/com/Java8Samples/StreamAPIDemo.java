package com.Java8Samples;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
// Below Two imports are related to StreamAPI & Functions (Java-8)
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamAPIDemo {
	
	// Count value in a given array, if count is more than two group by used to sum values
	static void StreamCount(String[] _str){
	 List<String> items = Arrays.asList(_str);
	 Map<String, Long> result = items.stream()
        							 .collect(Collectors.groupingBy(Function.identity(), 
        							  		  Collectors.counting()));
	  System.out.println(result);
	}
	
	static void StreamArraySorting(String[] _str){
	  List<String> items = Arrays.asList(_str);
	  Map<String, Long> result = items.stream()
			  						  .collect(Collectors.groupingBy(Function.identity(),
			  								   Collectors.counting()));
	  
	  Map<String, Long> finalMap = new LinkedHashMap<>();

      //Sort a map and add to finalMap
      result.entrySet().stream()
              		   .sorted(Map.Entry.<String, Long>comparingByValue()
                       .reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

      System.out.println(finalMap);
	}
	
	static void printSqRootofNumber(Integer[] _i){
		List<Integer> numList = Arrays.asList(_i);
		List<Integer> _sqRoot = numList.stream().map(y-> y*y).collect((Collectors.toList()));
		System.out.println(_sqRoot);
	}
	
	public static void main(String[] args) {
	   String[] _list = {"Google", "Google", "Facebook","Amazon", "Oracle", "Amazon", "Oracle"};
	   StreamCount(_list);
	   StreamArraySorting(_list);
	   
	   Integer[] _intList = {2,3,4,5};
	   printSqRootofNumber(_intList);
	   
	   
	// create a list of String 
	    List<String> names = 
	                Arrays.asList("Reflection","Collection","Stream"); 
	  
	    // demonstration of filter method 
	    List<String> result = names.stream().filter(s->s.startsWith("S")). 
	                          collect(Collectors.toList()); 
	    System.out.println(result); 
	  
	    // demonstration of sorted method 
	    List<String> show = 
	            names.stream().sorted().collect(Collectors.toList()); 
	    System.out.println(show); 
	  
	    // create a list of integers 
	    List<Integer> numbers = Arrays.asList(2,3,4,5,2); 
	  
	    // collect method returns a set 
	    Set<Integer> squareSet = 
	         numbers.stream().map(x->x*x).collect(Collectors.toSet()); 
	    System.out.println(squareSet); 
	  
	    // create a list of integers 
	    List<Integer> number = Arrays.asList(2,3,4,5); 
		// demonstration of forEach method 
	    number.stream().map(x->x*x).forEach(y->System.out.println(y)); 
	  
	    // demonstration of reduce method 
	    int even = 
	       number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i); 
	  
	    System.out.println(even); 
	}
	
}

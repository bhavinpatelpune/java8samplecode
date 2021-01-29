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
/*
What Is a Stream?
So what is a stream? Informally, you can think of it as a “fancy iterator” that supports database-like operations. 
Technically, it’s a sequence of elements from a source that supports aggregate operations. Here’s a breakdown of the more 
formal definition:

Sequence of elements
A stream provides an interface to a sequenced set of values of a specific element type. However, streams don’t actually store 
elements; they’re computed on demand.

Source
Streams consume from a data-providing source such as collections, arrays, or I/O resources.

Aggregate operations
Streams support database-like operations and common operations from functional programming languages, 
such as filter, map, reduce, findFirst, allMatch, sorted, and so on.

Furthermore, stream operations have two additional fundamental characteristics that differentiate them from collections:

Pipelining
Many stream operations return a stream themselves. This allows operations to be chained to form a larger pipeline. 
This style enables certain optimizations such as laziness, short-circuiting, and loop fusion.

Internal iteration
In contrast to collections, which are iterated explicitly (external iteration), stream operations do the iteration behind the 
scenes for you.
*/
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

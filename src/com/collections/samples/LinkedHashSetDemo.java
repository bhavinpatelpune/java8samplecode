package com.collections.samples;

/*
The LinkedHashSet is an ordered version of HashSet that maintains a doubly-linked List across all elements.
When the iteration order is needed to be maintained this class is used. When iterating through a HashSet 
the order is unpredictable, while a LinkedHashSet lets us iterate through the elements in the order in 
which they were inserted. When cycling through LinkedHashSet using an iterator, the elements will 
be returned in the order in which they were inserted.
*/

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
	 LinkedHashSet<String> lhs = new LinkedHashSet<String>();
	 lhs.add("Oracle");
	 lhs.add("Java");
	 lhs.add("Spring");
	 lhs.add("Oracle19c");
	 lhs.add("Java8");
	 lhs.add("Spring2");
	 lhs.add(null);
	 
	 // Method-1 to print value using Iterator
	 Iterator itr = lhs.iterator();
	 while(itr.hasNext()){
		 System.out.println(itr.next() + " ");
	 }
	 
	 System.out.println("----------");
	 
	 // Method-2 to print value using Enhanced Loop
	 for(String s: lhs){
		 System.out.println(s + " ");
	 }
	 
	}

}

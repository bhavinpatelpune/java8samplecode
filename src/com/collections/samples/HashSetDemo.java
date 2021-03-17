package com.collections.samples;

/*
The HashSet class implements the Set interface, backed by a hash table which is actually a HashMap instance. 
No guarantee is made as to the iteration order of the set which means that the class does not guarantee the 
constant order of elements over time. This class permits the null element. The class also offers constant 
time performance for the basic operations like add, remove, contains, and size assuming the hash function 
disperses the elements properly among the buckets.
*/

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		 hs.add("Oracle");
		 hs.add("Java");
		 hs.add("Spring");
		 hs.add("Oracle19c");
		 hs.add("Java8");		 
		 hs.add("Spring2");
		 hs.add("Java8");
		 hs.add(null);
	
		 // Method-1 to print value using Iterator		 
		 Iterator itr = hs.iterator();
		 while(itr.hasNext()){
			 System.out.println(itr.next() + " ");
		 }
		 
		 System.out.println("----------");
		 
		 // Method-2 to print value using Enhanced Loop
		 for(String s: hs){
			 System.out.println(s + " ");
		 }		 
	}
}

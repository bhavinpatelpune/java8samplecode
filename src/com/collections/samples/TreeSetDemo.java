package com.collections.samples;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Oracle");
		ts.add("Java");
		ts.add("Spring");
		ts.add("Oracle19c");
		ts.add("Java8");
		ts.add("Spring2");
		ts.add(null); // Treeset don't allow Null value ==> java.lang.NullPointerException
	
		 // Method-1 to print value using Iterator		 
		 Iterator itr = ts.iterator();
		 while(itr.hasNext()){
			 System.out.println(itr.next() + " ");
		 }
		 
		 System.out.println("----------");
		 
		 // Method-2 to print value using Enhanced Loop
		 for(String s: ts){
			 System.out.println(s + " ");
		 }	

	}

}

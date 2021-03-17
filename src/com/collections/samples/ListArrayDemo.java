package com.collections.samples;

import java.util.ArrayList;
import java.util.List;

public class ListArrayDemo {
	
	public static void main(String[] args) {
		
		 List<Integer> ls = new ArrayList<>();
		 ls.add(0,10);
		 ls.add(0,20);
		 ls.add(1,30);
		 
		 System.out.println(ls);  //O/P: [20, 30, 10]		 
		}
}

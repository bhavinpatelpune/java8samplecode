package com.Java8SEII.OCP.Samples;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiFunction;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer, String> books = new TreeMap<>(); 
		books.put (1007, "A");
		books.put (1002, "C");
		books.put (1001, "B");
		books.put (1003, "B"); 
		System.out.println(books);  //OP: {1001=B, 1002=C, 1003=B, 1007=A}
		
//		Map<Integer, Integer> mVal = new HashMap<>();
//		mVal.put(1, 10);
//		mVal.put(2, 20);
//		BiFunction<Integer, Integer, String> c = (i,jj)–> 
//			{
//				System.out.print(i + "," + jj + ";")
//			};
//		mVal.accept(1, 2);
//		mVal.forEach(c);
	}

}

package com.Java8SEII.OCP.Samples;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class TreeMapExample {
	
	public static void main(String[] args) {
		Map<Integer, String> unsortMap = new HashMap<>();
		
		unsortMap.put(10, "z");
		unsortMap.put(5, "b");
		unsortMap.put(1, "d");
		unsortMap.put(7, "e");
		unsortMap.put(50, "j");
		
		Map<Integer, String> treeMap = new TreeMap<Integer, String>(
				new Comparator<Integer>() {
					@Override
					public int compare(Integer o1, Integer o2) {
						return o2.compareTo(o1);
					}
				});
		
		treeMap.putAll(unsortMap);
		
		for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
			System.out.print(entry.getValue() + " ");  /// j z e b d 
		}
	}
}
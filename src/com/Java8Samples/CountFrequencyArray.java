package com.Java8Samples;

import java.util.*;

public class CountFrequencyArray {

	//Using HashMap
	public static void countFrequenciesUsingHashMap(ArrayList<String> list) 
    { 
        // hashmap to store the frequency of element 
        Map<String, Integer> hm = new HashMap<String, Integer>(); 
  
        for (String i : list) { 
            Integer j = hm.get(i); 
            hm.put(i, (j == null) ? 1 : j + 1); 
        } 
  
        // displaying the occurrence of elements in the arraylist 
        for (Map.Entry<String, Integer> val : hm.entrySet()) { 
            System.out.println("Element " + val.getKey() + " "
                               + "occurs" + ": " + val.getValue() + " times"); 
        } 
    } 
	
	//Using HashSet & Collections.Frequency
	public static void countFrequenciesUsingHashSet(ArrayList<String> list) 
    { 
        // hash set is created and elements of arraylist are insertd into it 
        Set<String> st = new HashSet<String>(list); 
        for (String s : st) 
            System.out.println(s + ": " + Collections.frequency(list, s)); 
    }
	
	//Using TreeMap
	public static void countFrequenciesUsingTreeMap(ArrayList<String> list) 
    {
        TreeMap<String, Integer> tmap = new TreeMap<String, Integer>(); 
        for (String t : list) { 
            Integer c = tmap.get(t); 
            tmap.put(t, (c == null) ? 1 : c + 1); 
        } 
  
        for (Map.Entry m : tmap.entrySet()) 
            System.out.println("Frequency of " + m.getKey() + " is " + m.getValue()); 
    } 
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); 
        list.add("Java");
        list.add("Object"); 
        list.add("Class");
        list.add("Methods");
        list.add("IO");
        list.add("Class");
        
        countFrequenciesUsingHashMap(list); 
        System.out.println("------------------------------------");
        countFrequenciesUsingHashSet(list);
        System.out.println("------------------------------------");
        countFrequenciesUsingTreeMap(list);
	}

}

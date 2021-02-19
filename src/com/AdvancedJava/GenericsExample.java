package com.AdvancedJava;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

	public static void main(String[] args) {

		// Example without Generics
        List names = new ArrayList();
        names.add("Bhavin");        
        String name = (String) names.get(0); 
        System.out.println("First name: " + name);
        //names.add(7);        
        
        // Example with Generics
        List<String> names2 = new ArrayList();
        names2.add("Bhavin");        
        String name2 = names2.get(0);
        System.out.println("First name: " + name2);
        //names2.add(7);
	}

}

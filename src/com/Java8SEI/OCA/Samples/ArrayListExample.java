package com.Java8SEI.OCA.Samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> myArrList = new ArrayList<>();
		myArrList.add("JAVA");
		myArrList.add("ORACLE");
		myArrList.add("SQL");
		myArrList.add("AWS");
		myArrList.add("AZURE");
		myArrList.add("ANGULAR");
		
		System.out.println(myArrList); // OP: [JAVA, ORACLE, SQL, AWS, AZURE, ANGULAR]
		
		System.out.println(myArrList.size()); // OP: 6
		System.out.println(myArrList.hashCode());  // OP: 1161498943  (random hash code value)
		
		System.out.println(myArrList.get(2));  // OP: SQL
		
		if(myArrList.contains("SQL")){
			System.out.println("Yes");   // OP: Yes
		} else {
			System.out.println("No");
		}
		
		System.out.println("-----------------");
		
		String[] nums = { "One", "Two", "Three" };
		List<String> myList = Arrays.asList(nums);
		
		System.out.println("My Numbs - " + nums);  // OP: My Numbs - [Ljava.lang.String;@15db9742
		System.out.println("MyList - " + myList);  // OP: MyList - [One, Two, Three]
		
		// Using Lamda Exp print uppercase value of list
		myList.replaceAll(s->s.toUpperCase());
		System.out.println(myList);  // OP: [ONE, TWO, THREE]
		
		System.out.println("-----------------");
		
		// OCA prepration
		List<Integer> elements = new ArrayList<>();
		//elements.add(10);
		//int firstElmnt = elements.get(1);
		//System.out.println(firstElmnt);  /// An IndexOutOfBoundsException is thrown at runtime.
		
		
		List<String> items = new ArrayList<>();
			items.add("Pen");
			items.add("Pencil");
			items.add("Box");
		for (String i : items) {
			if (i.indexOf("P") == 0) {
					continue;
			} else {
				System.out.print(i + " ");  // OP: Box
				}
			}
		
		System.out.println("-----------------");
		
		List<String> names = new ArrayList<>();
		names.add("Bhavin");
		names.add("Ranajit");
		names.add("Manoj");
		names.add("Giri");
		
		if(names.remove("Bhavin")){
			names.remove("Sanjay");
		}
		System.out.println(names);  // OP: [Ranajit, Manoj, Giri]
		
		System.out.println("-----------------");
		
		ArrayList<Integer> points = new ArrayList<>();
		points.add(1);
		points.add(2);
		points.add(3);
		points.add(4);
		points.add(null);
		
		points.remove(1);
		points.remove(null);
		System.out.println(points);  // OP: [1, 3, 4]
		
	}
}

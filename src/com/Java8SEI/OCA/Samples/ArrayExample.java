package com.Java8SEI.OCA.Samples;

import java.util.ArrayList;

public class ArrayExample {
	
	public static void main(String[] args) {
		
		String[] arr = { "A", "B", "C", "D"};
		for (int i = 0; i < arr.length; i++){
			System.out.println(arr[i] + " ");
			if(arr[i].equals("C")){
				continue;
			}
			System.out.println("Work Done!");  /// OP: A Work Done!
			break;
		}
		
		System.out.println("-----------------");
		
		String[] planets = {"Mercury","Venus","Mars","Earth"};
		System.out.println(planets);
		System.out.println(planets.length);
		System.out.println(planets[1]);
		System.out.println(planets[1].length()); 
//		OP: [Ljava.lang.String;@15db9742
//			4
//			Venus
//			5
		
		System.out.println("-----------------");
		
//		String[] stars = new String[2];
//		int idx=0;
//		for(String s:stars){
//			stars[idx].concat("Elelemt - " + idx);
//			idx++;
//		}
//		for(idx=0;idx<stars.length;idx++){
//			System.out.println(stars[idx]);  // OP: Exception in thread "main" java.lang.NullPointerException
//		}
		
		System.out.println("-----------------");
		
		int[] intArr = {1,2,3};
		for(int i : intArr){
			System.out.println(i + " ");
		}
		for(int i=0; i < intArr.length ; i++){
			System.out.println(intArr[i] + " ");
		}
		
		System.out.println("-----------------");
		
		int a[] = {1,2,3,4,5};
		for(int i=0; i<5; i+=2){
			System.out.println(a[i]); // 1 	3  5
		}
		
		System.out.println("-----------------");
		
//		ArrayList mylist = new ArrayList();
//		String[] myArray;
//		try{
//			while(true){
//				mylist.add("My String");
//			}
//		}catch(RuntimeException e){
//			System.out.println("Caught a RuntimeException");
//		}catch(Exception e){
//			System.out.println("Caught an Exception");
//		}
//		System.out.println("Ready to use"); 
		//Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
		
		System.out.println("-----------------");
		
		Planet[] myplanets = {
							new Planet("Mercury",0),
							new Planet("Venus",0),
							new Planet("Earth",1),
							new Planet("Mars",2)
							};
		
		System.out.println(myplanets);  // [Lcom.Java8SEI.OCA.Samples.Planet;@6d06d69c
		System.out.println(myplanets[2].name);  // Earth
		System.out.println(myplanets[2].moons); // 1
		
		
	}

}

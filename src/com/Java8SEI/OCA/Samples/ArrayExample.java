package com.Java8SEI.OCA.Samples;

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

	}

}

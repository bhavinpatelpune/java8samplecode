package com.Java8SEII.OCA.OCP.Samples;

public class DataTypeExample {
	
	static char c;
	static boolean b;
	static float f;
	
	static void printValues(){
		System.out.println("c: " + c);
		System.out.println("b: " + b);
		System.out.println("f: " + f);
	}
	
	public static void main(String[] args) {
		Short s1=200;
		Integer s2=400;
		Long s3= (long) s1 +s2;
		//String s4 = (String) (s3*s2);  /// Cannot cast from long to String
		//System.out.println("Sum is: " + s4);
	
		int data[] = {10, 20, 30, 40, 50};
		int key = 40;
		int count = 0;
		for(int e: data){
			if(e != key){
				continue;
			//	count++;  ///Unreachable code
			}
		}
		System.out.println(count + " Found");
		
		System.out.println("-----------------");		
		printValues();		
		
		System.out.println("-----------------");
		
		String str = "Java SE 8 1";
		int len = str.trim().length();
		System.out.println(len);  // OP: 11
		
		System.out.println("-----------------");
		
		int[] a = {1,2,3,4,5};
		System.out.println(a instanceof Object);  // true
		
	}
}

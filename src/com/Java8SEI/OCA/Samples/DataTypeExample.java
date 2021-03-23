package com.Java8SEI.OCA.Samples;

public class DataTypeExample {
	
	static char c;
	static boolean b;
	static float f;
	static Character cc;
	static String ss;
	
	float flt1 = 100.00F;
	float flt2 = (float) 1_11.00;
	// Float flt3 = 100.00;  //Type mismatch: cannot convert from double to Float
	
	double y1 = 203.22;
	// float flt4 = y1;  // Type mismatch: cannot convert from double to float
	
	int y2 = 100;
	float flt5 = (float) y2 ;
	
	static int aVar = 9;
	
	static void printValues(){
		System.out.println("c: " + c);  // c:
		System.out.println("cc: " + c);  // c: 
		System.out.println("b: " + b);  // b: false
		System.out.println("f: " + f);  // f: 0.0
		System.out.println("ss: " + ss);  // s: null
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
		
		System.out.println("-----------------");
		
		if(aVar++ < 10){
			System.out.println(aVar + " Hello Universe!"); // 10 Hello Universe!
		}else{
			System.out.println(aVar + " Hello World!");
		}
		
		System.out.println("-----------------");
		
		float var11 = (12_345.01 <= 123_45.00) ? 12_456 : 124_56.02f;
		float var22 = var11 + 1024;
		System.out.println(var22);  // 13480.02
		
		System.out.println("-----------------");
		
		
	}
}

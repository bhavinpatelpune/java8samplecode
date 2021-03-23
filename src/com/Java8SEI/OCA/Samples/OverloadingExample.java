package com.Java8SEI.OCA.Samples;

public class OverloadingExample {
	
	public static void doSum(Integer x, Integer y){
		System.out.println("Integer sum is: " + (x + y));
	}
	
	public static void doSum(double x, double y){
		System.out.println("double sum is: " + (x + y));
	}
	
	public static void doSum(float x, float y){
		System.out.println("float sum is: " + (x + y));
	}
	
	public static void doSum(int x, int y){
		System.out.println("int sum is: " + (x + y));
	}

	public static void main(String[] args) {
		doSum(10, 20);     // OP: int sum is: 30
		doSum(10.0, 20.0); // OP: double sum is: 30.0
		//doSum(10.0f, 20.0f); // OP: float sum is: 30.0
	}

}

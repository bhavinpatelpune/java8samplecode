package com.myDemo.Sample;

public class Overloading {
	
	public static int add(int a, int b){
		System.out.println("Calling -> int add(int a, int b) ");
		return a+b;
	}
	
	public static Integer add(Integer a, Integer b){
		System.out.println("Calling -> Integer add(Integer a, Integer b) ");
		return a+b;
	}

	public static void main(String[] args) {
		add(1,1); // It will call primitive type call first
	}
}

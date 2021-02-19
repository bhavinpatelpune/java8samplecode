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
	
//	static void display(Integer a){
//		System.out.println("Calling -> void display(Integer a)");
//	}
	
	static void display(String a){
		System.out.println("Calling -> void display(String a)");
	}
	
	static void display(Object a){
		System.out.println("Calling -> void display(Object a)");
	}

	public static void main(String[] args) {
		add(1,1); // It will call primitive type call first, Not use wrapper
		display(null); //It'll throw compile time error - "The method display(Integer) is ambiguous for the type Overloading"
	}
}

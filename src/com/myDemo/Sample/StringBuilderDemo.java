package com.myDemo.Sample;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Hello World");
		s1.insert(6,"Good ");
		System.out.println(s1); //Hello Good World
	}

}

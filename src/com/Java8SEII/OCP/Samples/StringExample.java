package com.Java8SEII.OCP.Samples;

import java.util.function.ToIntFunction;

public class StringExample {

	public static void main(String[] args) {
		
		// Question: 33 -> It says output as 1
		String str = "Java is a programming language"; 
		
		ToIntFunction<String> indexVal = str::indexOf; //line n1
		int x = indexVal.applyAsInt("Java"); //line n2
		System.out.println(x);  //OP: 0

	}

}

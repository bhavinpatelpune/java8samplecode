package com.Java8SEI.OCA.Samples;

import java.util.Arrays;
import java.util.List;

public class TestString {

	int a1;
	
	public static void doProduct(int a){
		a = a * a;
	}
	
	public static void doString(String s){
		s.concat(" " + s);
	}
	
	public static void main(String[] args) {
		TestString item = new TestString();
		item.a1 = 11;
		
		String sb = "Hello";
		
		Integer i = 10;
		
		doProduct(i);
		doString(sb);
		doProduct(item.a1);
		
		System.out.println(i + " " + sb + " " + item.a1 );  // 10 Hello 11
		
		System.out.println("-----------------");
		
//		String[] arr = {"Hi","How","Are","You"};
//		List<String> arrList = new ArrayList<>(Arrays.asList(arr));
//		if(arrList.removeIf((String s) -> (return s.length()<=2;)){
//			
//		}

	}

}

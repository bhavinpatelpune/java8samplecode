package com.AdvancedJava;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamDemo {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3);
		nums.stream().forEach(s -> System.out.println(s)); //Stream is by default Sequential, So Order will b same 
		System.out.println(" ");
		
		nums.parallelStream().forEach(s -> System.out.println(s));  //Order May change
		System.out.println(" ");
		
		nums.stream().forEach(s2 -> System.out.println(s2));
		System.out.println(" ");
	}

}

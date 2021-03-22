package com.Java8SEII.OCP.Samples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		List<String> nL = Arrays.asList("Jim", "John", "Jeff"); 
		Function<String, String> funVal = s -> "Hello : ".concat(s); 
		
		nL.stream().map(funVal)
				.peek(System.out::print); // The program prints nothing.
	}

}

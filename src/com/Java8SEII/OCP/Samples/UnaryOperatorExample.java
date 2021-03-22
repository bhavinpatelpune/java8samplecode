package com.Java8SEII.OCP.Samples;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	public static void main(String[] args) {
		List<Integer> codes = Arrays.asList (10, 20); 
		UnaryOperator<Double> uo = s -> s +10.0; 
		//codes.replaceAll(uo);  
// The method replaceAll(UnaryOperator<Integer>) in the type List<Integer> is not applicable for the arguments (UnaryOperator<Double>)
		codes.forEach(c -> System.out.println(c));
		
		System.out.println("---------------------------");
		
		final String str1 = "Java";
		StringBuffer strbuf = new StringBuffer("Course");
		UnaryOperator<String> u = (str2) -> str1.concat(str2);
		UnaryOperator<String> c = (str3) -> str3.toLowerCase();
		//System.out.println(u.apply(strbuf)); 
		// The method apply(String) in the type Function<String,String> is not applicable for the arguments (StringBuffer)

		System.out.println("---------------------------");
		
		String str = "Java is a programming language"; 
		ToIntFunction<String> indexVal = str::indexOf; //line n1 
		int x = indexVal.applyAsInt("Java"); //line n2
		System.out.println(x);  // 0
		
	}

}

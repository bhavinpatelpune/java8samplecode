package com.Java8SEII.OCP.Samples;

import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class IntConsumerExample {

	public static void main(String[] args) {
		IntConsumer consumer = e -> System.out.println(e);
		Integer value = 90;
		
//		Function<Integer> funRef = e -> e + 10; 
//		Integer result = funRef.apply(value);
		
//		IntFunction funRef1 = e -> e + 10; 
//		Integer result1 = funRef.apply (10);

		ToIntFunction<Integer> funRef2 = e -> e + 10;
		int result2 = funRef2.applyAsInt (value);
		
//		ToIntFunction funRef3 = e -> e + 10; 
//		int result3 = funRef3.apply (value);
		
		consumer.accept(result2);
	}

}

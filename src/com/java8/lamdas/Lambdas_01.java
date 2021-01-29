package com.java8.lamdas;

/*
 * Sample program to introduce functional interfaces with lambda notation
 */
// Import required to perform new java-8 functional interface methods.
import java.util.function.*;

public class Lambdas_01 {

	public static void main(String[] args) {
		//using the test method of Predicate
        Predicate<String> stringLen  = (s)-> s.length() < 10;
        System.out.println(stringLen.test("Mangos") + " - Mangos is less than 10");

        //Consumer example uses accept method
         Consumer<String> consumerStr = (s) -> System.out.println(s.toLowerCase());
         consumerStr.accept("ABCDEFGHIJKLMNjkjjsalfjalirir");
         
        //Function example        
        Function<Integer,String> converter = (num)-> Integer.toString(num);
        System.out.println("Length of 23: " + converter.apply(23).length());

        //Supplier example
        Supplier<String> s  = ()-> "Java is OOPS";
        System.out.println(s.get());
        
        //Binary Operator example
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println("Addition of 20 + 25: " + add.apply(20, 25));
        
        //Unary Operator example
        UnaryOperator<String> str  = (msg)-> msg.toUpperCase();
        System.out.println(str.apply("Sample message in upper case"));
	}

}

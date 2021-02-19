package com.java8.lamdas;

import java.util.Arrays;

import static java.util.Arrays.asList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

import java.util.stream.Stream;

public class Lambdas_03 {

	public static void main(String[] args) {

		Arrays.asList("red", "green", "blue")
        .stream()
        .sorted()
        .findFirst()
        .ifPresent(System.out::println);

		//example of Stream.of with a filter 
		Stream.of("apple", "pear", "banana", "cherry", "apricot")
		        .filter(fruit -> {
		          //  System.out.println("filter: " + fruit);
		            return fruit.startsWith("a"); //predicate
		        })
		        //if the foreach is removed, nothing will print,
		        //the foreach makes it a terminal event
		        .forEach(fruit -> System.out.println("Starts with A: " + fruit));
		
		//using a stream and map operation to create a list of words in caps
		List<String> collected = Stream.of("Java", " Rocks")
		        .map(string -> string.toUpperCase())
		        .collect(toList());
		System.out.println(collected.toString());
		
		
		IntStream.range(1, 4).forEach(System.out::println);

		//find the average of the numbers squared
		Arrays.stream(new int[]{1, 2, 3, 4})
		        .map(n -> n * n)
		        .average()
		        .ifPresent(System.out::println);
		
		//map doubles to ints
		Stream.of(1.5, 2.3, 3.7)
		        .mapToInt(Double::intValue)
		        .forEach(System.out::println);

	}

}

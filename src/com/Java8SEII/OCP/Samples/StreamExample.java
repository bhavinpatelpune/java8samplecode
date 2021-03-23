package com.Java8SEII.OCP.Samples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {

		Stream<List<String>> strs = Stream.of(
				Arrays.asList("text1","text2"),
				Arrays.asList("text2","text3")
				);
		
		Stream<String> bs2 = strs.filter(b-> b.contains("text1"))
							     .flatMap(rs-> rs.stream());
		bs2.forEach(b-> System.out.println(b)); //text1 text2
				
		System.out.println("---------------------------");

		Stream.of("Java","Unix","Linux")
		      .filter(s-> s.contains("n"))
		      .peek(s-> System.out.println("Peek : " + s))
		      .findFirst();  ///Peek : Unix
		
		System.out.println("---------------------------");
		
		List<Integer> list1 = Arrays.asList(10, 20); 
		List<Integer> list2 = Arrays.asList(15, 30);
		Stream.of(list1, list2)
			  .flatMap(list -> list.stream())
			  .forEach(s -> System.out.print(s + " "));
		// 10 20 15 30
		
		System.out.println("---------------------------");
		
		Stream<List<String>> iStr = Stream.of(Arrays.asList("1","John"));
		Arrays.asList("2",null);
//		Stream<String> nInst = iStr.flatMapToInt((x)->x.stream()); //Type mismatch: cannot convert from Stream<String> to IntStream
//		nInst.forEach(System.out::print);
		
	}

}

















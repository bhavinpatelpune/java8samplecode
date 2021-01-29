package com.san;

import java.util.Date;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringPermutation {
	
	public static Stream<String> permutations(String str) {
		if (str.isEmpty()) {
			return Stream.of("");
		}
		return IntStream.range(0, str.length()).boxed()
				.flatMap(i -> permutations(str.substring(0, i) + str.substring(i + 1)).map(t -> str.charAt(i) + t));
		
	}
	

	public static void main(String[] args) {
		Date startDate = new Date();
		long startTime = System.nanoTime();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String inputStr=sc.next();
		System.out.println("Started at " + startDate);
		permutations(inputStr).parallel().collect(Collectors.toSet()).stream().sorted().forEach(System.out::println);
		System.out.println("Size of Permutation :"+permutations(inputStr).parallel().collect(Collectors.toSet()).stream().count());
		Date endDate = new Date();
		long totalTime = System.nanoTime() - startTime;
		System.out.println("Ended at " + endDate + " total time=" + totalTime + " nanosec");
		sc.close();
	}
}

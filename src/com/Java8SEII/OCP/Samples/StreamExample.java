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
				

	}

}

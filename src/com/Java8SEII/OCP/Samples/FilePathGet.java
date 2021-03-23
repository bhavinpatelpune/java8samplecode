package com.Java8SEII.OCP.Samples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FilePathGet {

	public static void main(String[] args) throws IOException {
		Path file = Paths.get ("C:\\BHAVIN_WORK\\ECLIPSE_WORKSPACE\\Java_Practise\\SampleCodePractise\\src\\com\\Java8SEII\\OCP\\Samples\\courses.txt");
		Stream<String> fc = Files.lines (file);
		fc.forEach (s -> System.out.println(s));

//		Stream<String> lines = Files.lines(Paths.get ("C:\\BHAVIN_WORK\\ECLIPSE_WORKSPACE\\Java_Practise\\SampleCodePractise\\src\\com\\Java8SEII\\OCP\\Samples\\courses.txt")); 
//		lines.forEach(c -> System.out.println(c));
		
//		Stream<String> stream1 = Files.find(Paths.get ("C:\\BHAVIN_WORK\\ECLIPSE_WORKSPACE\\Java_Practise\\SampleCodePractise\\src\\com\\Java8SEII\\OCP\\Samples\\courses.txt")); 
//		stream1.forEach((String c) -> System.out.println(c));
//		
//		Stream<Path> stream2 = Files.find(Paths.get ("C:\\BHAVIN_WORK\\ECLIPSE_WORKSPACE\\Java_Practise\\SampleCodePractise\\src\\com\\Java8SEII\\OCP\\Samples\\courses.txt")); 
//		stream2.forEach( c -> System.out.println(c));
//		
//		Stream<Path> stream3 = Files.list(Paths.get ("C:\\BHAVIN_WORK\\ECLIPSE_WORKSPACE\\Java_Practise\\SampleCodePractise\\src\\com\\Java8SEII\\OCP\\Samples\\courses.txt")); 
//		stream3.forEach( c -> System.out.println(c));
		
		Stream<String> lines4 = Files.lines(Paths.get ("C:\\BHAVIN_WORK\\ECLIPSE_WORKSPACE\\Java_Practise\\SampleCodePractise\\src\\com\\Java8SEII\\OCP\\Samples\\courses.txt")); 
		lines4.forEach( c -> System.out.println(c));
		
	}

}

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

	}

}

package com.san;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordCountInFiles {
	
	public static void main(String [] args){
		try {
			//Read File Location
			System.out.println("File Path?");
			Scanner sc=new Scanner(System.in);
			String filepath=sc.nextLine();
			
			List<String> words = new ArrayList<>();
			//Try with resource
			try(Stream<String> stream = Files.lines(Paths.get(filepath))){
				//To get list of words in the file
			words=stream
		     .map(String::toUpperCase)                       
		     .flatMap(string -> Stream.of(string.split(" ")))   // Stream elements and adds to the current Stream
		     .collect(Collectors.toList());
			System.out.println(words);
			
			//Distinct words from file
			Stream<String> stream1 = Files.lines(Paths.get(filepath));
			List<String> uniqueWords=new ArrayList<>();
			uniqueWords=stream1
					.map(String::toUpperCase)
					.flatMap(string -> Stream.of(string.split(" ")))
					.distinct().collect(Collectors.toList());
			stream1.close();
			System.out.println(uniqueWords);
			
			long wordCount = words.size();//Word count of list
			System.out.println(wordCount);
			
			//Hashmap to store word as key and count as value
			Map<String, Integer> hmap = 
					words.parallelStream().
		            collect(Collectors.toConcurrentMap(
		                w -> w, w -> 1, Integer::sum));
			
			//forEach to iterate over map
			hmap.forEach((word, count) -> {
				System.out.println(word + " : " + count);
			});
			
			
			//LinkedHashMap preserve the ordering of elements in which they are inserted
			LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
			 
			hmap.entrySet()
			    .stream()
			    .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
			    .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
			System.out.println("Sorted Map   : " + sortedMap);
			
			hmap.entrySet()
		    .stream()
		    .sorted(Map.Entry.comparingByKey())
		    .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
			System.out.println("Sorted Map  in ascending : " + sortedMap);
			
			}
		sc.close();	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

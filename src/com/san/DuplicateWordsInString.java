package com.san;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DuplicateWordsInString {

	public static Set<String> duplicateWord(String word){
		
		if(word == null || word.isEmpty()){
			return Collections.emptySet();
		}
		
		Set<String> duplicates = new HashSet<>();
		String[] words=word.split("\\s+");
		
		Set<String> set=new HashSet();
		
		for(String w: words){
			if(!set.add(w)){
				duplicates.add(w);
			}
		}
		return duplicates;
	}
	
	public static void main(String[] args) {
		
		String word="Bhavin Patel Is a Software Developer Bhavin Patel also worked on Database";		
		Set<String> duplicates=duplicateWord(word);
		System.out.println(duplicates);
	}
}

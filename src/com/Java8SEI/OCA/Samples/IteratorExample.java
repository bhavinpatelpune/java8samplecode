package com.Java8SEI.OCA.Samples;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {

		List<String> lst = Arrays.asList("A","B","C","D");
		Iterator<String> itr = lst.iterator();
		
		while(itr.hasNext()){
			String e = itr.next();
			if(e=="C"){
				break;
			} else {
				System.out.println(e);
				continue;
				//System.out.println(e); //Unreachable code
			}
		}
		//System.out.println(lst);
	}

}

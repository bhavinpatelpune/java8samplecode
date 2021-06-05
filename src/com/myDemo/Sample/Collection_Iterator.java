package com.myDemo.Sample;

import java.util.*;

public class Collection_Iterator {

	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		ListIterator a = list.listIterator();
		
		if(a.previousIndex()!=-1)
			while(a.hasNext())
				System.out.println(a.next()+"");
		else
			System.out.println("EMPTY");
	}

}

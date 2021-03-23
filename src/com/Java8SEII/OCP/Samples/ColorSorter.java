package com.Java8SEII.OCP.Samples;

import java.util.Comparator;

public class ColorSorter implements Comparator<Blocks>{
	
	public int compare(Blocks o1, Blocks o2) {
		return o1.color.compareTo(o2.color);
	}
}
package com.Java8SEII.OCP.Samples;

public class Blocks {
	String color;
	int size;
	
	Blocks(int size,String color){
		this.size = size;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Blocks [color=" + color + ", size=" + size + "]";
	}
	
	
}

package com.Java8SEII.OCP.Samples;

import java.util.function.Supplier;

class Bird {

	public void fly() {
		System.out.print("Can fly ");
	}
}

class Penguin extends Bird {
	public void fly() {
		System.out.print("Cannot fly ");
	}
}

class BirdieSupplier {
	public static void main(String[] args) {
		fly(() -> new Bird());
		fly(Penguin::new);  // Can fly Cannot fly
	}
	static void fly (Supplier<Bird> bird) 
	{
		bird.get().fly();  
	}
}
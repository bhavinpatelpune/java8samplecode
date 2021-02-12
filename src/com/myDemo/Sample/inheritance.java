package com.myDemo.Sample;

class App {
	public void doWork(){
		System.out.println("Execute");
	}
}

class Software extends App{
	public void doWork(){
		System.out.println("Execute Software");
	}
}


public class inheritance {
	public static void main(String[] args) {
		App myApp = new Software();
		myApp.doWork(); // It will print Line-11 --> Execute Software 
	}

}

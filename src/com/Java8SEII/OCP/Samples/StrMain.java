package com.Java8SEII.OCP.Samples;

public class StrMain {

	public static void doStuff(String s){
		try{
			if(s == null){
				throw new NullPointerException();
			}
		} finally{
			System.out.println("Finally");
		}
		System.out.println("doStuff");
	}
	
	public static void main(String[] args) {
		try{
			doStuff(null);
		}catch(NullPointerException npe){
			System.out.println("Catch");
		}
		//Finally
		//Catch
	}

}

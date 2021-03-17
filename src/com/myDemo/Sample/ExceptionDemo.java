package com.myDemo.Sample;

import java.io.IOException;

class Ex1 extends Exception{
	Ex1(){
		System.out.println("Ex1");
	}
}

class Ex2 extends Ex1{
	Ex2(){
		System.out.println("Ex2");
	}
}


public class ExceptionDemo {

	public static void main(String[] args) {
//		try{
//			throw new IOException();
//			
//		} catch (Exception e){
//			System.out.println("1");
//		}
//		///Unreachable catch block for IOException. It is already handled by the catch block for Exception
//		catch (IOException e){
//			System.out.println("2");
//		}
//		finally{
//			System.out.println("3");
//		}
		
		
//		try{
//			
//		} catch(Ex1 | Ex2 e){ /// The exception Ex2 is already caught by the alternative Ex1
//			System.out.println(e);
//		}
		
	}
}

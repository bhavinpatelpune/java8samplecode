package com.san;

import java.lang.reflect.Constructor;

public class SingleTonTestReflection {
	
	/* static class SingleTon{
		public static final  SingleTon INSTANCE=new SingleTon();
		//private constructor
		private SingleTon(){
			
		}
	}*/
	public enum SingleTon{
		
		INSTANCE;
		//private SingleTon(){
			
		}
	public static void main(String[] args) {
		
		SingleTon instance1=SingleTon.INSTANCE;
		SingleTon instance2=null;
		try{
			@SuppressWarnings("rawtypes")
			Constructor[] constructors=SingleTon.class.getDeclaredConstructors();
			for(@SuppressWarnings("rawtypes") Constructor constructor:constructors){
				constructor.setAccessible(true); //destroys singleton property
				try{
					
					System.out.println(instance1.hashCode());
					instance2=(SingleTon) constructor.newInstance();
					System.out.println(instance2.hashCode());
				}
				catch(IllegalArgumentException e){
					System.out.println("not able to create object");
				}
				break;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}




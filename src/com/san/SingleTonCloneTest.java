package com.san;

class SuperClass implements Cloneable{
	
	int i=10;
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

class SingleTonTest extends SuperClass{
	public static SingleTonTest INSTANCE=new SingleTonTest();
	
	private SingleTonTest(){}
	
	//Need to Override clone() to handle singleton 
	@Override
	  protected Object clone() throws CloneNotSupportedException  
	  { 
	    return INSTANCE; 
	  } 
	} 
	
public class SingleTonCloneTest {

	public static void main(String[] args)  throws CloneNotSupportedException{
		SingleTonTest instance1=SingleTonTest.INSTANCE;
		SingleTonTest instance2=(SingleTonTest) instance1.clone();
		
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}

}

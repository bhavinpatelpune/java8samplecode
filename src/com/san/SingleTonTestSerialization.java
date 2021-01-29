package com.san;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingleTonTestSerialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Serialization
		try {
			SingleTon instance1=SingleTon.INSTANCE;
			ObjectOutput out=new ObjectOutputStream(new FileOutputStream("D:\\angularTraining\\Angular_Rest_API_Demo\\CodeTest\\src\\in.txt"));
			out.writeObject(instance1);
			out.close();
			
			//Deserialize
			ObjectInput in=new ObjectInputStream(new FileInputStream("D:\\angularTraining\\Angular_Rest_API_Demo\\CodeTest\\src\\in.txt"));
			SingleTon instance2=(SingleTon) in.readObject(); //destroys singleton
			in.close();
			
			System.out.println(instance1.hashCode());
			System.out.println(instance2.hashCode());
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


class SingleTon implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static SingleTon INSTANCE=new SingleTon();
	private SingleTon(){
		
	}
	 // implement readResolve method to prevent destroying of singleton
    protected Object readResolve() 
    { 
        return INSTANCE; 
    } 
}
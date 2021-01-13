package com.Java8Samples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

//Simple  example which proves ConcurrentHashMap class behaves like fail safe iterator
public class ConcurrentHashMapExample {

	// Fail Safe Iterator
	public static void ConcurrentHashMapFailSafeCall(){
		ConcurrentHashMap<String,String> premiumPhone = new ConcurrentHashMap<String,String>();
		premiumPhone.put("MOTO", "G2");
        premiumPhone.put("APPLE", "X12");
        premiumPhone.put("SAMSUNG","S10");
        
        Iterator iterator = premiumPhone.keySet().iterator();
        
        while (iterator.hasNext())
        {
            premiumPhone.put("Sony", "XperiaZ");
            System.out.println(premiumPhone.get(iterator.next()));
        }
	}
	
	// Fail Fast Iterator
	public static void HashMapFailFastCall(){
		HashMap<String,String> premiumPhone = new HashMap<String,String>();
        premiumPhone.put("MOTO", "G2");
        premiumPhone.put("APPLE", "X12");
        premiumPhone.put("SAMSUNG","S10");
        
        Iterator iterator = premiumPhone.keySet().iterator();
        
        while (iterator.hasNext())
        {
        	// Fail-fast iterator throw an exception as "java.util.ConcurrentModificationException"
        	// It can't made any manipulation during iteration operation.
            premiumPhone.put("SONY", "XperiaZ");
            System.out.println(premiumPhone.get(iterator.next()));
        }
	}
	
	public static void main(String[] args) {
		ConcurrentHashMapFailSafeCall();
		HashMapFailFastCall();
	}

}

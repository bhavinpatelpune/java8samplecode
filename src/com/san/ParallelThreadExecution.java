package com.san;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class ParallelThreadExecution {
		static AtomicInteger atomicNumber = new AtomicInteger(1);
	
		public static void main(String[] args) {
			System.out.println("Enter max number ?: ");
			Scanner sc=new Scanner(System.in);
			int maxNumber=sc.nextInt();
		    Runnable r = () -> {
		        while (atomicNumber.get() < maxNumber) {
		            synchronized (atomicNumber) {
		                if ((atomicNumber.get() % 2 == 0) && "Even".equals(Thread.currentThread().getName())) {
		                    System.out.println("Even" + ":" + atomicNumber.getAndIncrement());
		                } else if ((atomicNumber.get() % 2 != 0) && "Odd".equals(Thread.currentThread().getName())) {
		                    System.out.println("Odd" + ":" + atomicNumber.getAndIncrement());
		                }
		            }
		        }
		    };
	
		    Thread t1 = new Thread(r);
		    t1.setName("Even");
		    t1.start();
		    Thread t2 = new Thread(r);
		    t2.setName("Odd");
		    t2.start();	    
		    sc.close();
		    
	}
}

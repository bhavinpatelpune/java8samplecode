package com.Java8SEII.OCP.Samples;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class DequeExample {

	public static void main(String[] args) {
		
		Deque<Integer> nums = new ArrayDeque<>();
		nums.add(1000);
		nums.push(2000);
		nums.add(3000);
		nums.push(4000);
		
		Integer i1 = nums.remove();
		Integer i2 = nums.pop();
		System.out.println(i1 + " : " + i2); //OP: 4000 : 2000
		
		System.out.println("---------------------------");
		
		Queue<String> products = new ArrayDeque<String>();
		products.add("p1");
		products.add("p2");
		products.add("p3");
		System.out.print(products.peek());
		System.out.print(products.poll());
		System.out.println("");
		products.forEach(s -> System.out.print(s)); // p1p1
													// p2p3
		
		System.out.println("---------------------------");
		
		Deque<String> dqueue = new ArrayDeque<String>();
		dqueue.add("Susan");
		dqueue.add("Allen");
		dqueue.add("David");
		System.out.println(dqueue.pop());
		System.out.println(dqueue.remove());
		System.out.println(dqueue);  // Susan Allen [David]
	}
}

package com.Java8Samples;

// Function Interface packages added in JDK-8
import java.util.function.*;


//Java program to demonstrate 
//how a closure is implemented 
//using lambda expressions 

import java.io.*; 

//Defining an interface whose 
//implementation is given in 
//the lambda expression. 
//This uses the concept of 
//closures 
interface SalutationInterface { 
 public String sayHello(); 
} 

class LamdaSample { 

 // Driver code 
 public static void main(String[] args) 
 { 
     // Lambda Expression 
     SalutationInterface obj = () -> { 
         return "Hello-Bhavin!"; 
     }; 

     // Calling the above interface 
     System.out.println(obj.sayHello()); 
 } 
} 
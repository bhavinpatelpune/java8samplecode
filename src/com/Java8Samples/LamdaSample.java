package com.Java8Samples;

/*
Anonymous
A lambda expression is anonymous because it does not have an explicit name as a method normally would. 
It’s sort of like an anonymous class in that it does not have a declared name.

Function
A lambda is like a method in that it has a list of parameters, a body, a return type, and a possible list of exceptions 
that can be thrown. However, unlike a method, it’s not declared as part of a particular class.

Passed around
A lambda expression can be passed as an argument to a method, stored in a variable, and also returned as a result.


A lambda expression can be understood as a kind of anonymous function.

Lambda expressions and the behavior parameterization pattern let you write code that is both flexible and concise.

A functional interface is an interface that declares a single abstract method.

Lambda expressions can only be used in the context of a functional interface.

Method references can be a more natural alternative to lambda expressions when you need to reuse an existing method and pass it around.

In the context of testing, extract large lambda expressions into separate methods that you can then inject using method references.

*/

/*
You’ll often see the annotation @FunctionalInterface on interfaces. 
It’s similar to using the @Override annotation to indicate that a method is overridden. 
Here, the @FunctionalInterface annotation is used for documentation to indicate that the interface is intended to be a functional interface. 
The compiler will also report an error if the interface annotated doesn’t match the definition of a functional interface.
*/

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
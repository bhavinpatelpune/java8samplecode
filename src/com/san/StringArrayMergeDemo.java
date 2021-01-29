package com.san;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringArrayMergeDemo {

	
	public static void main(String[] args) {
		
		String [] array1={"abc","def","ghi"};
		String [] array2={"123","456","789","abc"};
		
		int[] a ={1,3,2,5};
		int[] b ={8,3,1};
		
		StringArrayMergeDemo stDemo=new StringArrayMergeDemo();
		
		Employee employee1=new Employee(1,"San","IT",5000);
		Employee employee2=new Employee(1,"Sab","INFRA",8000);

		Stream<Employee> employee=stDemo.by_Object_concat(employee1,employee2);
		//System.out.println(Stream.of(employee));
		Stream.of(employee).forEach(s->System.out.println(s)); //Java 8

		int[] joinedIntArray=by_IntStream_concat(a,b);
		System.out.println(Arrays.toString(joinedIntArray));
	
		
		String[] joinedStringArray=by_Stream_concat(array1,array2);
		System.out.println(Arrays.toString(joinedStringArray));
		

	}
	
	public static int[] by_IntStream_concat(int[] a,int[] b){
		IntStream joinedIntStream = IntStream.concat(Arrays.stream(a), Arrays.stream(b));	
		return joinedIntStream.toArray();
	}
	
	public Stream<Employee> by_Object_concat(Employee e1, Employee e2){
		Stream<Employee> joinedObject=Stream.concat(Stream.of(e1),Stream.of(e2));
		return joinedObject;
	}
	
	public static String[] by_Stream_concat(String[] array1, String[] array2){
		
		Stream<String> joinedArray=Stream.concat(Arrays.stream(array1),Arrays.stream(array2));
		return joinedArray.toArray(String[]::new);
		
	}

}

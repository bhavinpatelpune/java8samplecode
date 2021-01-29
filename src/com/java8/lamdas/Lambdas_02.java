package com.java8.lamdas;

import java.util.Arrays;
import static java.util.Arrays.asList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lambdas_02 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Bhavin", "Patel", "Pune", "Gujrat");
        //way to sort prior to Java 8 lambdas
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });
        //first iteration with lambda
        Collections.sort(names, (String a, String b) -> {
            return b.compareTo(a);
        });
        //now remove the return statement
        Collections.sort(names, (String a, String b) -> b.compareTo(a));
        
        //now remove the data types and allow the compile to infer the type
        Collections.sort(names, (a, b) -> b.compareTo(a));

   
        //total pages in your book collection
        Book book1 = new Book("Title 1","Deoraj", "Madag", 123);
        Book book2 = new Book("Title 2","Brian", "Seych", 456);
        Book book3 = new Book("Title 3","Nitish", "Maldi", 789);
        
        List<Book> books = Arrays.asList(book1, book2, book3);
        int total = books.stream()
                		 .collect(Collectors.summingInt(Book::getPages));
        System.out.println(total);
        
        //create a list with duplicates
        List<Book> dupBooks = Arrays.asList(book1, book2, book3, book1, book2);
        System.out.println("Before removing duplicates: ");
        System.out.println(dupBooks.toString());
        
        Collection<Book> noDups = new HashSet<>(dupBooks);
        System.out.println("After removing duplicates: ");
        System.out.println(noDups.toString());


        //aggregate author first names into a list
        List<String> list = books.stream()
                				 .map(Book::getAuthorLName)
                				 .collect(Collectors.toList());
        System.out.println(list);
        
        //example of using Set to eliminate duplicates and sort automatically
        Set<Integer> numbers = new HashSet<>(asList(4, 3, 3, 3, 2, 1, 1, 1));
        System.out.println(numbers.toString());
        
	}

}

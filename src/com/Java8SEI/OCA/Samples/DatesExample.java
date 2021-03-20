package com.Java8SEI.OCA.Samples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DatesExample {
	
	public static void main(String[] args) {
		LocalDate myDate = LocalDate.now();
		
		System.out.println(myDate); // OP: 2021-03-16
		
		System.out.println("-----------------");
		
		LocalDateTime dt = LocalDateTime.of(2021, 7,31,1,1);
		dt.plusDays(30);
		dt.plusMonths(1);
		System.out.println(dt.format(DateTimeFormatter.ISO_DATE_TIME));  // OP : 2021-07-31T01:01:00
		
		System.out.println("-----------------");
		
		LocalDate dtt = LocalDate.of(2021, 7,31);
		dtt.plusDays(10);
		System.out.println(dtt);  // OP : 2021-07-31
		
		System.out.println("-----------------");
		
		LocalDate date1 = LocalDate.now();
		//LocalDate date2 = LocalDate.of(6, 20, 2014);
		LocalDate date3 = LocalDate.parse("2021-03-17", DateTimeFormatter.ISO_DATE);
		System.out.println(date1);
		//System.out.println(date2);
		System.out.println(date3);
		
		String date = LocalDate
				.parse("2014-05-04")
				.format(DateTimeFormatter.ISO_DATE_TIME) ;
		System.out.println(date); //Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: HourOfDay
	}

}

package com.Java8SEII.OCP.Samples;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ZonedDateTimeExample {

	public static void main(String[] args) {
		ZonedDateTime depart = ZonedDateTime.of(2015, 1, 15, 3, 0, 0, 0, ZoneId.of("UTC-7"));
		ZonedDateTime arrive = ZonedDateTime.of(2015, 1, 15, 9, 0, 0, 0, ZoneId.of("UTC-5"));
		long hrs = ChronoUnit.HOURS.between(depart, arrive); //line n1 
		System.out.println("Travel time is " + hrs + " hours"); // Travel time is 4 hours
		
		System.out.println("---------------------------");
		
		ZoneId zone = ZoneId.of("America/New_York");
		ZonedDateTime dt = ZonedDateTime.of(LocalDate.of(2015,3,8),LocalTime.of(1,0),zone);
		ZonedDateTime dt2 = dt.plusHours(2);
		System.out.print(DateTimeFormatter.ofPattern("H:mm - ").format(dt2));
		System.out.println("difference " + ChronoUnit.HOURS.between(dt, dt2));  // 4:00 - difference 2
	}

}

package com.Java8Samples;

import java.time.*;

//Immutability
//One of the problems with Date and Calendar is that they weren’t thread-safe. 
//In addition, developers using dates as part of their API can accidentally update values unexpectedly. 
//To prevent these potential bugs, the classes in the new Date and Time API are all immutable. 
//In other words, you can’t change an object’s state in the new Date and Time API. 
//Instead, you use a method to return a new object with an updated value.
public class DateTimeAPI {

	public static void main(String[] args) {
		ZoneId london = ZoneId.of("Europe/London");
		LocalDate july4 = LocalDate.of(2014, Month.JULY, 4);
		LocalTime early = LocalTime.parse("08:45");
		ZonedDateTime flightDeparture = ZonedDateTime.of(july4, early, london);
		System.out.println(flightDeparture);

		LocalTime from = LocalTime.from(flightDeparture);
		System.out.println(from);

		ZonedDateTime touchDown
		    = ZonedDateTime.of(july4,
		                       LocalTime.of (11, 35),
		                       ZoneId.of("Europe/Stockholm"));
		Duration flightLength = Duration.between(flightDeparture, touchDown);
		System.out.println(flightLength);

		// How long have I been in continental Europe?
		ZonedDateTime now = ZonedDateTime.now();
		Duration timeHere = Duration.between(touchDown, now);
		System.out.println(timeHere);

	}

}

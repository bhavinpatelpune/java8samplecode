package com.Java8SEII.OCP.Samples;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class DateTimeExample {

	public static void main(String[] args) throws InterruptedException {

		Instant loginTime = Instant.now();
		Thread.sleep(1000);
		
		Instant logoutTime = Instant.now();
		
		loginTime = loginTime.truncatedTo(ChronoUnit.MINUTES);
		logoutTime = logoutTime.truncatedTo(ChronoUnit.MINUTES);
		
		if(logoutTime.isAfter(loginTime)){
			System.out.println("Logged out as : " + logoutTime);
		} else {
			System.out.println("Can not logout");
		}

	}

}

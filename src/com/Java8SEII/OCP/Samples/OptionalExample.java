package com.Java8SEII.OCP.Samples;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		Address address = null;
		Optional<Address> addrs1 = Optional.ofNullable (address);
		Employees e1 = new Employees (addrs1);
		String eAddress = (addrs1.isPresent()) ? addrs1.get().getCity() : "City Not available";
		System.out.println(eAddress);
	}

}








package com.Java8SEII.OCP.Samples;

import java.util.Optional;

class Employees {
	Optional<Address> address;
	Employees (Optional<Address> address) {
		this.address = address;
	}
	public Optional<Address> getAddress() { 
		return address; 
		}
}
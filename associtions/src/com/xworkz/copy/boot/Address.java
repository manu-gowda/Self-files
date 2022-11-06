package com.xworkz.copy.boot;

public class Address {
	public Location location;

	public Address(Location location) {
		super();
		this.location = location;
	}
	
	public void showofaddress() {
		System.out.println(System.lineSeparator());
		location.showoflocation();
	}

}

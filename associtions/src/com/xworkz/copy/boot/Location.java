package com.xworkz.copy.boot;

public class Location {
	public String street;
	public City city;
	public State state;
	public Country country;
	
	
	public Location(String street, City city, State state, Country country) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	public void showoflocation() {
		System.out.println(System.lineSeparator());
		System.out.println(street);
		state.showofstates();
		country.showOfCountry();
		city.showofcity();
		
		
	}
	
	

}

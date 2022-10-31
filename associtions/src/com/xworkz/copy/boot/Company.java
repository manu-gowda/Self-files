package com.xworkz.copy.boot;

public class Company {
	public String name;
	public String ownerName;
	public Address address;
	
	
	public Company(String name, String ownerName, Address address) {
		super();
		this.name = name;
		this.ownerName = ownerName;
		this.address = address;
	}
	
	public void showofcompany() {
		System.out.println(name);
		System.out.println(ownerName);
		
	}

		
	}
	


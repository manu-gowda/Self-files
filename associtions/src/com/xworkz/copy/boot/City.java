package com.xworkz.copy.boot;

public class City {
	public String name;
	public String famousFor;
	public boolean capital;
	public String mla;
	
	
	
	public City(String name, String famousFor, boolean capital, String mla) {
		super();
		this.name = name;
		this.famousFor = famousFor;
		this.capital = capital;
		this.mla = mla;
	}
	
	public void showofcity() {
		System.out.println(System.lineSeparator());
		System.out.println(name);
		System.out.println(famousFor);
		System.out.println(capital);
		System.out.println(mla);
	}
	
	
	
	

}

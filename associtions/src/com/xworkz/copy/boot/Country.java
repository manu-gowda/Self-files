package com.xworkz.copy.boot;

public class Country {
	public String name;
	public String states;
	public String capital;
	public String pm;
	public Country(String name, String states, String capital, String pm) {
		super();
		this.name = name;
		this.states = states;
		this.capital = capital;
		this.pm = pm;
	}
		
		public void showOfCountry() 
		{
		System.out.println(name);
		System.out.println(states);
		System.out.println(capital);
		System.out.println(pm);
		
		}
		
	}
	



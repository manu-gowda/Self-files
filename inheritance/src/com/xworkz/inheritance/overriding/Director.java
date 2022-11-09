package com.xworkz.inheritance.overriding;

public class Director {
	public String color;
	public String directorOf;
	public Director(String color, String directorOf) {
		super();
		this.color = color;
		this.directorOf = directorOf;
	}
	public void showoff() {
		System.out.println(this.color);
		System.out.println(this.directorOf);
	}
	
	
	

}

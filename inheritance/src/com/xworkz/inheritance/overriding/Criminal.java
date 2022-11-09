package com.xworkz.inheritance.overriding;

public class Criminal {
	
	public String crime;
	public long criminalWifeNum;
	
	
	public Criminal(String crime, long criminalWifeNum) {
		super();
		this.crime = crime;
		this.criminalWifeNum = criminalWifeNum;
	}
	public void display() {
		System.out.println(this.crime);
		System.out.println(this.criminalWifeNum);
	
		
	}
	
	

}

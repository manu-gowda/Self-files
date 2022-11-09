package com.xworkz.inheritance.overriding;

public class Joshi extends Criminal {
	
	public int noOfCase;
	
	
	public Joshi(String crime, long criminalWifeNum, int noOfCase) {
		super(crime, criminalWifeNum);
		this.noOfCase=noOfCase;
		}
	public void display() {
		super.display();
		System.out.println(noOfCase);
	}

	
	
	
	
	
	
	
	

}

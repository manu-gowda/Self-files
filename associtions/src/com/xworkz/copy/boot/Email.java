package com.xworkz.copy.boot;

public class Email {
	public String id;
	public double password;
	public long mobileNo;
	public Company company;
	
	
	public Email(String id, double password, long mobileNo, Company company) {
		super();
		this.id = id;
		this.password = password;
		this.mobileNo = mobileNo;
		this.company = company;
	}
	
	public void showofemail() 
	{
		System.out.println(id);
		System.out.println(password);
		System.out.println(mobileNo);
		
	}
	
	
	
	

}

package com.xworkz.urwish.boot;

public class Company {
	public String[] typeOfCompany;
	public int noOfEmployees;
	public int noOfFloors;
	public double contactNo;
	public String[] managerName;
	public String[] district;
	public String[] region;
	public String[] owner;
	public int pinCode;
	public long[] ownerNumber;
	public String currentLocation;
	public String[] colorOfCompany;
	
	
	
	
	public Company(String[] typeOfCompany,int noOfEmployees,int noOfFloors,double contactNo,String[] managerName,
			String[] district,String[] region,String[] owner,int pinCode,long[] ownerNumber,
			String currentLocation,String[] colorOfCompany) {
		this.typeOfCompany=typeOfCompany;
		this.noOfEmployees=noOfEmployees;
		this.noOfFloors=noOfFloors;
		this.contactNo=contactNo;
		this.managerName=managerName;
		this.district=district;
		this.region=region;
		this.owner=owner;
		this.pinCode=pinCode;
		this.ownerNumber=ownerNumber;
		this.currentLocation=currentLocation;
		this.colorOfCompany=colorOfCompany;
		
	}
	
	public void display() {
		
		System.out.println(this.noOfEmployees);
		System.out.println(this.pinCode);
		System.out.println(this.contactNo);
	    System.out.println(this.noOfFloors);
		System.out.println(this.currentLocation);
		
		
		
		
		for(int i=0;i<typeOfCompany.length;i++) {
			String String=typeOfCompany[i];
			System.out.println(String);
			}
		
		
		
		for(int i=0;i<managerName.length;i++) {
			String String=managerName[i];
			System.out.println(String);
			}
		
		
		for(int i=0;i<district.length;i++) {
			String String=district[i];
			System.out.println(String);
			}
		
		
		
		for(int i=0;i<region.length;i++) {
			String String=region[i];
			System.out.println(String);
			}
		
		
		
		
		for(int i=0;i<owner.length;i++) {
			String String=owner[i];
			System.out.println(String);
			}
		
		
		for(int i=0;i<colorOfCompany.length;i++) {
			String String=colorOfCompany[i];
			System.out.println(String);
			}
		
		
	}
}
		
	

package com.xworkz.urwish.boot;

public class Restaurant {
	public String[] nameOfRestaurant;
	public int noOfRooms;
	public int noOfPersons;
	public double contactNo;
	public String[] customerName;
	public String[] workersName;
	public String[] ownerName;
	public String[] ownerDaughtersName;
	public int ownerDaughtersNo;
	public int[] noOfRecipes;
	public String Location;
	public String[] areas;
	
	
	
	
	public Restaurant(String[] nameOfRestaurant,int noOfRooms,int noOfPersons,double contactNo,String[] customerName,
			String[] workersName,String[] ownerName,String[] ownerDaughtersName,int ownerDaughtersNo,int[] noOfRecipes,
			String Location,String[] areas) {
		this.nameOfRestaurant=nameOfRestaurant;
		this.noOfRooms=noOfRooms;
		this.noOfPersons=noOfPersons;
		this.contactNo=contactNo;
		this.customerName=customerName;
		this.workersName=workersName;
		this.ownerName=ownerName;
		this.ownerDaughtersName=ownerDaughtersName;
		this.noOfRecipes=noOfRecipes;
		this.Location=Location;
		this.areas=areas;
		
	}
	
	public void display() {
		
		System.out.println(this.noOfRooms);
		System.out.println(this.noOfPersons);
		System.out.println(this.contactNo);
	    System.out.println(this.ownerDaughtersNo);
		System.out.println(this.noOfRecipes);
		System.out.println(this.Location);
		
		
		
		for(int i=0;i<nameOfRestaurant.length;i++) {
			String String=nameOfRestaurant[i];
			System.out.println(String);
			}
		
		
		
		for(int i=0;i<customerName.length;i++) {
			String String=customerName[i];
			System.out.println(String);
			}
		
		
		for(int i=0;i<workersName.length;i++) {
			String String=workersName[i];
			System.out.println(String);
			}
		
		
		
		for(int i=0;i<ownerDaughtersName.length;i++) {
			String String=ownerDaughtersName[i];
			System.out.println(String);
			}
		
		
		
		
		for(int i=0;i<ownerName.length;i++) {
			String String=ownerName[i];
			System.out.println(String);
			}
		
		
		for(int i=0;i<areas.length;i++) {
			String String=areas[i];
			System.out.println(String);
			}
		
		
	}
}



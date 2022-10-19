package com.xworkz.urwish.boot;

public class House {
	
	public String[] wifeName;
	public int noOfChildran;
	public int houseNo;
	public double contactNo;
	public String[] husbandName;
	public String[] homeTown;
	public String[] childranName;
	public String[] owner;
	public int noOfFloors;
	public long[] ownerNumber;
	public String currentLocation;
	public String[] colorOfHouse;
	
	
	
	
	public House(String[] wifeName,int noOfChildran,int houseNo,double contactNo,String[] husbandName,
			String[] homeTown,String[] childranName,String[] owner,int noOfFloors,long[] ownerNumber,
			String currentLocation,String[] colorOfHouse) {
		this.wifeName=wifeName;
		this.noOfChildran=noOfChildran;
		this.houseNo=houseNo;
		this.contactNo=contactNo;
		this.husbandName=husbandName;
		this.homeTown=homeTown;
		this.childranName=childranName;
		this.owner=owner;
		this.noOfFloors=noOfFloors;
		this.ownerNumber=ownerNumber;
		this.currentLocation=currentLocation;
		this.colorOfHouse=colorOfHouse;
		
	}
	
	public void display() {
		
		System.out.println(this.noOfChildran);
		System.out.println(this.houseNo);
		System.out.println(this.contactNo);
	    System.out.println(this.noOfFloors);
		System.out.println(this.currentLocation);
		
		
		
		
		for(int i=0;i<wifeName.length;i++) {
			String String=wifeName[i];
			System.out.println(String);
			}
		
		
		
		for(int i=0;i<husbandName.length;i++) {
			String String=husbandName[i];
			System.out.println(String);
			}
		
		
		for(int i=0;i<homeTown.length;i++) {
			String String=homeTown[i];
			System.out.println(String);
			}
		
		
		
		for(int i=0;i<childranName.length;i++) {
			String String=childranName[i];
			System.out.println(String);
			}
		
		
		
		
		for(int i=0;i<owner.length;i++) {
			String String=owner[i];
			System.out.println(String);
			}
		
		
		for(int i=0;i<ownerNumber.length;i++) {
			String String=colorOfHouse[i];
			System.out.println(String);
			}
		
		
		
		
			
		
		}
	
	


}

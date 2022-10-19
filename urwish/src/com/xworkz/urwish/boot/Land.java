package com.xworkz.urwish.boot;

public class Land {
	public String[] landName;
	public int noOFHectare;
	public int noOfTrees;
	public String[] ownerName;
	public String[] typeOfSoils;
	public String[] ownerWifeName;
	public String[] landCity;
	public int noOFBorewells;
	public long[] landOwnerNumber;
	public String currentLocation;
	public String[] landLocation;
	
	
	
	
	public Land(String[] landName,int noOFHectare,int noOfTrees,String[] ownerName,
			String[] typeOfSoils,String[] ownerWifeName,String[] landCity,int noOFBorewells,long[] landOwnerNumber,
			String currentLocation,String[] landLocation) {
		this.landName=landName;
		this.noOFHectare=noOFHectare;
		this.noOfTrees=noOfTrees;
		this.ownerName=ownerName;
		this.typeOfSoils=typeOfSoils;
		this.ownerWifeName=ownerWifeName;
		this.landCity=landCity;
		this.noOFBorewells=noOFBorewells;
		this.landOwnerNumber=landOwnerNumber;
		this.currentLocation=currentLocation;
		this.landLocation=landLocation;
		
	}
	
	public void display() {
		
		System.out.println(this.noOFHectare);
		System.out.println(this.noOfTrees);
		System.out.println(this.noOFBorewells);
	    System.out.println(this.landOwnerNumber);
		System.out.println(this.currentLocation);
		
		
		
		
		for(int i=0;i<landName.length;i++) {
			String String=landName[i];
			System.out.println(String);
			}
		
		
		
		for(int i=0;i<ownerName.length;i++) {
			String String=ownerName[i];
			System.out.println(String);
			}
		
		
		for(int i=0;i<typeOfSoils.length;i++) {
			String String=typeOfSoils[i];
			System.out.println(String);
			}
		
		
		
		for(int i=0;i<ownerWifeName.length;i++) {
			String String=ownerWifeName[i];
			System.out.println(String);
			}
		
		
		
		
		for(int i=0;i<landCity.length;i++) {
			String String=landCity[i];
			System.out.println(String);
			}
		
		
		for(int i=0;i<landLocation.length;i++) {
			String String=landLocation[i];
			System.out.println(String);
			}
		
		
		
		
			
		
		}
	
	

}

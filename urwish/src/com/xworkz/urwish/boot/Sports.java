package com.xworkz.urwish.boot;

public class Sports {
	public String[] typeOfSports;
	public int noOfPlayers;
	public int noOfGames;
	public double contactNo;
	public String[] teamCaptionName;
	public String[] coachesName;
	public String[] stadiumName;
	public String[] sportsPresident;
	public int noOfBatsman;
	public double[] pitchType;
	public String Location;
	public String[] noOfBowlersTypes;
	
	
	
	
	public Sports(String[] typeOfSports,int noOfPlayers,int noOfGames,double contactNo,String[] teamCaptionName,
			String[] coachesName,String[] stadiumName,String[] sportsPresident,int noOfBatsman,double[] pitchType,
			String Location,String[] noOfBowlersTypes) {
		this.typeOfSports=typeOfSports;
		this.noOfPlayers=noOfPlayers;
		this.noOfGames=noOfGames;
		this.contactNo=contactNo;
		this.teamCaptionName=teamCaptionName;
		this.coachesName=coachesName;
		this.stadiumName=stadiumName;
		this.sportsPresident=sportsPresident;
		this.noOfBatsman=noOfBatsman;
		this.pitchType=pitchType;
		this.Location=Location;
		this.noOfBowlersTypes=noOfBowlersTypes;
		
	}
	
	public void display() {
		
		System.out.println(this.noOfPlayers);
		System.out.println(this.noOfGames);
		System.out.println(this.contactNo);
	    System.out.println(this.noOfBatsman);
		System.out.println(this.noOfBowlersTypes);
		System.out.println(this.Location);
		
		
		
		for(int i=0;i<typeOfSports.length;i++) {
			String String=typeOfSports[i];
			System.out.println(String);
			}
		
		
		
		for(int i=0;i<teamCaptionName.length;i++) {
			String String=teamCaptionName[i];
			System.out.println(String);
			}
		
		
		for(int i=0;i<coachesName.length;i++) {
			String String=coachesName[i];
			System.out.println(String);
			}
		
		
		
		for(int i=0;i<stadiumName.length;i++) {
			String String=stadiumName[i];
			System.out.println(String);
			}
		
		
		
		
		for(int i=0;i<sportsPresident.length;i++) {
			String String=sportsPresident[i];
			System.out.println(String);
			}
		
		
		for(int i=0;i<noOfBowlersTypes.length;i++) {
			String String=noOfBowlersTypes[i];
			System.out.println(String);
			}
		
		
	}
}
		



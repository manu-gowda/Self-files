package com.xworkz.urwish.boot;

public class shubham {
	public String[] wifeName;
	public int noOfChildran;
	public int noOfLegs;
	public double contactNo;
	public String[] bodyParts;
	public String[] homeTown;
	public String[] friends;
	public String[] girlFriendName;
	public int noOfExGirlFriend;
	public long[] girlFriendNo;
	public String currentLocation;
	public boolean type;
	public boolean talent;
	public String[] color;
	
	
	
	
	public shubham(String[] wifeName,int noOfChildran,int noOfLegs,double contactNo,String[] bodyParts,
			String[] homeTown,String[] friends,String[] girlFriendName,int noOfExGirlFriend,
			long[] girlFriendNo,String currentLocation,boolean type,boolean talent, String[] color) {
		this.wifeName=wifeName;
		this.noOfChildran=noOfChildran;
		this.noOfLegs=noOfLegs;
		this.contactNo=contactNo;
		this.bodyParts=bodyParts;
		this.homeTown=homeTown;
		this.friends=friends;
		this.girlFriendName=girlFriendName;
		this.noOfExGirlFriend=noOfExGirlFriend;
		this.girlFriendNo=girlFriendNo;
		this.currentLocation=currentLocation;
		this.type=type;
		this.talent=talent;
		this.color=color;
		
	}
	
	public void display() {
		
		System.out.println(this.noOfChildran);
		System.out.println(this.noOfLegs);
		System.out.println(this.contactNo);
	    System.out.println(this.noOfExGirlFriend);
		System.out.println(this.currentLocation);
		System.out.println(this.type);
		System.out.println(this.talent);
		
		
		
		
		for(int i=0;i<wifeName.length;i++) {
			String String=wifeName[i];
			System.out.println(String);
			}
		
		
		
		for(int i=0;i<bodyParts.length;i++) {
			String String=bodyParts[i];
			System.out.println(String);
			}
		
		
		for(int i=0;i<homeTown.length;i++) {
			String String=homeTown[i];
			System.out.println(String);
			}
		
		
		
		for(int i=0;i<friends.length;i++) {
			String String=friends[i];
			System.out.println(String);
			}
		
		
		
		
		for(int i=0;i<girlFriendName.length;i++) {
			String String=girlFriendName[i];
			System.out.println(String);
			}
		
		
		for(int i=0;i<color.length;i++) {
			String String=color[i];
			System.out.println(String);
			}
		
		
		
		
			
		
		}
	
	

}

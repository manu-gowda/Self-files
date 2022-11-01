package com.xworkz.urwish.boot;

public class OmkarRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] wifeName= {"omkarwife","gottila","gottagtilla","heltilla"};
		 String[] bodyParts= {"eyes","mouth","familypack","hands","etc.."};
		 String[] homeTown= {"bangalore","rajaginager","karnataka"};
		 String[] friends= {"akshay","hareesh","manu","darshan","shubham"};
		 long[] girlFriendNo= {9988334466L,8618461535L};
		 String[] color= {"white","mixcolor"};
		
		 
		 Omkar devloper= new Omkar(wifeName, 0, 0, 0, bodyParts, homeTown, friends, friends, 0, girlFriendNo, null, false, false, color);
		 devloper.display();

	}

}

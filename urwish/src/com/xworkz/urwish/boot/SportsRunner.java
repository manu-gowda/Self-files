package com.xworkz.urwish.boot;

public class SportsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] typeOfSports= {"kabaddi","cricket","football"};
		 String[] teamCaptionName= {"manugowda","omkar","shubham"};
		 String[] coachesName= {"ravi_sastri","dravid","ricky_pointing"};
		 String[] stadiumName= {"mohali","edan_garden","chinnaswamy"};
		 String[] sportsPresident= {"ganguly","manufuture_president"};
		 String[] noOfBowlersTypes= {"spin","fast","medium_fast"};
		 
		 
		 Sports index= new Sports(typeOfSports, 0, 0, 0, teamCaptionName, coachesName, stadiumName, sportsPresident, 0, null, null, noOfBowlersTypes);
		 index.display();
		 
		 
	}

}

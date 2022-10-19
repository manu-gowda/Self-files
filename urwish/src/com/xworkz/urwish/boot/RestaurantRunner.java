package com.xworkz.urwish.boot;

public class RestaurantRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nameOfRestaurant= {"omkerres","aishu_res","josi_res"};
		 String[] customerName= {"manugowda","omkar","shubham"};
		 String[] workersName= {"ravi_sastri","dravid","ricky_pointing"};
		 String[] ownerName= {"mohali","edan_garden","chinnaswamy"};
		 String[] ownerDaughtersName= {"shinchu","priyaa","vidyaa"};
		 String[] areas= {"banavara","yashwnpura","rajajinagar"};
		 
		 
		 
		 
		 Restaurant index=new Restaurant(nameOfRestaurant, 0, 0, 0, customerName, workersName, ownerName, ownerDaughtersName, 0, null, null, areas);
		 index.display();
		 

	}

}

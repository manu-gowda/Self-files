package com.xworkz.urwish.boot;


public class HouseRunner {

	public static void main(String[] args) {
		String[] wifeName= {"shubhamwife","yogitha","sahana","swathi"};
		 String[] husbandName= {"puttegowda","ganesh","ningegowda"};
		 String[] homeTown= {"belur","chikmagalore","karnataka"};
		 String[] childranName= {"akshay","hareesh","manu","darshan"};
		 long[] ownerNumber= {9988334466L,8618461535L};
		 String[] colorOfHouse= {"white","mixcolor"};
		
		 House index = new House(wifeName, 0, 0, 0, husbandName, homeTown, childranName, homeTown, 0, ownerNumber, null, colorOfHouse);
		 index.display();
        

	

	}

}

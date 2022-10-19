package com.xworkz.urwish.boot;

public class LandRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] landName= {"agricultureland","site"};
		 String[] ownerName= {"puttegowda","ganesh","ningegowda"};
		 String[] typeOfSoils= {"redsoil","blacksoil","whitesoil"};
		 String[] ownerWifeName= {"madam","avre","miss","teacher"};
		 long[] landOwnerNumber= {9988334466L,8618461535L};
		 String[] landLocation= {"belur","hassan"};
		
		 
		 Land index =new Land(landName, 0, 0, ownerName, typeOfSoils, ownerWifeName, ownerWifeName, 0, landOwnerNumber, null, landLocation);
		 index.display();
	
		
	}

}

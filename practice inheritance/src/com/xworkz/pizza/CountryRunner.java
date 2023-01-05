package com.xworkz.pizza;
import com.xworkz.pizza.*;
public class CountryRunner {

	public static void main(String[] args) {
		
		
		India ref = new India();
		System.out.println(ref.name);
		System.out.println(ref.papulation);
		System.out.println(ref.familyMembers);
		
		System.out.println("===============");
		
		Country ref1 = new India();
		System.out.println(ref1.name);
		System.out.println(ref1.familyMembers);
		System.out.println(ref1.papulation);
		India ref2 =(India)ref1;
		System.out.println(ref2.indiaPapulation);
		System.out.println(ref2.statesName);
		System.out.println("=============");
		
		Srilanka ref3 =new Srilanka();
		System.out.println(ref3.noOfPlayers);
		System.out.println(ref3.team);
		System.out.println(ref3.totalRuns);
		System.out.println("======================");
		
		pakistan ref4 =new pakistan();
		System.out.println(ref4.badPopulation);
		System.out.println(ref4.wars);
		
	
		
		

	}

}

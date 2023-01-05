package com.xworkz.inheritance.things;

import com.xworkz.inheritance.overriding.*;

public class PoliticalPartyRunner {

	public static void main(String[] args) {
		
		PoliticalParty adc=new Jds("20k",120,"kumar swamy");
		adc.display();
		
		PoliticalParty ref=new Jds("34k",234,"fsldkjjj");
		
		ref.display();
		

	}

}

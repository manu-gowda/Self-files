package com.xworkz.inheritance.things;

import com.xworkz.inheritance.boot.*;

public class CourtRunner {

	public static void main(String[] args) {
		

		supremeCourt ref=new supremeCourt();
		System.out.println(ref.name);
		System.out.println(ref.dressCode);
		System.out.println(ref.area);
		System.out.println(ref.location);
		System.out.println("MMMMMMMMMMMMMMMMMMMMMM");
		
		Court court=new supremeCourt();
		System.out.println(court.name);
		System.out.println(court.dressCode);
		supremeCourt court2=(supremeCourt)court;  
		System.out.println(court2.area);
		System.out.println(court2.location);
		System.out.println("AAAAAAAAAAAAAAAAAAAAAA");
		
		
		Court court3=new HighCourt();
		System.out.println(court3.name);
		System.out.println(court3.dressCode);
		HighCourt court4=(HighCourt)court3;    
		System.out.println(court4.nameOfJudge);
		System.out.println(court4.judgeDaughterName);
		System.out.println("NNNNNNNNNNNNNNNNNNNNNN");
		
		Court court5=new DistrictCourt();
		System.out.println(court5.name);
		System.out.println(court5.dressCode);
		DistrictCourt court6=(DistrictCourt)court5;   
		System.out.println(court6.noOfCases);
		System.out.println(court6.nameOfAdvocate);
		System.out.println("UUUUUUUUUUUUUUUUUUUUUU");

	}

}
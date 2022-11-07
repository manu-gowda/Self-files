package com.xworkz.inheritance.things;

import com.xworkz.inheritance.boot.*;

public class JailRunner {

	public static void main(String[] args) {
		
		Jail jail=new SpecialJail();
		System.out.println(jail.name);
		System.out.println(jail.location);
		SpecialJail SpecialJail=(SpecialJail)jail;
		System.out.println(SpecialJail.jailName);
		System.out.println(SpecialJail.compoundHight);
		System.out.println("(((((((((((((((((((((((((((((((((((((((");
		
		Jail jail2=new MentalJail();
		System.out.println(jail.name);
		System.out.println(jail.location);
		MentalJail jail3=(MentalJail)jail2;
		System.out.println(jail3.name);
		System.out.println(jail3.healthIssue);
		System.out.println(")))))))))))))))))))))))))))))))))))))))");
		
		Jail jail4=new WomenCrimeJail();
		System.out.println(jail.name);
		System.out.println(jail.location);
		WomenCrimeJail jail5=(WomenCrimeJail)jail4;
		System.out.println(jail5.crime);
		System.out.println(jail5.womenName);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
		
		}

}

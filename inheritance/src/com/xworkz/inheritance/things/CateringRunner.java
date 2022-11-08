package com.xworkz.inheritance.things;

import com.xworkz.inheritance.boot.exception.*;

public class CateringRunner {

	public static void main(String[] args) {
		System.out.println("catering nadita edeeee");
		Catering Catering=new FoodTruckCatering("rajaginagar","om","gottila");
		System.out.println(Catering.area);
		System.out.println(Catering.ownerName);
		System.out.println(Catering.ownerWifeName);
		
		

	}

}

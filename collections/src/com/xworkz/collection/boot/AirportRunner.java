package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.dto.AirportDTO;



public class AirportRunner {



	public static void main(String[] args) {
		
		AirportDTO Airport1 = new AirportDTO("HassanAirport","Hassan",1000);
		AirportDTO Airport2 = new AirportDTO("bangaloreAirport","Bangalore",1500);
		AirportDTO Airport3 = new AirportDTO("HassanAirport","Hassan",2000);
        AirportDTO Airport4 = new AirportDTO("MysoreAirport","mysore",3000);
		AirportDTO Airport5 = new AirportDTO("mangaloreAirport","mangalore",4000);
		
		boolean equals = Airport1.equals(Airport3);
	    System.out.println(Airport1.getName().equals(Airport1.getName()));
	    
	    Collection<AirportDTO> Airport = new ArrayList<AirportDTO>();
	    Airport.add(Airport1);
	    Airport.add(Airport3);
	    
	    boolean contains = Airport.contains(Airport3);
	    System.out.println("contains" +contains);

	}

}

package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.dto.PlaceDTO;

public class PlaceRunner {

	public static void main(String[] args) {
		PlaceDTO PlaceDTO1=new PlaceDTO("Belur","Karnataka","India");
		PlaceDTO PlaceDTO2=new PlaceDTO("BagaBeach","Goa","India");
		PlaceDTO PlaceDTO3=new PlaceDTO("Hassan","Karnataka","India");
		PlaceDTO PlaceDTO4=new PlaceDTO("Sikaripura","Karnatak","India");
		PlaceDTO PlaceDTO5=new PlaceDTO("ckm","Karntaka","India");
		
		boolean equals = PlaceDTO1.equals(PlaceDTO3);
	    System.out.println(PlaceDTO1.getState().equals(PlaceDTO3.getState()));
	    
	    Collection<PlaceDTO> Places = new ArrayList<PlaceDTO>();
	    Places.add(PlaceDTO1);
	    Places.add(PlaceDTO3);
	    
	    boolean contains = Places.contains(PlaceDTO3);
	    System.out.println("contains" +contains);
	    
		
	}



	

}

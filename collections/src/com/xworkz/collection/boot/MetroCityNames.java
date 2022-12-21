package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MetroCityNames {

	public static void main(String[] args) {
	   
		
		String MetroCityNames="Bangalore";
		String MetroCityNames1="Mumbai";
		String MetroCityNames2="Delhi";
		String MetroCityNames3="Hyderabad";
		String MetroCityNames4="Kolkata";
		
		Collection<String> collection=new ArrayList<String>();
		
		
		collection.add(MetroCityNames);
		collection.add(MetroCityNames2);
		collection.add(MetroCityNames3);
		collection.add(MetroCityNames4);
		collection.add(MetroCityNames1);
		collection.add(MetroCityNames);
		collection.add(MetroCityNames2);
		collection.add(MetroCityNames3);
		collection.add(MetroCityNames4);
		collection.add("Dasarahalli metro");
		collection.add(null);
		collection.add(MetroCityNames4);

		System.out.println(collection.size());
		System.out.println("~~~~~~~~~~size~~~~~~~~~~~~~~~~~~");
		
		//for loop
		for(String shoe:collection) {
			System.out.println(shoe);
			
		}
		System.out.println("============for loop============");
           Iterator<String> ref = collection.iterator();
		
		       while(ref.hasNext()) {
		
		    	   String Size=ref.next();
			                System.out.println(Size);
		}

		
		

	}

}

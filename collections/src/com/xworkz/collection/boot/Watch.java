package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Watch {

	public static void main(String[] args) {
		
		
		String Watch1 = "Apple";
		String Watch2 = "Rolex";
		String Watch3 = "Jaeger";
		String Watch4 = "Richard";
		String Watch5 = "Noise";
		
		Collection<String> Watch=new ArrayList<String>();
		
		Watch.add(Watch1);
		Watch.add(Watch2);
		Watch.add(Watch3);
		Watch.add(Watch4);
		Watch.add(Watch5);
		Watch.add("Timer");
		Watch.add(null);
		Watch.add(null);
		Watch.add(null);


		
		System.out.println(Watch.size());
		System.out.println(Watch);
		
		
		for(String Main:Watch) {
			System.out.println(Main);
		}
		
		Iterator<String> ref = Watch.iterator();
		
		while(ref.hasNext()) {
		
			String Main=ref.next();
			System.out.println(Main);
		}
		

	}

}

package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Animal {

	public static void main(String[] args) {
		
		
		String Animal1="loin";
		String Animal2="Tiger";
		String Animal3="Snake";
		String Animal4="Chithaa";
		String Animal5="Frag";
		String Animal6="Cat";
		String Animal7="Dog";
		String Animal8="Akshay";
		String Animal9="Elephant";
		String Animal10="Cow";
		String Animal11="Horse";
		
		Collection<String> Animal=new ArrayList<String>();
		
		
		Animal.add(Animal1);
		Animal.add(Animal2);
		Animal.add(Animal3);
		Animal.add(Animal4);
		Animal.add(Animal5);
		Animal.add(Animal6);
		Animal.add(Animal7);
		Animal.add(Animal8);
		Animal.add(Animal9);
		Animal.add(Animal10);
		Animal.add(Animal11);
		Animal.add(null);
		Animal.add(null);
		Animal.add(Animal9);
		Animal.add(Animal10);
		Animal.add(Animal11);
		Animal.add("interface");
		Animal.add(null);
		Animal.add(null);
		Animal.add(null);

		System.out.println(Animal.size());
		System.out.println(Animal);
		
		//for each loop
		
		for(String Element: Animal) {
			System.out.println(Element);
			
		}
		
		System.out.println("Iterator=================");
		
		//interface ref
		
		Iterator<String> ref = Animal.iterator();
		
		//while
		while(ref.hasNext()) {
			
			String Element = ref.next();
			System.out.println(Element);
			
			
			
			
		
			
		}
		
		
		
		
		
		
		
		
		

	}

}

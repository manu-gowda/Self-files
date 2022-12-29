package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.List;



public class ListRunner {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<String>();
		
		list.add("S");
		list.add("I");
		list.add("C");
		list.add("H");
		list.add("U");
		
		
		list.add(2,"N");
		
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("Element Size before remove"+list.size());
			list.remove("S");
			System.out.println("Element Size after remove"+list.size());
			for (String string : list) {
				System.out.println(string);

		
			
			}
			System.out.println("Element Size before remove"+list.size());
			list.remove(0);
			System.out.println("Element Size after remove"+list.size());
			for (String string : list) {
				System.out.println(string);
			}
		
		
	        System.out.println("===================");
			
			list.set(0, "M");
			System.out.println("==================");
			
			for (String string1 : list) {
				System.out.println(string1);
				
			}
			list.add("U");
			System.out.println("+++++++++++++");
			for (String string : list) {
				System.out.println(string);
			
				
			}
			list.get(0);
			String ref=list.get(0);
			System.out.println(ref);
}
}



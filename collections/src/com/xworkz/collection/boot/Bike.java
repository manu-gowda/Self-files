package com.xworkz.collection.boot;

import java.util.Collection;
import java.util.TreeSet;

public class Bike {

	public static void main(String[] args) {
		
		String Bike="FZ";
		String Bike1="NS";
		String Bike2="Pulser";
		String Bike3="Ninja";
		String Bike4="BMW";
		String Bike5="Platina";
		String Bike6="KTM";
		String Bike7="Duke";
		String Bike8="Cycle";
		String Bike9="Bullet";
		String Bike10="sukti";
		String Bike11="honda";
		String Bike12="FZ1";
		String Bike13="FZ2";
		String Bike14="FZ3";
		String Bike15="FZ4";
		String Bike16="FZ5";
		String Bike17="FZ6";
		
		
		Collection<String> collection=new TreeSet();
		collection.add(Bike);
		collection.add(Bike1);
		collection.add(Bike2);
		collection.add(Bike3);
		collection.add(Bike4);
		collection.add(Bike5);
		collection.add(Bike6);
		collection.add(Bike7);
		collection.add(Bike8);
		collection.add(Bike9);
		collection.add(Bike10);
		collection.add(Bike11);
		collection.add(Bike12);
		collection.add(Bike13);
		collection.add(Bike14);
		collection.add(Bike15);
		collection.add(Bike16);
		collection.add(Bike17);
		collection.add("Shinchuu");
		
		
		System.out.println(collection.size());
		collection.clear();
		
		System.out.println("After clear=====");
		System.out.println(collection.size());







	}

}

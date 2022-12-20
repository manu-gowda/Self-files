package com.xworkz.collection.boot;

import java.util.Collection;
import java.util.TreeSet;

public class Sweet {

	public static void main(String[] args) {
		
		
	String Sweet="Jamun";
	String Sweet1="Badusha";
	String Sweet2="Mysore Pak";
	String Sweet3="Khova";
	String Sweet4="Bhatkal Halwa";
	String Sweet5="Dharwad peda";
	String Sweet6="Gokak";
	String Sweet7="Halbai";
	String Sweet8="Chiroti";
	String Sweet9="Ladoo";
	String Sweet10="Kajjaya";
	String Sweet11="Dry Jamun";
	String Sweet12="Halva";
	
	Collection<String> collection=new TreeSet();
	
	collection.add(Sweet);
	collection.add(Sweet1);
	collection.add(Sweet2);
	collection.add(Sweet3);
	collection.add(Sweet4);
	collection.add(Sweet5);
	collection.add(Sweet6);
	collection.add(Sweet7);
	collection.add(Sweet8);
	collection.add(Sweet9);
	collection.add(Sweet10);
	collection.add(Sweet11);
	collection.add(Sweet12);
	
	
	System.out.println(collection.size());
	
	collection.clear();
	
	System.out.println("After Clear.......");
	System.out.println(collection.size());
	
	
	}

}

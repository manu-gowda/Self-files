package com.xworkz.collection.dto;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Collectors;

import com.xworkz.collection.boot.Type;
import com.xworkz.collection.boot.WeaponDTO;

public class WeaponDTORunner {

	private static final Comparator<WeaponDTO> integer = null;

	public static void main(String[] args) {
		
		Collection<WeaponDTO> collection = new LinkedList<WeaponDTO>();
		collection.add(new WeaponDTO("shubham","1997","maharastra",40000,Type.Akshay));
		collection.add(new WeaponDTO("darshan","2001","india",30000,Type.Karthik));
		collection.add(new WeaponDTO("akshay","1998","india",20000,Type.Limited));
		collection.add(new WeaponDTO("limited","2002","india",50000,Type.Thilak));
		collection.add(new WeaponDTO("thilak","1999","india",60000,Type.Shubham));
		collection.add(new WeaponDTO("manu","1999","india",80000,Type.Shubham));
		
		

		System.out.println("Sort by Price in greater");		
		Comparator<WeaponDTO> ref=(a1,a2)->Double.compare(a2.getPrice(), a1.getPrice());
		collection.stream().sorted(ref).collect(Collectors.toList()).forEach(ele->System.out.println(ele));
		

		System.out.println("Sort by madeBy and madeOn");
		collection.stream().sorted((a1,a2)->a1.getMadeBy().compareTo(a2.getMadeBy())).sorted((a1,a2)->a1.getMadeOn().compareTo(a2.getMadeOn())).forEach(ele->System.out.println(ele));
		
		System.out.println("Sort by name in descending");
		collection.stream().sorted((a1,a2)->a2.getName().compareTo(a1.getName())).forEach(ele->System.out.println(ele));
		
		System.out.println("Sort by MadeBy");
		collection.stream().sorted((a1,a2)->a1.getMadeBy().compareTo(a2.getMadeBy())).forEach(ele->System.out.println(ele));
		
		System.out.println("Sort by MadeOn");
		collection.stream().sorted((a1,a2)->a1.getMadeOn().compareTo(a2.getMadeOn())).forEach(ele->System.out.println(ele));
		
		System.out.println("Sort by price");
		collection.stream().sorted((a1,a2)->Double.compare(a1.getPrice(), a2.getPrice())).forEach(ele->System.out.println(ele));

		System.out.println("Sort by price descending");
		collection.stream().sorted((a1,a2)->Double.compare(a2.getPrice(), a1.getPrice())).forEach(ele->System.out.println(ele));
		
		System.out.println("Sort by name and madeOn");
		collection.stream().sorted((a1,a2)->a1.getName().compareTo(a2.getName())).sorted((a1,a2)->a1.getMadeOn().compareTo(a2.getMadeOn())).forEach(ele->System.out.println(ele));
		
		System.out.println("Sort by type,madeBy and name in descending");
		collection.stream().sorted((a1,a2)->a2.getType().compareTo(a1.getType())).sorted((a1,a2)->a2.getMadeBy().compareTo(a1.getMadeBy())).sorted((a1,a2)->a2.getName().compareTo(a1.getName())).forEach(ele->System.out.println(ele));


	}
		

	}



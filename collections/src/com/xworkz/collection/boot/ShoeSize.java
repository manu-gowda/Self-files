package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoeSize {

	public static void main(String[] args) {
		
		
	    int ShoeSize1 = 8;
		int ShoeSize2 = 6;
		int ShoeSize3 = 7;
		int ShoeSize4 = 2;
		int ShoeSize5 = 4;
		int ShoeSize6 = 5;
		int ShoeSize7 = 10;
		int ShoeSize8 = 11;
		int ShoeSize9 = 12;
		int ShoeSize10 = 13;
		int ShoeSize11 = 14;
		int ShoeSize12 = 1;
		int ShoeSize13 = 3;
		int ShoeSize14 = 15;
		
		Collection<Integer> Size=new ArrayList<Integer>();
		
		
		Size.add(ShoeSize1);
		Size.add(ShoeSize2);
		Size.add(ShoeSize3);
		Size.add(ShoeSize4);
		Size.add(ShoeSize5);
		Size.add(ShoeSize6);
		Size.add(ShoeSize7);
		Size.add(ShoeSize8);
		Size.add(ShoeSize9);
		Size.add(ShoeSize10);
		Size.add(ShoeSize11);
		Size.add(ShoeSize12);
		Size.add(ShoeSize13);
		Size.add(ShoeSize14);
		Size.add(23);
		Size.add(null);
		Size.add(0);
		Size.add(null);
		Size.add(ShoeSize14);
		Size.add(ShoeSize6);
		
		
		System.out.println(Size.size());
		System.out.println("~~~~~~~~~~size~~~~~~~~~~~~~~~~~~");
		
		//for loop
		for(Integer shoe:Size) {
			System.out.println(shoe);
			
		}
		System.out.println("============for loop============");
           Iterator<Integer> ref = Size.iterator();
		
		       while(ref.hasNext()) {
		
		    	   Integer Size1=ref.next();
			                System.out.println(Size1);
		}
	}

}

package com.xworkz.collection.boot;

import java.util.Collection;
import java.util.TreeSet;

public class Coupon {

	public static void main(String[] args) {
		
		
		String Coupoun="ProductCoupons";
		String Coupoun1="ProductCoupons1";
		String Coupoun2="ProductCoupons2";
		String Coupoun3="ProductCoupons3";
		String Coupoun4="ProductCoupons4";
		String Coupoun5="ProductCoupons5";
		String Coupoun6="ProductCoupons6";
		String Coupoun7="ProductCoupons7";
		String Coupoun8="ProductCoupons8";
		String Coupoun9="ProductCoupons9";
		String Coupoun10="ProductCoupons10";
		String Coupoun11="ProductCoupons11";
		String Coupoun12="ProductCoupons12";
		
		Collection<String> collection=new TreeSet();
		
		collection.add(Coupoun);
		collection.add(Coupoun1);
		collection.add(Coupoun2);
		collection.add(Coupoun3);
		collection.add(Coupoun4);
		collection.add(Coupoun5);
		collection.add(Coupoun6);
		collection.add(Coupoun7);
		collection.add(Coupoun8);
		collection.add(Coupoun9);
		collection.add(Coupoun10);
		collection.add(Coupoun11);
		collection.add(Coupoun12);
		
		
		System.out.println(collection.size());
		
		collection.clear();
		
		System.out.println("After clear...............");
		System.out.println(collection.size());
		
		
		
		

	}

}

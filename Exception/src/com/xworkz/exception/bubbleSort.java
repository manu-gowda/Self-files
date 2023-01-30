package com.xworkz.exception;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bubbleSort {
	public static void main(String[] args) {
		
	
//	List<Integer> list=new ArrayList<Integer>();
//	
//	list.add(5);
//	list.add(5);
//	list.add(5);
//	list.add(5);
		
		Integer[] it= {5,23,45,12,89,76};
		
		List<Integer> ref= Stream.of(it).collect(Collectors.toList());
				
		
		System.out.println("size  "+ref.size());
				ref.remove(0);
				
			Comparator<Integer> cop=(a1,a2)->a1.compareTo(a2);
			ref.stream().sorted(cop).forEach(c->System.out.println(c));
	
		}
	
}

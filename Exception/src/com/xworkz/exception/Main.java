package com.xworkz.exception;
    import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.Set;

	public class Main {
    public static int countNonCommonElements(ArrayList<Integer> list1, ArrayList<Integer> list2) {
	        Set<Integer> set1 = new HashSet<>(list1);
	        Set<Integer> set2 = new HashSet<>(list2);
	        set1.removeAll(list2);
	        set2.removeAll(list1);
	        return set1.size() + set2.size();
	    }

	    public static void main(String[] args) {
	        ArrayList<Integer> list1 = new ArrayList<>();
	        list1.add(1);
            list1.add(2);
	        list1.add(5);
	        list1.add(4);
	        list1.add(9);
	        list1.add(11);

	        ArrayList<Integer> list2 = new ArrayList<>();
	        list2.add(12);
	        list2.add(5);
	        list2.add(4);
	        list2.add(6);
	        list2.add(14);	
	        System.out.println("elements list");

	        int nonCommonCount = countNonCommonElements(list1, list2);
	        System.out.println(nonCommonCount);
	    }
	}




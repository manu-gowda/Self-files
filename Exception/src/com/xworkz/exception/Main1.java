package com.xworkz.exception;


	import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.Scanner;
	import java.util.Set;

	public class Main1 {
	    public static int countNonCommonElements(ArrayList<Integer> list1, ArrayList<Integer> list2) {
	        Set<Integer> set1 = new HashSet<>(list1);
	        Set<Integer> set2 = new HashSet<>(list2);
	        set1.removeAll(list2);
	        set2.removeAll(list1);
	        return set1.size() + set2.size();
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int len1 = sc.nextInt();
	        int len2 = sc.nextInt();
	        ArrayList<Integer> list1 = new ArrayList<>();
	        ArrayList<Integer> list2 = new ArrayList<>();
	        for (int i = 0; i < len1; i++) {
	            list1.add(sc.nextInt());
	        }
	        for (int i = 0; i < len2; i++) {
	            list2.add(sc.nextInt());
	        }
	        int nonCommonCount = countNonCommonElements(list1, list2);
	        System.out.println(nonCommonCount);
	    }
	}



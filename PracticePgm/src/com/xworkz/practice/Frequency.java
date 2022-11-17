package com.xworkz.practice;

public class Frequency {

	public static void main(String[] args) {
		 String n="manu is a legend pro max";
		 int count=0;
		 char ch='m';
		 for(int i=0;i<n.length();i++)
		 {
		 if(ch==n.charAt(i)) {
			 ++count;
		 
		 }   
	}
		 System.out.println("character enetred :"+ch+"  frequency"+count);
}}
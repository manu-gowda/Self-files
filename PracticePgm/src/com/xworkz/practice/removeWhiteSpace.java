package com.xworkz.practice;

public class removeWhiteSpace {

	public static void main(String[] args) {
		
		String str1="remove  White  Space";
		
		str1= str1.replaceAll("\\s+","");
		
		System.out.println("String after removing all the white spaces:"+str1);

	}

}

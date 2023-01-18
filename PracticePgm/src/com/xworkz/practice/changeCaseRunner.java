package com.xworkz.practice;

public class changeCaseRunner {

	public static void main(String[] args) {
	    
		
		String ref="SaaRtha";
		StringBuffer newref=new StringBuffer(ref);
		for(int i=0;i<ref.length();i++) {
			if(Character.isLowerCase(ref.charAt(i))) {
				newref.setCharAt(i,Character.toUpperCase(ref.charAt(i)));
			}
				
				else if (Character.isUpperCase(ref.charAt(i))) {
				newref.setCharAt(i,Character.toLowerCase(ref.charAt(i)));
				
				
				
			}
			
		}
			
			
		 System.out.println("change converstion to:"+newref);
	}

}

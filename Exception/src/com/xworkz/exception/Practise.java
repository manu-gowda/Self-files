package com.xworkz.exception;

import com.sun.xml.internal.bind.api.AccessorException;

public class Practise {

	
	String name ;
	int height;
	
	
	public void test(String name,int height) throws AccessorException {
		
		System.out.println(name);
		//System.out.println(height);
		
		if(height<4) {
			//System.out.println(height);
			 throw new AccessorException();
		}
		
	
		System.out.println(height);
	}
}

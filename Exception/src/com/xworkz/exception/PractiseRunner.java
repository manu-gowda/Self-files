package com.xworkz.exception;

import com.sun.xml.internal.bind.api.AccessorException;

public class PractiseRunner {

	public static void main(String[] args) {
		
		Practise practise = new Practise();
		
		try {
			practise.test("manu", 5);
		} catch (AccessorException e) {
			
			e.printStackTrace();
		}
		finally {
			System.out.println("running  fainnaly block");
		}
		

	}

}

package com.xworkz.practice;

public class Jack5Multiply {

	public static void main(String[] args) {
		int n=3919;
		int temp=n;
		int count=0;
		while(n>0) {
		
			System.out.println(n);

			n=n/10;
			count++;
		}
		
		System.out.println(((int)Math.pow(5, count))*temp);

	}

}

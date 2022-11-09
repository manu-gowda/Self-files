package com.xworkz.inheritance.overriding;

public class Rashmi extends Director {
	
	public float hight;
	public Rashmi(String color, String directorOf,float hight) {
		super(color, directorOf);
		this.hight=hight;
	}
    public void showoff() {
    	super.showoff();
    	System.out.println(hight);
    }
	
	

    
}

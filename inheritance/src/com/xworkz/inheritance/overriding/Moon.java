package com.xworkz.inheritance.overriding;

public class Moon extends Satellite{
	
	public String shape;
	
	public Moon(String name, double expenditure, String shape) {
		super(name, expenditure);
		this.shape=shape;
		
	}
	
	public void showoff() {
    	super.showoff();
    	System.out.println(shape);

	
     }
}
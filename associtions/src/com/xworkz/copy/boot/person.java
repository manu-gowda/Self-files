package com.xworkz.copy.boot;


public class person {
	public String name;
	public Email[] email;
	public Job job;
	
	
	
	public person(String name, Email[] email, Job job) {
		super();
		this.name = name;
		this.email = email;
		this.job = job;
	}
	public void showofperson() {
		System.out.println(name);
		job.showofjob();
		System.out.println(System.lineSeparator());
		System.out.println("personnnnnnnnnn");
		for (int i = 0; i < this.email.length; i++) {
			Email email2 = this.email[i];
			
			if(email2!=null) {
				
				email2.showofemail();
			}
		}
		
		
	}
	
	
	
	

}

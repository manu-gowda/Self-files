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
		System.out.println(job);
		job.showofjob();
		System.out.println("personnnnnnnnnn");
		for(int i=0;i<=email.length;i++) {
			System.out.println(email[i].id);
			System.out.println(email[i].mobileNo);
			System.out.println(email[i].company.name);
			System.out.println(email[i].company.address.location.state.name);
			System.out.println(email[i].password);
			
			
		}
		
		
	}
	
	
	
	

}

package com.xworkz.copy.boot;

public class Job {
	public double salary;
	public String role;
	public boolean bond;
	public Company company;
	
	
	
	public Job(double salary, String role, boolean bond, Company company) {
		super();
		this.salary = salary;
		this.role = role;
		this.bond = bond;
		this.company = company;
	}
	
	public void showofjob() {
		
		System.out.println(salary);
		System.out.println(role);
		System.out.println(bond);
		company.showofcompany();
	
		
	}

		
	}
	
	


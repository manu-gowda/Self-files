package com.xworkz.inheritance.overriding;

public class Jds extends PoliticalParty {
	public String cm;

	
	public Jds(String fund, int noOfCandidates) {
		super(fund, noOfCandidates);
		
	}


	public Jds(String fund, int noOfCandidates, String cm) {
		super(fund, noOfCandidates);
		this.cm = cm;
	}

    public void display() {
    	super.display();
    	System.out.println(this.cm);
		
	}
		}



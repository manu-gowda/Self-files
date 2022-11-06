package com.xworkz.copy.boot;

public class State {
	public String name;
	public String cm;
	public int noOfDistricts;
	public String party;
	
	
	public State(String name, String cm, int noOfDistricts, String party) {
		super();
		this.name = name;
		this.cm = cm;
		this.noOfDistricts = noOfDistricts;
		this.party = party;
	}
	public void showofstates() {
		System.out.println(System.lineSeparator());
		System.out.println(name);
		System.out.println(cm);
		System.out.println(noOfDistricts);
		System.out.println(cm);
	}
	
	

}

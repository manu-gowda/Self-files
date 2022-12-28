package com.xworkz.collection.dto;

public class PlaceDTO {

	private String location;
	private String State;  
	private String country;
	
	
	public PlaceDTO() {
		super();
	
	}
public boolean equals(Object obj) {
	System.out.println("running equals from palceDTO");
		
		if(obj!=null) {
			if(obj instanceof PlaceDTO) {
				PlaceDTO dto = (PlaceDTO)obj;
				if(dto.country.equals(this.country)) {
					System.out.println("PalceDTO is matching:"+dto.country);
					return true;
				}
			}
		}
		return false;
		
	}


	
	@Override
	public String toString() {
		return "PlaceDTO [location=" + location + ", State=" + State + ", country=" + country + "]";
	}


    public PlaceDTO(String location, String state, String country) {
		super();
		this.location = location;
		setState(state);
		this.setCountry(country);
	}


   public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}



	public String getState() {
		return State;
	}

    
	
	public void setState(String state) {
		State = state;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}
	

	}

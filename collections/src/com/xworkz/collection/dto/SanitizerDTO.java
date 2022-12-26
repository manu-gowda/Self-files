package com.xworkz.collection.dto;

public class SanitizerDTO {
	private String id;
	private String Brand;
	private String country;
	private Double price;


	public SanitizerDTO() {
		
	
	}


	public SanitizerDTO(String id, String Brand, String country, Double price) {
		super();
		this.id = id;
		this.Brand = Brand;
		this.country = country;
		this.price = price;
	}


	

		@Override
	public String toString() {
		return "SanitizerDTO [id=" + id + ", Brand=" + Brand + ", country=" + country + ", price=" +"]";
				
	}


	

	public String getProducedBy() {
		return Brand;
	}


	public void setProducedBy(String Brand) {
		this.Brand = Brand;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}
	
	

    }



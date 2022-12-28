package com.xworkz.collection.dto;

public class AirportDTO {
	
	private String Name;
	private String Location;
	private Integer TicketPrice;
	

	public AirportDTO() {
		super();
		
	}
	
	public boolean equals(Object obj) {
		System.out.println("running equals from palceDTO");
			
			if(obj!=null) {
				if(obj instanceof AirportDTO) {
					AirportDTO dto = (AirportDTO)obj;
					if(dto.Name.equals(this.Name)) {
						System.out.println("AirportDTO is matching:"+dto.Name);
						return true;
					}
				}
			}
			return false;
			
		}

	public AirportDTO(String name, String location, Integer ticketPrice) {
		super();
		Name = name;
		Location = location;
		TicketPrice = ticketPrice;
	}
	
	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getLocation() {
		return Location;
	}

	
	public void setLocation(String location) {
		Location = location;
	}


	public Integer getTicketPrice() {
		return TicketPrice;
	}

	
	public void setTicketPrice(Integer ticketPrice) {
		TicketPrice = ticketPrice;
	}
       
	
	

	
	

}

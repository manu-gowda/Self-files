package com.xworkz.collection.dto;

public class CalendarDTO {
	
	private String name;
	private String Month;
	private Integer CurrentYear;
	
	
	
	public CalendarDTO() {
		super();
		
	}
	public boolean equals(Object obj) {
		System.out.println("running equals from palceDTO");
			
			if(obj!=null) {
				if(obj instanceof CalendarDTO) {
					CalendarDTO dto = (CalendarDTO)obj;
					if(dto.name.equals(this.name)) {
						System.out.println("CalendarDTO is matching:"+dto.name);
						return true;
					}
				}
			}
			return false;
			
		}
	public CalendarDTO(String name, Integer currentYear, String month) {
		super();
		this.name = name;
		CurrentYear = currentYear;
		Month = month;
	}
		public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getCurrentYear() {
		return CurrentYear;
	}
		public void setCurrentYear(Integer currentYear) {
		CurrentYear = currentYear;
	}
		public String getMonth() {
		return Month;
	}
	
	public void setMonth(String month) {
		Month = month;
	
	}

	
	
	
	

}

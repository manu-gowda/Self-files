package com.xworkz.collection.dto;

public class HolidayDTO {
	
	private String holidayname;
	private String holidaymonth;
	private Integer date;
	
	
	public HolidayDTO() {
		super();
	}
		public boolean equals(Object obj) {
			System.out.println("running equals from palceDTO");
				
				if(obj!=null) {
					if(obj instanceof HolidayDTO) {
						HolidayDTO dto = (HolidayDTO)obj;
						if(dto.holidayname.equals(this.holidayname)) {
							System.out.println("HolidayDTO is matching:"+dto.holidayname);
							return true;
						}
					}
				}
				return false;
				
			}

	


	public HolidayDTO(String holidayname, String holidaymonth, Integer date) {
		super();
		this.holidayname = holidayname;
		this.holidaymonth = holidaymonth;
		this.date = date;
	}


	@Override
	public String toString() {
		return "HolidayDTO [holidayname=" + holidayname + ", holidaymonth=" + holidaymonth + ", date=" + date + "]";
	}


		public String getHolidayname() {
		return holidayname;
	}


		public void setHolidayname(String holidayname) {
		this.holidayname = holidayname;
	}


	
	public String getHolidaymonth() {
		return holidaymonth;
	}


		public void setHolidaymonth(String holidaymonth) {
		this.holidaymonth = holidaymonth;
	}

	public Integer getDate() {
		return date;
	}



	public void setDate(Integer date) {
		this.date = date;
	}
	
	
	

}

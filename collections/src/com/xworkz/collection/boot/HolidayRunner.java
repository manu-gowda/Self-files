package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.dto.HolidayDTO;

public class HolidayRunner {

	public static void main(String[] args) {
        
		HolidayDTO HolidayDTO1 = new HolidayDTO("Deepavali","october",25);
		HolidayDTO HolidayDTO2 = new HolidayDTO("Loversday","Feb",14);
		HolidayDTO HolidayDTO3 = new HolidayDTO("Deepavali","nov",23);
		HolidayDTO HolidayDTO4 = new HolidayDTO("Sankrathi","Jan",15);
		HolidayDTO HolidayDTO5 = new HolidayDTO("Yugadhi","march",24);
		
		
		boolean equals = HolidayDTO1.equals(HolidayDTO3);
	    System.out.println(HolidayDTO1.getHolidayname().equals(HolidayDTO1.getHolidayname()));
	    
	    Collection<HolidayDTO> CalendarDTO = new ArrayList<HolidayDTO>();
	    CalendarDTO.add(HolidayDTO1);
	    CalendarDTO.add(HolidayDTO3);
	    
	    boolean contains = CalendarDTO.contains(HolidayDTO1);
	    System.out.println("CalendarDTO" +contains);


	}

}

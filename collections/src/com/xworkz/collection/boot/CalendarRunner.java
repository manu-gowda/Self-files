package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.dto.CalendarDTO;

public class CalendarRunner {

	public static void main(String[] args) {
		
		
		CalendarDTO CalendarDTO1 = new CalendarDTO("DasarahalliVidhanaSowda",2022,"December");
		CalendarDTO CalendarDTO2 = new CalendarDTO("hassanCalendar",2021,"november");
		CalendarDTO CalendarDTO3 = new CalendarDTO("DasarahalliVidhanaSowda",2022,"December");
		CalendarDTO CalendarDTO4 = new CalendarDTO("coffee",2022,"jan");
		CalendarDTO CalendarDTO5 = new CalendarDTO("belurcalender",2022,"july");
		  
		boolean equals = CalendarDTO1.equals(CalendarDTO3);
	    System.out.println(CalendarDTO1.getName().equals(CalendarDTO1.getName()));
	    
	    Collection<CalendarDTO> CalendarDTO = new ArrayList<CalendarDTO>();
	    CalendarDTO.add(CalendarDTO1);
	    CalendarDTO.add(CalendarDTO3);
	    
	    boolean contains = CalendarDTO.contains(CalendarDTO1);
	    System.out.println("CalendarDTO" +contains);

		
	}

}

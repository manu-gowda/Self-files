package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collection.dto.SanitizerDTO;

public class SanitizerRunner {

	public static void main(String[] args) {
		
		
		SanitizerDTO sanitizerDTO1 = new SanitizerDTO("1", "Sterillium", "india", 120D);
		SanitizerDTO sanitizerDTO2 = new SanitizerDTO("2", "Savlon", "india", 220D);
		SanitizerDTO sanitizerDTO3 = new SanitizerDTO("3", "Dettol", "india", 3200D);
		SanitizerDTO sanitizerDTO4 = new SanitizerDTO("4", "Lifebuoy", "india", 420D);
		SanitizerDTO sanitizerDTO5 = new SanitizerDTO("5", "Godrej", "india", 550D);
		SanitizerDTO sanitizerDTO6 = new SanitizerDTO("6", "Dabur", "india", 670D);
		SanitizerDTO sanitizerDTO7 = new SanitizerDTO("7", "Multani", "india", 720D);
		SanitizerDTO sanitizerDTO8 = new SanitizerDTO("8", "Corvil", "india", 800D);
		SanitizerDTO sanitizerDTO9 = new SanitizerDTO("9", "Trust", "india", 430D);
		SanitizerDTO sanitizerDTO10 = new SanitizerDTO("10", "DCM Shriram", "india", 552D);

		Collection<SanitizerDTO> collection = new ArrayList<SanitizerDTO>();
		collection.add(sanitizerDTO10);
		collection.add(sanitizerDTO9);
		collection.add(sanitizerDTO8);
		collection.add(sanitizerDTO7);
		collection.add(sanitizerDTO6);
		collection.add(sanitizerDTO5);
		collection.add(sanitizerDTO4);
		collection.add(sanitizerDTO3);
		collection.add(sanitizerDTO2);
		collection.add(sanitizerDTO1);

		Iterator<SanitizerDTO> ref1 = collection.iterator();
		while (ref1.hasNext()) {
			SanitizerDTO element = ref1.next();
		
			if (element.getPrice() > 30) {
				System.out.println("sanitizsers of price 25 or above " + element);
			}
		}
		Iterator<SanitizerDTO> ref2 = collection.iterator();
		while (ref2.hasNext()) {
			SanitizerDTO element2 = ref2.next();
			if (element2 != null) {
				System.out.println("no element is null" + element2);

			}
		}
		Iterator<SanitizerDTO> ref3 = collection.iterator();
		while (ref3.hasNext()) {
			SanitizerDTO element3 = ref3.next();
			if (element3.getProducedBy().matches("Savlon")) {
				ref3.remove();
				System.out.println("removed elements  " + element3);

			}
		}
		Iterator<SanitizerDTO> ref4 = collection.iterator();
		while (ref4.hasNext()) {
			SanitizerDTO element4 = ref4.next();
			if (element4.getPrice() < 429) {
				System.out.println("shortest priced sanitizer  " + element4);
				
			}
		}
		Iterator<SanitizerDTO> ref5 = collection.iterator();
		while (ref5.hasNext()) {
			SanitizerDTO element5 = ref5.next();
			if (element5.getPrice() > 530) {
				System.out.println("max priced sanitizer  " + element5);
	
			}
		}
		Iterator<SanitizerDTO> ref6 = collection.iterator();
		while (ref6.hasNext()) {
			SanitizerDTO element6 = ref6.next();
			if (element6.getPrice() > 680) {
				System.out.println("2nd max priced sanitizer  " + element6);
			}
		}

	}



	}



package com.xworkz.maven.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Battery {
	
	
		@Autowired
		private Capacity capacity;

		public Battery() {
			System.out.println("Create the battery by useing the no argu const");
		}

	}



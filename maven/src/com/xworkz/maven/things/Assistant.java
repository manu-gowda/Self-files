package com.xworkz.maven.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

	@Component
	public class Assistant {
		@Autowired
		private Company company;

		public Assistant() {
			System.out.println("create the assistant by useing no argu const.");
		}

	}



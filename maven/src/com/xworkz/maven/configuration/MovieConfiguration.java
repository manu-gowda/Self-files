package com.xworkz.maven.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
	@ComponentScan("com.xworkz.friaday")
	
	public class MovieConfiguration {

		public MovieConfiguration() {
			System.out.println("Registring the MovieConfiguration by useing no arg const..");
		}

	}



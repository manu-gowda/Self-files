package com.xworkz.match.servlet.Configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.match")
public class FoodItemConfiguration {

	public FoodItemConfiguration() {
		System.out.println("Created:"+this.getClass().getSimpleName());
	}
	
	

}

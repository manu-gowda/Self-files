package com.xworkz.servlet.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.servlet")
public class ManuConfiguration {
	
	public ManuConfiguration() {
	System.out.println("created:"+ this.getClass().getSimpleName());
	

}
}
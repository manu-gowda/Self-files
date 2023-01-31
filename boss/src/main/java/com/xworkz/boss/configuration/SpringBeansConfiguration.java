package com.xworkz.boss.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.boss")
public class SpringBeansConfiguration {

	public SpringBeansConfiguration() {
		System.out.println("created"+this.getClass().getSimpleName());
	}

	
}

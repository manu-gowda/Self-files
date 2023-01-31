package com.xworkz.boss.component;

import org.springframework.stereotype.Component;

@Component
public class FiftyRupeesComponent {
	
	
	public FiftyRupeesComponent() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}
}

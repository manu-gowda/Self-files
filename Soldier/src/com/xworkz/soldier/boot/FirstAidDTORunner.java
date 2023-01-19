package com.xworkz.soldier.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.soldier.cofigaration.SpringConfiguration;
import com.xworkz.soldier.dto.FirstAidDTO;
import com.xworkz.soldier.service.FirstAidService;

public class FirstAidDTORunner {
	
	public static void main(String[] args) {
		

		ApplicationContext context =new AnnotationConfigApplicationContext(SpringConfiguration.class);
		FirstAidService service = context.getBean(FirstAidService.class);
		
		boolean saved = service.ValidateAndSave(new FirstAidDTO());
		System.out.println("saved "+ saved);
	}
	
	

}

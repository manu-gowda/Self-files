package com.xworkz.match.servlet.Configuration;

import java.util.Arrays;

import javax.security.auth.login.Configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FoodItemWebMVC extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer  {


	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses");
		Class[] ref = { FoodItemConfiguration.class};
		System.out.println("getServletConfigClasses printing " + Arrays.toString(ref));
		return ref;
	}

	@Override
	protected String[] getServletMappings() {
	System.err.println("Running getServletMappings");
	String[] ref = { "/" };
	System.out.println("getServletMappings printing " + Arrays.toString(ref));
		return ref;
	} 	

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Running configureDefaultServletHandling");
		configurer.enable();
	}

}

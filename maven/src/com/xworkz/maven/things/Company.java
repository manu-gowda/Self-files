package com.xworkz.maven.things;

import javax.tools.DocumentationTool.Location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
	public class Company {
		private Location location;
		@Autowired
		public Company() {
			System.out.println("Craete the location by no arg const..");
		}

	}



package com.xworkz.maven.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
	public class Location {
		@Autowired
		private Area area;
		public Location() {
			System.out.println("Create location by useing no arg const...");
		}
		public void chuckPropetyRef() {
			System.out.println(this.area.hashCode() + "hash code of ref");
		}

	}



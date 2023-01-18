package com.xworkz.soldier.boot;

import com.xworkz.soldier.dto.SoldierDTO;

import com.xworkz.soldier.service.SoldierServiceImpl;


public class SoldierRunner {

	public static void main(String[] args) {
		
		
		SoldierDTO dto=new SoldierDTO("keshav", 2, "Topper", "ownbatallion", "india");
		SoldierServiceImpl service=new SoldierServiceImpl();
		SoldierRepoImpl repo=new SoldierRepoImpl();
		
		
		service.ValidateAndSave(dto);
		
		
		

	}

}

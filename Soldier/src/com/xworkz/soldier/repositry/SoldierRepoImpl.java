package com.xworkz.soldier.repositry;

import com.xworkz.soldier.dto.SoldierDTO;

public class SoldierRepoImpl implements SoldierRepo {
	
	public SoldierRepoImpl() {
		System.out.println("Created SoldierRepoImpl using no arg const...");
	}

	@Override
	public boolean save(SoldierDTO dto) {
		
		System.out.println("running save...");
		System.out.println("dto"+dto);
		
		return false;
	}

	
}

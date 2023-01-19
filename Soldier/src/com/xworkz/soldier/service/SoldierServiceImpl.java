package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.soldier.dto.SoldierDTO;
import com.xworkz.soldier.repositry.SoldierRepo;

public class SoldierServiceImpl implements SoldierService {
	
	private SoldierRepo SoldierRepo;
	
	
	 public SoldierServiceImpl() {
		System.out.println("create no args const...");
	}
    
    	public void setSoldierRepo(SoldierRepo soldierRepo) {
		this.SoldierRepo = soldierRepo;
	}

	@Override
	public boolean ValidateAndSave(SoldierDTO dto) {
		System.out.println("Started validateAndSave");
		System.out.println("DTO passes:"+dto);
		
		
		ValidatorFactory factory= Validation.buildDefaultValidatorFactory();
	   Validator validator= factory.getValidator();
	   Set<ConstraintViolation<SoldierDTO>> Violations= validator.validate(dto);
	   
	   if(!Violations.isEmpty()) {
		   System.out.println("there are validation errs");
		   
		   Violations.forEach(v ->{System.out.println("violation message"+v.getMessage());
		   });
			
		return false;
	}else {
		System.out.println("data is valid....");
		
		boolean saved= SoldierRepo.save(dto);
		System.out.println("dto saved using repo"+saved);
		return saved;
		
		
		
		

	}
}
}

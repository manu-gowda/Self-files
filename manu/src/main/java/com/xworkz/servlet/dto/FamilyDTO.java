package com.xworkz.servlet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FamilyDTO {
	
	private String surname;
	private String name;
	private String father;
	private String mother;
	private String sister;
	private String brother;
	private String grandFather;
	private String grandMother;
	private int  grandFatherAge;
	private int  grandMotherAge;
	

}

package com.xworkz.soldier.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString


public class SoldierDTO extends AbstractAuditDTO {
	@NotNull
	@NotBlank
	@Size(min=3,max=20)
	private String name;
	@Min(value=0)
	@Max(value=50000)
	private int id;
	@NotNull
	@NotBlank
	@Size(min=5,max=40)
	private String rank;
	@NotNull
	@NotBlank
	@Size(min=4,max=30)

	private String batallion;
	@NotNull
	@NotBlank
	@Size(min=3,max=50)
    private String country;
	
	

}

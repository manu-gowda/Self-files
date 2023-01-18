package com.xworkz.spring.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import io.smallrye.common.constraint.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor


public class Terrorist {
	
	@NotNull
	@NotBlank
	@Size(min=3,max=20,message =("djfsdfs"))
	
	private String name;
	private int age;
	private boolean alive;
	
	

}

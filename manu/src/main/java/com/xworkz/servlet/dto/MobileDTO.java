package com.xworkz.servlet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MobileDTO {

	private String name;
    private String ownerName;
    private String companyName;
    private double price;
    private double rom;
    

}

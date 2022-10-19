package com.xworkz.urwish.boot;

public class CompanyRunner {

	public static void main(String[] args) {
		String[] typeOfCompany= {"product_based","service_based","private"};
		 String[] managerName= {"manugowda","omkar","shubham"};
		 String[] district= {"bangalore","hassan","mysore"};
		 String[] region= {"rural","urban"};
		 long[] ownerNumber= {9988334466L,8618461535L};
		 String[] colorOfCompany= {"yellow","pink"};
		 Company index= new Company(typeOfCompany, 0, 0, 0, managerName, district, region, region, 0, ownerNumber, null, colorOfCompany);
		index.display();

	}

}

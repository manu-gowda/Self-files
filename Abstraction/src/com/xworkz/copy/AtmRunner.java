package com.xworkz.copy;

public class AtmRunner {

	public static void main(String[] args) {
		 Atm atm = new SbiAtm();
		 SbiAtm sbiatm =(SbiAtm)atm;
		 
		 
		 sbiatm.CheckBalance();
		 sbiatm.withdraw();
		 sbiatm.ministatemeny();
		 

	}

}

package com.xworkz.copy;
 class AtmRunner {

	public static void main(String[] args) {
		 Atm atm = (Atm) new SbiAtm();
		 SbiAtm sbiatm =(SbiAtm)atm;
		 
		 
		 ((Atm) sbiatm).CheckBalance();
		 sbiatm.withdraw();
		 sbiatm.ministatemeny();
		 

	}

}

package com.xworkz.copy.things;

import com.xworkz.copy.boot.*;

public class PersonRunner {

	public static void main(String[] args) {
	
		
		City city1 = new City("bengaluru","traffic",true,"manu");
		 State state1=new State("karnataka","kumaranna", 47,"jds");
	     Country country1 = new Country("india","karnataka","bangalore","manu");
		Location location1 = new Location("light",city1,state1,country1);
		Address address1 =new Address(location1);
		Company company1 =new Company("tcs","manu",address1);
		Email email1 =new Email("manu23",987654321,984530,company1);
		
		City city2 = new City("mumbai","dhsdjs",true,"sdju");
		 State state2=new State("kerala","dsddd", 47,"hsuhd");
	     Country country2 = new Country("aus","stadium","rishi","cdfdc");
		Location location2 = new Location("igroad",city2,state2,country2);
		Address address2 =new Address(location2);
		Company company2 =new Company("sinchu","sdasda",address2);
		Email email2 =new Email("mmmmmmm",3429732,342824,company2);
		
		Email[] email = {email1 ,email2};
		
		
		Job job = new Job(20000,"trainee",true,company1);
		
		person person = new person("shubham",email,job);
		 person.showofperson();
		 person.job.showofjob();
		 person.job.company.showofcompany();
		 person.job.company.address.location.city.showofcity();
		 person.job.company.address.location.country.showOfCountry();
		 person.job.company.address.location.state.showofstates(); 


	}

}

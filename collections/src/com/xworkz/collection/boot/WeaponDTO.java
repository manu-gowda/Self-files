package com.xworkz.collection.boot;

import java.io.Serializable;


public  class WeaponDTO implements Serializable,Comparable<WeaponDTO>  {
	private String name;
	private String madeOn;
	private String madeBy;
	private double price;
	private Type type;
	
	
	public WeaponDTO() {
		super();
	
	}
	
	
	public WeaponDTO(String name, String madeOn, String madeBy, double price, Type type) {
		super();
		this.name = name;
		this.madeOn = madeOn;
		this.madeBy = madeBy;
		this.price = price;
		this.type = type;
	}


	@Override
	public String toString() {
		return "WeaponDTO [name=" + name + ", madeOn=" + madeOn + ", madeBy=" + madeBy + ", price=" + price + ", type="
				+ type + "]";
	}
	
	private int Hashcode() {
		return 33;
		

	}
	
		public boolean equles(Object obj) {
		if (obj!=null) {
			if (obj instanceof WeaponDTO) {
             WeaponDTO dto=(WeaponDTO)obj;
				if(this.name.equals(dto.name)) {
					return true;
				}
			}
			
		}
		return false;
		

	}
	


	public String getName() {
		return name;
	}


		public void setName(String name) {
		this.name = name;
	}


	
	public String getMadeOn() {
		return madeOn;
	}


	
	public void setMadeOn(String madeOn) {
		this.madeOn = madeOn;
	}


	public String getMadeBy() {
		return madeBy;
	}


		public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public Type getType() {
		return type;
	}


	public void setType(Type type) {
		this.type = type;
	}


	@Override
	public int compareTo(WeaponDTO o) {
	
		return o.name.compareTo(this.name);
	}



	
	
	

}

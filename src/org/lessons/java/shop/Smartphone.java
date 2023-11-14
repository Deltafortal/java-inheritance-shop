package org.lessons.java.shop;

public class Smartphone extends Prodotto {

	
	//Defining variables
	private int imei;
	private int memorySpace;
	private double price = super.getPrice();
	
	
	//Constructor
	public Smartphone(int code, String name, String description, double price, int iva, int imei, int memorySpace, boolean hasLoyalityCard) {
		
		
		super(code, name, description, price, iva, hasLoyalityCard);
		
		setImei(imei);
		setMemorySpace(memorySpace);

	}
	
	
	
	
	//IMEI functions
	public int getImei() {
		return imei;
	}
	public void setImei(int imei) {
		this.imei = imei;
	}
	
	
	
	//MemorySpace functions
	public int getMemorySpace() {
		return memorySpace;
	}
	public void setMemorySpace(int memorySpace) {
		this.memorySpace = memorySpace;
	}
	
	
	
	//Price functions
	public double getDiscount() {
		
		if(super.hasLoyalityCard && getMemorySpace() < 32) {
			super.setPrice(price - (price / 100) * 5);
			return super.getPrice();
		} else {
			return super.getDiscount();
		}
	}
	
	
	
	//TO String
	
	@Override
	public String toString() {
		
		
		return super.toString() + "|Caratteristiche: " + "IMEI - " + getImei() + " |Spazio in Memoria: " + getMemorySpace() + "GB";
	}
	

}

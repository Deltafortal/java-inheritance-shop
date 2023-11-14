package org.lessons.java.shop;

public class Television extends Prodotto{

	
	
	//Defining variables
	private int size;
	private boolean isSmart;
	private double price = super.getPrice();
	
	
	
	//Constructor
	public Television(int code, String name, String description, double price, int iva, int size, boolean isSmart, boolean hasLoyalityCard) {
		
		
		super(code, name, description, price, iva, hasLoyalityCard);
		
		setSize(size);
		setIsSmart(isSmart);
		
	}
	
	
	
	//Size functions
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
	
	//isSmart functions
	public boolean getIsSmart() {
		return isSmart;
	}
	public void setIsSmart(boolean isSmart) {
		this.isSmart = isSmart;
	}
	
	
	
	
	//Price functions
	public double getDiscount() {
			
		if(super.hasLoyalityCard && !getIsSmart()) {
			super.setPrice(price - (price / 100) * 10);
			return super.getPrice();
		} else {
			return super.getDiscount();
		}
	}
	
	
	
	
	//TO String
	
	@Override
	public String toString() {
		
		
		return super.toString() + "|Caratteristiche: " + "Grandezza: " + getSize() + "cm" + " |SmartTV: " + getIsSmart();
		
	}

}

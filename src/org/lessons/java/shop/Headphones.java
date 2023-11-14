package org.lessons.java.shop;

public class Headphones extends Prodotto{

	
	
	//Defining variables
	private String color;
	private boolean isCablate;
	private double price = super.getPrice();
	
	
	
	//Constructor
	public Headphones(int code, String name, String description, double price, int iva, String color, boolean isCablate, boolean hasLoyalityCard) {
		
		
		super(code, name, description, price, iva, hasLoyalityCard);
		
		setColor(color);
		setIsCablate(isCablate);
		
	}
	
	
	
	//Color functions
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	//IsWireless functions
	public boolean getIsCablate() {
		return isCablate;
	}
	public void setIsCablate(boolean isWireless) {
		this.isCablate = isWireless;
	}
	
	
	
	//Price functions
		public double getDiscount() {
				
			if(super.hasLoyalityCard && getIsCablate()) {
				super.setPrice(price - (price / 100) * 7);
				return super.getPrice();
			} else {
				return super.getDiscount();
			}
		}
	
	
	
	//TO String
	
	@Override
	public String toString() {
		
		return super.toString() + "|Caratteristiche: " + "Colore: " + getColor() + " |Cablate: " + getIsCablate();
		
	}
}

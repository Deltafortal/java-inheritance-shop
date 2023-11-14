package org.lessons.java.shop;

public class Prodotto {

	
	//Defining variables
	
	private int code;
	private String name;
	private String description;
	private double price;
	private int iva;
	boolean hasLoyalityCard = false;
	
	
	//Constructor
	public Prodotto(int code, String name, String description, double price, int iva, boolean hasLoyalityCard) {
		
		setCode(code);
		setName(name);
		setDescription(description);
		setPrice(price);
		setIva(iva);
		setLoyalityCard(hasLoyalityCard);
		
	}
	
	
	
	//Code functions
	public int getCode() {
		return code;
	}
	
	
	private void setCode(int code) {
		this.code = code;
	}
	
	
	
	
	//Name functions
	public String getName() {
		return name;	
	}
	
	
	public String getFullName() {
		return code + "-" + name;
	}
	
	
	public void setName(String name)  {
		this.name = name;
	}
	
	
	
	
	//Description functions
	public String getDescription() {
		return description;
	}
	
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	// Price functions
	public double getPrice() {
		return price;
	}
	
	
	public double getFullPrice() {
		return price = price + (price / 100) * iva;
	}
	
	
	public double getDiscount() {
		
		if(hasLoyalityCard) {
			return price = price - (price / 100) * 2;
		} else {
			return price;
		}
	}
	
	
	public void setPrice(double price) {
		this.price = price;
	}
	

	
	
	
	
	
	//IVA functions
	public double getIva() {
		return iva;
	}
	public void setIva(int iva) {
		this.iva = iva;
	}
	
	
	
	//Loyalty Card functions
	public boolean getLoyalityCard() {
		return hasLoyalityCard;
	}
	public void setLoyalityCard(boolean hasLoyalityCard) {
		this.hasLoyalityCard = hasLoyalityCard;
	}
	
	
	
	
	
	
	
	
	// To String
	
	@Override
	public String toString() {
		return String.format("Nome: %s |Prezzo: %.2f |Prezzo Scontato: %.2f",
                getName(), getPrice(), getDiscount());
	}
	
	
}
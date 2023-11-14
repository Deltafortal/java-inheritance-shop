package org.lessons.java.shop;

import java.util.Random;
import java.util.Scanner;

public class Carrello {

	
	public static void main(String[] args) {
		
		
		Random rnd = new Random();
		
		
		
		
		
		//Declaring variables
		Scanner in = new Scanner(System.in);
		Prodotto[] cart = new Prodotto[20];
		String insertedProduct;
		String product;
		String card;
		boolean hasLoyaltyCard = false;
		int x = 0;
		
		
		
		
		System.out.println("Hai una tessera di Fedeltà? (si, no)");
		card = in.nextLine();
		
		
		//Check for loyalty card
		if(card.equals("si")) {
			hasLoyaltyCard = true;
		}
		
		
		
		//Main Logic
		
		while (true) {
			
			
			// Ask for Product
			System.out.println("Quale prodotto vuoi aggiungere al carrello? (premi 0 per interrompere) ");
			insertedProduct = in.nextLine();
			
			
			//Break if 0
			if(insertedProduct.equals("0")) {
				System.out.println("Hai terminato i tuoi acquisti");
				System.out.println("Ecco il tuo carrello: ");
				break;
			}
			
			
			
			//Format the answer
			product = insertedProduct.toLowerCase().replaceAll("\\s", "");
			
			
			
			//Check for the products
			if(product.equals("smartphone")) {
				
				Smartphone smartphone = new Smartphone(rnd.nextInt(10001), "Smartphone", "Un bel prodotto", rnd.nextDouble(101), rnd.nextInt(70), 53789, 20, hasLoyaltyCard);
				cart[x] = smartphone;
				
				
			} else if (product.equals("televisione")) {
			
				Television tv = new Television(rnd.nextInt(10001), "Televisione", "Un bel prodotto", rnd.nextDouble(101), rnd.nextInt(70), 50, true, hasLoyaltyCard);
				cart[x] = tv;
				
				
			} else if (product.equals("cuffie")) {
			
				Headphones headphones = new Headphones(rnd.nextInt(10001), "Cuffie", "Un bel prodotto", rnd.nextDouble(101), rnd.nextInt(70), "Green", true, hasLoyaltyCard);
				cart[x] = headphones;
				
			} else {
				
				System.out.println("Mi dispiace il prodotto non è nell'elenco ");
				x--;
			}
			
			
			x++;
			
			
		}
		
		
		in.close();
		
		
		//Print Cart
		for(int i = 0; i < cart.length; i++) {
			
			if(cart[i] == null) {
				return;
			}
			
			System.out.println("---------------------------------------------------------------------------------------------");
			System.out.println(cart[i]);
			
		}
		
		
		
		
		
		
	}
	
}

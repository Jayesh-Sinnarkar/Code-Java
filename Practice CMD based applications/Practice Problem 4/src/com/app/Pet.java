package com.app;

import java.util.HashMap;
import java.util.Scanner;

public class Pet {
	//Data Members
	private static int idCounter = 100;
	private int petId;
	private String name;
	private Category category;
	private double unitPrice;
	private int stocks;
	public static HashMap<Integer,Pet> petMap = new HashMap<>();
	
	
	//constructors
	public Pet(String name, Category category, double unitPrice, int stocks) {
		
		this.petId = ++idCounter;;
		this.name = name;
		this.category = category;
		this.unitPrice = unitPrice;
		this.stocks = stocks;
		petMap.put(petId, this);
	}
	
	
	//Methods
	
	//TO ADD NEW PET
	public static void addNewPet(Scanner sc)
	{
		System.out.print("\nEnter pet Name: ");
		String name = sc.nextLine();
		
		System.out.print("\nEnter pet Category (CAT, DOG, RABBIT, FISH): ");
		Category category = Category.valueOf(sc.nextLine().toUpperCase());
		
		System.out.print("\nEnter unit price: ");
		double unitPrice = sc.nextDouble();
		
		System.out.print("\nEnter Stock: ");
		int stocks = sc.nextInt();
		
		 new Pet( name, category, unitPrice, stocks);
	}


	//TO UPDATE PET DETAILS
	public static void updatePetDetails(Scanner sc)
	{
		System.out.println("Enter Pet Id: ");
		int petId = sc.nextInt(); sc.nextLine();
		 
		
		System.out.print("\nEnter pet Name: ");
		petMap.get(petId).setName(sc.nextLine());    
		
		System.out.print("\nEnter pet Category (CAT, DOG, RABBIT, FISH): ");
		petMap.get(petId).setCategory(Category.valueOf(sc.nextLine().toUpperCase()));
		
		System.out.print("\nEnter unit price: ");
		petMap.get(petId).setUnitPrice(sc.nextDouble());
		
		System.out.print("\nEnter Stock: ");
		petMap.get(petId).setStocks(sc.nextInt());
	}

	//OVERRRIDEN METHODS
	@Override
	public String toString() {
		return "Pet [petId=" + petId + ", name=" + name + ", category=" + category + ", unitPrice=" + unitPrice
				+ ", stocks=" + stocks + "]\n";
	}
	
	//Setters and getters
	
	public static int getIdCounter() {
		return idCounter;
	}

	public static void setIdCounter(int idCounter) {
		Pet.idCounter = idCounter;
	}

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getStocks() {
		return stocks;
	}

	public void setStocks(int stocks) {
		this.stocks = stocks;
	}

	public static HashMap<Integer, Pet> getPetMap() {
		return petMap;
	}

	public static void setPetMap(HashMap<Integer, Pet> petMap) {
		Pet.petMap = petMap;
	}
	
	
	

}

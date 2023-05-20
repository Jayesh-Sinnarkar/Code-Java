package com.app;

import java.util.HashMap;
import java.util.Scanner;

import com.users.User;

public class Order {
	
	private static int counter = 100;
	private int orderId;
	private int petId;
	private int quantity;
	private Status status;
	private User orderedBy;
	public static HashMap<Integer,Order> orders = new HashMap<>();
	
	
	//CONSTRUCTORS
	public Order(int petId, int quantity) {
		
		this.orderId = ++counter;
		this.petId = petId;
		this.quantity = quantity;
		this.status = Status.PLACED;
		this.orderedBy = User.activeSession;
	}
	
	//METHODS
	public static void placeOrder(Scanner sc)
	{
		System.out.println("Enter PetId: ");
		int petId = sc.nextInt();
		
		System.out.println("Enter pet quantity: ");
		int quantity = sc.nextInt();

		Order order = new Order(petId,quantity);
		orders.put(petId, order);
		
		Pet petOrder = Pet.petMap.get(petId);
		
		System.out.print("Your "+order+" for \n"+petOrder+" is successfully placed...");
	}
	
	public static void checkOrderStatus(Scanner sc)
	{
		System.out.println("Enter order id: ");
		int orderId = sc.nextInt();
		
		System.out.println("\nYour order details are: "+orders.get(orderId));
		
	}
	
	public static void updateOrderStatus(Scanner sc)
	{
		System.out.println("Enter Order Id: ");
		int orderId = sc.nextInt(); sc.nextLine();
		
		orders.get(orderId).setStatus(Status.valueOf(sc.nextLine().toUpperCase()));
	}
	//OVERRIDEN METHODS
	
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", petId=" + petId + ", quantity=" + quantity + ", status=" + status
				+ ", orderedBy=" + orderedBy + "]";
	}
	
	//Setters and Getters

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	
	

}

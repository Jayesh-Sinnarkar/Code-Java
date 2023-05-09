package com.shop.core;

import java.time.LocalDate;

public class Product {

	private int productId;
	private String name;
	private String description;
	private int quantity;
	private double price;
	private Category category;
	private LocalDate manufacturingDate;

	// CONSTRUCTOR
	public Product(int productId, String name, String description, int quantity, double price, Category productCategory,LocalDate manufacturingDate) {
		this.productId = productId;
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
		this.category = productCategory;
		this.manufacturingDate = manufacturingDate;
	}

	// OVERRIDING - toString
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", desc=" + description + ", quantity=" + quantity
				+ ", price=" + price + ", productCategory=" + category + ", manufactureDate=" + manufacturingDate
				+ "]";
	}

	// GETTER-SETTER
	public int getProductId() {
		return productId;
	}

	public String getName() {
		return name;
	}

	public String getDesc() {
		return description;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

	public Category getProductCategory() {
		return category;
	}

	public LocalDate getManufactureDate() {
		return manufacturingDate;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}

package com.model;

public class Product {

	private int productId;
	private String productName;
	private double quantity;
	private double quantityAdded;
	private double mrp;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getQuantityAdded() {
		return quantityAdded;
	}
	public void setQuantityAdded(double quantityAdded) {
		this.quantityAdded = quantityAdded;
	}
	public double getMrp() {
		return mrp;
	}
	public void setMrp(double mrp) {
		this.mrp = mrp;
	}
}

package com.app.pojos;

import javax.persistence.*;

@MappedSuperclass
public class Product {

	private String name;
	private String manufacturer;
	private String brand;
	private float price;
	private boolean isAvailable;

	public Product() {
		
	}
	
	public Product(String name,String manufacturer, String brand, float price, boolean isAvailable) {
		super();
		this.name=name;
		this.manufacturer = manufacturer;
		this.brand = brand;
		this.price = price;
		this.isAvailable = isAvailable;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "Product [ name="  +name+    "manufacturer=" + manufacturer + ", brand=" + brand + ", price=" + price
				+ ", isAvailable=" + isAvailable + "]";
	}
	
	
	
	
}

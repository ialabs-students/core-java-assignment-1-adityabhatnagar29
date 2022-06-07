package com.assignment;
import java.util.*;

 class Product {
	 private int productcode;
	 private String name;
	 private double price;
	 private String category;
	 
 public Product(int productcode, String name, double price, String category) {
		super();
		this.productcode = productcode;
		this.name = name;
		this.price = price;
		this.category = category;
	}

public int getProductcode() {
	return productcode;
}

public void setProductcode(int productcode) {
	this.productcode = productcode;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

@Override
public String toString() {
	return "ProductService [productcode=" + productcode + ", name=" + name + ", price=" + price + ", category="
			+ category + "]";
}
 }
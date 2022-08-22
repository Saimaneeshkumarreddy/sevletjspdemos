package com;

import java.util.ArrayList;

public class ProductClass{
	private int productid;
	private String name;
	private String color;
	private float price;
	
	public ProductClass(int productid, String name, String color, float price){
		this.productid=productid;
		this.name=name;
		this.color=color;
		this.price=price;
	}
	
	public void setId(int id) {
		this.productid = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getId() {
		return productid;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public float getPrice() {
		return price;
	}
	
	public ArrayList<ProductClass> getProductDetails()
	{
		ArrayList<ProductClass> productList = new ArrayList<ProductClass>();
		 
		productList.add(new ProductClass(productid, name, color, price));  
		 
		 for (ProductClass s : productList) 
			{
				System.out.print("ID, Name, Color, and Price of the product are : ");
				System.out.println(s.productid + " " + s.name + " " + s.color + " " + s.price);
			}
		return productList;
	}
}
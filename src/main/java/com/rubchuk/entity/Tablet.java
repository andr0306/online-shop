package com.rubchuk.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "tablet")
public class Tablet extends BaseEntity{
	
	private String name;
	private String description;
	private int price;
	private String brand;
	public Tablet() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}

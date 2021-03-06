package com.diplom.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "tablet")
public class Tablet extends BaseEntity{
	
	private String name;
	private String description;
	private int price;
	private String brand;
	
	private String img;
	
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
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	
}

package com.diplom.entity;

import javax.persistence.Entity;

@Entity(name = "Repair")
public class Repair extends BaseEntity{
	
	private String device;
	
	private String model;
	
	private String problem;
	
	private int phoneNumber;
	
	private String firstName;

	public Repair() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	

}

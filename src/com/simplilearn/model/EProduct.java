package com.simplilearn.model;

import java.util.Date;

public class EProduct {

	private int pId;
	private String name;
	private Double price;
	private Date creationDate;
	private Date expireDate;
	
	
	public EProduct() {};
	
	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public EProduct(String name, Double price, Date creationDate, Date expireDate) {
		this.name = name;
		this.price = price;
		this.creationDate = creationDate;
		this.expireDate = expireDate;
	}
	
	
	
	
	
}

package com.kh.chap01_beforeVSafter.after.model.vo;

public class Product {

	// 세 클래스 모두 공통적으로 가지고 있는 요소들(필드, 메소드)만 기술

	// 필드부
	private String brand;
	private String pCode;
	private String pName;
	private int price;

	// 생성자부
	public Product() {}
	
	public Product(String brand, String pCode, String pName, int price) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}

	// 메소드부
	// getter setter
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// information
	public String information() {
	      return "brand : " + brand + ", pCode : " + pCode + ", pName : " + pName + ", price : " + price; 
	}
	
}

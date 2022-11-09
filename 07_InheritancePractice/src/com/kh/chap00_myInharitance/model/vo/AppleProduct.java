package com.kh.chap00_myInharitance.model.vo;

public class AppleProduct {
	// 필드부
	private String pName; // 이름
	private String series; // 시리즈
	private int price; // 가격
	private double display; // 화면 크기
	private double weight; // 제품 무게
	
	// 생성자부
	public AppleProduct() {}

	public AppleProduct(String pName, String series, int price, double display, double weight) {
		this.pName = pName;
		this.series = series;
		this.price = price;
		this.display = display;
		this.weight = weight;
	}


	//메소드부
	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public double getDisplay() {
		return display;
	}

	public void setDisplay(double display) {
		this.display = display;
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String information() {
		return "제품명: " + pName + series + ", 가격: " + price + ", 화면크기: " + display + "cm"
				+ ", 무게: " + weight + "g";
	}

	
}

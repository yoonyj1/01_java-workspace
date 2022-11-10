package com.kh.chap02_inherit.model.vo;

public class Vehicle { // 클래스 시작

	// 필드부
	private String name;
	private double mileage;
	private String kind;

	public Vehicle() {}

	// 생성자부
	public Vehicle(String name, double mileage, String kind) {
		this.name = name;
		this.mileage = mileage;
		this.kind = kind;
	}

	// 메소드부
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String information() {
		return "name: " + name + ", mileage: " + mileage + ", kind: " + kind;
	}
	
	public void howToMove() {
		System.out.println("움직인다");
	}
} // 클래스 끝

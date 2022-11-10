package com.kh.chap02_inherit.model.vo;

public class Ship extends Vehicle { // 클래스 시작

	// 필드부
	private int propeller;

	// 생성자부
	public Ship() {}

	public Ship(String name, double mileage, String kind, int propeller) {
		super(name, mileage, kind);
		this.propeller = propeller;
	}

	// 메소드부
	public int getPropeller() {
		return propeller;
	}

	public void setPropeller(int propeller) {
		this.propeller = propeller;
	}

	@Override
	public String information() {
		return super.information() + ", propeller: " + propeller;
	}
	
	@Override
	public void howToMove() {
		System.out.println("프로펠러를 돌려서 움직인다.");
	}
	
} // 클래스 끝

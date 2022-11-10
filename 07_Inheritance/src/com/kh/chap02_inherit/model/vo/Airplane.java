package com.kh.chap02_inherit.model.vo;

public class Airplane extends Vehicle { // 클래스 시작

	// 필드부
	private int tire;
	private int wing;

	// 생성자부
	public Airplane() {}

	public Airplane(String name, double mileage, String kind, int tire, int wing) {
		super(name, mileage, kind);
		this.tire = tire;
		this.wing = wing;
	}

	// 메소드부
	public int getTire() {
		return tire;
	}

	public void setTire(int tire) {
		this.tire = tire;
	}

	public int getWing() {
		return wing;
	}

	public void setWing(int wing) {
		this.wing = wing;
	}

	@Override
	public String information() {
		return super.information() + ", tire: " + tire + ", wing: " + wing;
	}
	
	@Override
	public void howToMove() {
		System.out.println("바퀴를 굴리다가 날개를 휘저으며 움직인다.");
	}
} // 클래스 끝

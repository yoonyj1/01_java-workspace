package com.kh.chap02_abstractAndInterface.practice.model.vo;

public class Mother extends Person {

	// 필드부
	private String babyBirth;
	
	// 생성자부
	public Mother() {}
	
	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}

	// 메소드부
	public String getBabyBirth() {
		return babyBirth;
	}

	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}
	
	@Override
	public void eat() {
		super.setWeight(super.getWeight() + 10);
		super.setHealth(super.getHealth() - 10);
	}
	
	@Override
	public void sleep() {
		super.setHealth(super.getHealth() + 20);
	}
}

package com.kh.chap02_abstractAndInterface.practice.model.vo;

public class Baby extends Person {

	// 필드부
	
	// 생성자부
	public Baby() {}
	
	public Baby(String name, double weight, int health) {
		super(name, weight, health);
	}

	// 메소드부
	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	public void eat() {
		super.setWeight(super.getWeight() + 3);
		super.setHealth(super.getHealth() + 1);
	}
	
	@Override
	public void sleep() {
		super.setHealth(super.getHealth() + 3);
	}
	
}

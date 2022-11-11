package com.kh.chap02_abstractAndInterface.part02_basic.model.vo;

public class Mother extends Person { // 클래스 시작

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
	public String toString() {
		return super.toString() + "babyBirth: " + babyBirth;
	}
	
	@Override
	public void eat() {
		// 밥을 먹으면 몸무게 10 증가
		super.setWeight(super.getWeight() + 10);
		// 밥먹으면 건강점수 10 감소
		super.setHealth(super.getHealth() - 10);
	}

	@Override
	public void sleep() {
		
	}
	
} // 클래스 끝

package com.kh.chap02_abstractAndInterface.part02_basic.model.vo;

public class Baby extends Person { // 클래스 시작

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
		// 밥먹으면 몸무게 3 증가
		super.setWeight(super.getWeight() + 3);
		// 밥먹으면 건강도 1 증가
		super.setHealth(super.getHealth() + 1);
	}

	@Override
	public void sleep() {
		// 잠자면 건강도 3 증가
		super.setHealth(super.getHealth() + 3);
	}
	
} // 클래스 끝

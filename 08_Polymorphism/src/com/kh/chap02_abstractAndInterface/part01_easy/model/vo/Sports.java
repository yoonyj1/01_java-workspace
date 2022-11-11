package com.kh.chap02_abstractAndInterface.part01_easy.model.vo;

public abstract class Sports { // 클래스 시작

	// 필드부
	private int people;
	
	// 생성자부
	public Sports() {}
	
	public Sports(int people) { 
		this.people = people;
	}

	// 메소드부
	public int getPeople() { // 머리부
		return people; // 몸통부 / 없으면 완벽한 메소드가 아님
	}

	public void setPeople(int people) {
		this.people = people;
	}

	@Override
	public String toString() {
		return "people: " + people;
	}
	
	// 추상메소드(미완성된 메소드) 만들기
	// public void rule(); // 머리부만 있음 -> 몸통부가 없어서 에러 발생
	public abstract void rule();
	// 미완성된 메소드가 있다는 것은 클래스도 미완성이라는 얘기
	// 완성하는 시기?: 해당 추상클래스를 상속받는 자식에서 완성 
	
} // 클래스 끝

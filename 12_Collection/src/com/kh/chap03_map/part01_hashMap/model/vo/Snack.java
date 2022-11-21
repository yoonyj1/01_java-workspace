package com.kh.chap03_map.part01_hashMap.model.vo;

public class Snack { // 클래스 시작

	// 필드부
	private String flavor; // 맛
	private int calory;
	
	// 생성자부	
	public Snack() {}

	public Snack(String flavor, int calory) {
		this.flavor = flavor;
		this.calory = calory;
	}

	// 메소드부
	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getCalory() {
		return calory;
	}

	public void setCalory(int calory) {
		this.calory = calory;
	}

	@Override
	public String toString() {
		return "Snack [flavor=" + flavor + ", calory=" + calory + "]";
	}
	
} // 클래스 끝

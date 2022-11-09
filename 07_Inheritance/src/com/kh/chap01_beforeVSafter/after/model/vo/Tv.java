package com.kh.chap01_beforeVSafter.after.model.vo;

public class Tv extends Product { // 클래스 시작

	// 필드부
	private int inch;
	
	// 생성자부
	public Tv() {}
	
	public Tv(String brand, String pCode, String pName, int price, int inch) {
		super(brand, pCode, pName, price);
		this.inch = inch;
	}

	// 메소드부
	public int getInch() {
		return inch;
	}
	
	public void setInch(int inch) {
		this.inch = inch;
	}
	
	public String information() {
		return super.information() + ", inch : " + inch;
	}
	
	
} // 클래스 끝

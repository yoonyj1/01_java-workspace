package com.kh.chap02_abstractAndInterface.pratice2.model.vo;

public class Marvel extends SpiderMan {

	// 필드부
	
	
	// 생성자부
	public Marvel() {}
	
	public Marvel(String mainCharacter, String company, String villain, String series, int productionYear) {
		super(mainCharacter, company, villain, series, productionYear);
	}

	// 메소드부
	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	public String villain() {
		return super.getSeries() + "의" + super.villain() + super.getVillain() + "입니다.";  
	}
	
	@Override
	public String productionYear() {
		return super.getSeries() + "의" + super.productionYear() + super.getProductionYear() + "년 입니다.";
	}
	
	
}

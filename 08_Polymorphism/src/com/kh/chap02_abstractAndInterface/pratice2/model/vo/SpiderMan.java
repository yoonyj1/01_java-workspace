package com.kh.chap02_abstractAndInterface.pratice2.model.vo;

public abstract class SpiderMan implements Basic {

	// 필드부
	private String mainCharacter; // 주인공
	private String company; // 제작사
	private String villain; // 빌런
	private String series; // 시리즈
	private int productionYear; // 제작연도
	
	
	// 생성자부
	public SpiderMan() {}
	
	public SpiderMan(String mainCharacter, String company, String villain, String series, int productionYear) {
		this.mainCharacter = mainCharacter;
		this.company = company;
		this.villain = villain;
		this.series = series;
		this.productionYear = productionYear;
	}

	// 메소드부
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}
	
	public String getVillain() {
		return villain;
	}
	
	public void setVillain(String villain) {
		this.villain = villain;
	}

	public int getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}

	
	
	@Override
	public String toString() {
		return "mainCharacter=" + mainCharacter + ", company=" + company + ", villain=" + villain
				+ ", series=" + series + ", productionYear=" + productionYear;
	}
	
	@Override
	public String productionYear() {
		return " 개봉일은 ";
	}

	@Override
	public String villain() {
		return " 빌런은 ";
	}
	
	
	
}

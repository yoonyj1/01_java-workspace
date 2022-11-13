package com.kh.chap02_abstractAndInterface.pratice2.model.vo;

public abstract class SpiderMan implements Basic {

	// 필드부
	private String mainCharacter; // 주인공
	private String company; // 제작사
	private int series; // 시리즈
	private int productionYear; // 제작연도
	
	
	// 생성자부
	public SpiderMan() {}
	
	public SpiderMan(String company, int series, int productionYear) {
		this.company = company;
		this.series = series;
		this.productionYear = productionYear;
	}

	public String getCompany() {
		return company;
	}

	// 메소드부
	public void setCompany(String company) {
		this.company = company;
	}

	public int getSeries() {
		return series;
	}

	public void setSeries(int series) {
		this.series = series;
	}

	public int getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}

	@Override
	public String toString() {
		return "company=" + company + ", series=" + series + ", productionYear=" + productionYear;
	}
	
	@Override
	public String villain() {
		return "이 영화의 빌런은 ";
	}
	
	
	
}

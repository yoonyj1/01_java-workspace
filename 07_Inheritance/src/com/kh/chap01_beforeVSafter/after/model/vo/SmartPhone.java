package com.kh.chap01_beforeVSafter.after.model.vo;

public class SmartPhone extends Product { // 클래스 시작
	// 필드부
	private String mobileAgency;
	
	// 생성자부
	public SmartPhone() {}
	
	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		super(brand, pCode, pName, price);
		this.mobileAgency = mobileAgency;
	}

	// 메소드부
	public String getMobileAgency() {
		return mobileAgency;
	}
	
	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
	public String information() {
		return super.information() + ", mobileAgency : " + mobileAgency;
	}
	
} // 클래스 끝

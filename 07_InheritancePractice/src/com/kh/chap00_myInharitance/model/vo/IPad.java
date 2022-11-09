package com.kh.chap00_myInharitance.model.vo;

public class IPad extends AppleProduct {

	private boolean cellular; // cellular 기능 유무
	private String subPart; // 부속품종류
	
	public IPad() {}
	
	public IPad(String pName, String series, int price, double display, double weight, boolean cellular, String subPart) {
		super(pName, series, price, display, weight);
		this.cellular = cellular;
		this.subPart = subPart;
	}
	
	public boolean isCellular() {
		return cellular;
	}

	public void setCellular(boolean cellular) {
		this.cellular = cellular;
	}
	
	public String getSubPart() {
		return subPart;
	}

	public void setSubPart(String subPart) {
		this.subPart = subPart;
	}

	public String information() {
		return super.information() + ", " + "cellular 기능: " + cellular + ", " + "부속품: " + subPart;
	}
}

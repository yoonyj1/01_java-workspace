package com.kh.chap00_myInharitance.model.vo;

public class AppleWacth extends AppleProduct {
	
	private boolean cellular; // cellular 기능 유무
	
	public AppleWacth() {}
	
	public AppleWacth(String pName, String series, int price, double display, double weight, boolean cellular) {
		super(pName, series, price, display, weight);
		this.cellular = cellular;
	}

	public boolean isCellular() {
		return cellular;
	}

	public void setCellular(boolean cellular) {
		this.cellular = cellular;
	}
	
	public String information() {
		return super.information() + ", cellular 기능: " + cellular;
	}
}

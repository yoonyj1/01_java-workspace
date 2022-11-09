package com.kh.chap00_myInharitance.model.vo;

public class IPhone extends AppleProduct {
	
	public IPhone() {}
	
	public IPhone(String pName, String series, int price, double display, double weight) {
		super(pName, series, price, display, weight);
	}
	
}

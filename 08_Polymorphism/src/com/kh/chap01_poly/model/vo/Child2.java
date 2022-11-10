package com.kh.chap01_poly.model.vo;

public class Child2 extends Parent { // 클래스 시작
	// 필드부
	private int n;
	
	// 생성자부
	public Child2() {}
	
	public Child2(int x, int y, int n) {
		super(x, y);
		this.n = n;
	}

	// 메소드부
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
} // 클래스 끝

package com.kh.chap01_poly.model.vo;

public class Parent { // 클래스 시작
	// 필드부
	private int x;
	private int y;
	
	// 생성자부
	public Parent() {}

	public Parent(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 메소드부
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void printParent() {
		System.out.println("나 부모야");
	}
	
	public void print() {
		System.out.println("나 부모야");
	}
} // 클래스 끝

package com.kh.oop.sample;

public class Point {

	private int posX;
	private int posY;
	
	public int getPosX() {
		return posX;
	}
	
	public void setPosX(int posX) {
		this.posX = posX;
	}
	
	public int getPosY() {
		return posY;
	}
	
	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	public Point() {
		
	}
	
	public Point(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}
}

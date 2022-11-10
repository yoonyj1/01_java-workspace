package com.kh.chap01_poly.part02_electronic.model.vo;

public class NoteBook extends Electronic { // 클래스 시작

	// 필드부
	private int usbPort;
	
	// 생성자부
	public NoteBook() {}
	
	public NoteBook(String brand, String name, int price, int usbPort) {
		super(brand, name, price);
		this.usbPort = usbPort;
	}

	// 메소드부
	public int getUsbPort() {
		return usbPort;
	}

	public void setUsbPort(int usbPort) {
		this.usbPort = usbPort;
	}

	@Override
	public String toString() {
		return super.toString() + ", usbPort: " + usbPort;
	}
	
} // 클래스 끝

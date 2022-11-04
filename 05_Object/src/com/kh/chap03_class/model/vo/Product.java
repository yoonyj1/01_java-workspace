package com.kh.chap03_class.model.vo;

public class Product {
	// 클래스 선언 구문에 작성가능한 접근제한자(public, default)
	// default라고 쓰는 것이 아니고 접근제한자를 지우면 됨
	// default로 하면 같은 패키지 내에서만 사용가능 / 다른 패키지에서는 해당 파일 사용불가 => 못 찾음
	
	/*
	 * 필드(field)
	 * 
	 * 필드 == 멤버변수 == 인스턴스변수
	 * 
	 * [표현법] []: 생략가능
	 * 접근제한자 [예약어] 자료형 변수명;
	 */

	// 필드부 선언
	private String pName;
	private int price;
	private String brand;
	
	/*
	 * 생성자
	 *  - 객체를 생성하기 위한 일종의 메소드
	 *  
	 *  [표현법]
	 *  접근제한자 클래스명([매개변수1, 매개변수2,...]) {
	 *  
	 *  
	 *  }
	 */

	/*
	 * 메소드부
	 *  - 기능을 처리하는 담당
	 *  
	 *  [표현법]
	 *  접근제한자 반환형 메소드명([매개변수]) {
	 *  	// 기능 구현하는 소스
	 *  }
	 */
	
	// getter setter
	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	// 내가 생각할 때 유용할 것 같은 메소드도 자유롭게 생성가능
	
	// 모든 필드값을 다 합친 문자열을 반환해주는 메소드
	public String information() {
		return "pName: " + pName + ", price: " + price + ", brand: " + brand;
		// 전부 다 엮어서 String으로 만들자
	}
}
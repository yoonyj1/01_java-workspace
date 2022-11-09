package com.kh.chap01_beforeVSafter.after.model.vo;
//			 자식		----->	 부모
//			 후손		----->	 조상
//			 하위		----->	 상위
//			 this	----->	 super
public class Desktop extends Product { // 클래스 시작
	// 필드부
	private boolean allInOne;
	
	// 생성자부
	public Desktop() {}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		// brand~price 네 개의 값은 부모클래스(Product)의 필드에 선언
		// super.으로 부모에 접근
		
		// 해결방법 1. 부모클래스에 있는 필드를 protected 접근제한자로 수정
		// super.brand = brand;
		// super.pCode = pCode;
		// super.pName = pName;
		// super.price = price;
		
		// 해결방법 2. 부모클래스의 setter 메소드 사용
		// super.setBrand(brand); // this.brand = brand;
		// super.setpCode(pCode); // this.pCode = pCode;
		// super.setpName(pName); // this.pName = pName;
		// super.setPrice(price); // this.price = price;
		
		this.allInOne = allInOne;
	}
	
} // 클래스 끝

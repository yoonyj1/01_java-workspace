package com.kh.run;

import com.kh.model.vo.Product;

public class ClassRun {

	public static void main(String[] args) {

		Product p = new Product();
		
		p.setpName("신발");
		p.setPrice(100_000);
		p.setBrand("Adidas");
		
		System.out.println("상품이름: " + p.getpName());
		System.out.println("상품가격: " + p.getPrice());
		System.out.println("브랜드: " + p.getBrand());
	}

}

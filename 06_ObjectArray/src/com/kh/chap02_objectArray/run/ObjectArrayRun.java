package com.kh.chap02_objectArray.run;

import com.kh.chap02_objectArray.model.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;

		Phone[] phones = new Phone[3];
		// System.out.println(arr);
		// System.out.println(phones);

		// System.out.println(phones[0]);
		// phones[0].setName("아이폰"); // NullPointerException

		phones[0] = new Phone();
		phones[0].setName("벨벳폰");
		phones[0].setBrand("엘지");
		phones[0].setPrice(1000000);
		phones[0].setSeries("1");

		phones[1] = new Phone("아이폰", "애플", 1300000, "11PRO");
		phones[2] = new Phone("갤럭시", "삼성", 1200000, "s20");

		// 총 가격과 평균가격을 구하기
		int total = 0;
		for (int i = 0; i < phones.length; i++) { // for 시작
			System.out.println(phones[i].information());
			total += phones[i].getPrice();
		} // for 끝
		System.out.println("총가격: " + total + "원");
		System.out.println("평균가: " + (total / phones.length) + "원");
	}

}

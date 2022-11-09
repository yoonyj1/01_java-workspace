package com.kh.chap02_objectArray.run;

import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ObjectArrayRun { //클래스 시작

	public static void main(String[] args) { // main 시작
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;

		// for loop문 => 단순한 for문
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		Phone[] phones = new Phone[3];
		// System.out.println(arr);
		// System.out.println(phones);

		// System.out.println(phones[0]);
		// phones[0].setName("아이폰"); // NullPointerException

		// 기본생성자로 생성 후 값 초기화
		phones[0] = new Phone();
		phones[0].setName("벨벳폰");
		phones[0].setBrand("엘지");
		phones[0].setPrice(1000000);
		phones[0].setSeries("1");

		// 매개변수 생성자로 생성
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
		
		// 사용자에게 구매하고자 하는 핸드폰명 입력을 받아 해당 휴대폰 찾은 후 가격 알려주기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매할 핸드폰: ");
		String buy = sc.nextLine();
		
		for (int i = 0; i < phones.length; i++) {
			if (buy.equals(phones[i].getName())) {
				System.out.println("당신이 구매하려는 휴대폰의 가격은 " + phones[i].getPrice() + "원 입니다.");
			}
		}
		sc.close();
	} // main 끝

} // 클래스 끝

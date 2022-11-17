package com.kh.chap02_objectArray.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ArrayListRun {

	public static void main(String[] args) {

		ArrayList<Phone> list = new ArrayList<Phone>(); // 뒤에 <Phone>은 생략가능
		
		list.add(new Phone());
		list.add(new Phone("아이폰", "애플", 1300000, "11PRO"));
		list.add(new Phone("갤럭시", "삼성", 1200000, "S20"));
		
		list.get(0).setName("벨벳폰");
		list.get(0).setBrand("LG");
		list.get(0).setPrice(1000000);
		list.get(0).setSeries("1");
		
		// 총 가격과 평균가격 구하기
		int total = 0;
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).information());
			total += list.get(i).getPrice();
		}
		
		System.out.println("총가격: " + total + "원");
		System.out.println("평균가: " + total / list.size() + "원");
		
		
		// 사용자에게 구매하고자 하는 핸드폰명 입력을 받아 해당 휴대폰 찾은 후 가격 알려주기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매할 핸드폰: ");
		String buy = sc.nextLine();
		
		for (int i = 0; i < list.size(); i++) {
			if (buy.equals(list.get(i).getName())) {
				System.out.println("당신이 구매하려는 휴대폰의 가격은 " + list.get(i).getPrice() + "원 입니다.");
			}
			
		}
		sc.close();
	
		
		
	}

}

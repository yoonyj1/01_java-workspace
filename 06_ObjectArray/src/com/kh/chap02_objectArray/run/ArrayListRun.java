package com.kh.chap02_objectArray.run;

import java.util.ArrayList;

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
		
	}

}

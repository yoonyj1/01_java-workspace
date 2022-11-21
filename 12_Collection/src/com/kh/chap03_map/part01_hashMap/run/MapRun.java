package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class MapRun { // 클래스 시작

	public static void main(String[] args) { // main 시작
		
		HashMap hm = new HashMap();
		
		// 계층구조를 보면 List 계열, Set 계열의 클래스들은 Collection을 구현한 클래스임
		// => 객체를 추가하고자 할 때 add메소드 이용
		
		// Map 계열은 Collection을 구현한 클래스가 아님
		// 추가하고자 할 때 put 메소드 이용(이때 키 + 벨류 세트로 담아야함)
		
		// 1. put(K key, V value): 컬렉션에 키 벨류 세트로 추가시켜주는 메소드
		hm.put("다이제", new Snack("초코맛", 1500));
		hm.put("칸초", new Snack("단맛", 600));
		hm.put("새우깡", new Snack("짠맛", 500));
		
		hm.put("포테이토칩", new Snack("짠맛", 500));
		
		System.out.println(hm);
		// {다이제=Snack [flavor=초코맛, calory=1500], 새우깡=Snack [flavor=짠맛, calory=500], 칸초=Snack [flavor=단맛, calory=600]} 출력
		// {키 = 벨류, 키 = 벨류...}
		// 저장되는 순서 유지 안됨 value값이 중복이 되더라도 키값이 중복이 안되면 잘 저장됨
		
		hm.put("새우깡", new Snack("매운맛", 700));
		System.out.println(hm);
		// {다이제=Snack [flavor=초코맛, calory=1500], 새우깡=Snack [flavor=매운맛, calory=700], 포테이토칩=Snack [flavor=짠맛, calory=500], 칸초=Snack [flavor=단맛, calory=600]} 출력
		// 키값이 중복되면 덮어쓰기가 됨
		// 동일한 키값으로 다시 추가하는 경우 value값이 덮어씌워짐(중복된 키값이 공존할 수 없음)
		
		
	} // main 끝
	
} // 클래스 끝

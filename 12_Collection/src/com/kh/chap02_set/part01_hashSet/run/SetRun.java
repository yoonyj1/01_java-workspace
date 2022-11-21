package com.kh.chap02_set.part01_hashSet.run;

import java.util.HashSet;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

public class SetRun { // 클래스 시작

	public static void main(String[] args) { // main 시작

		// Object hashCode() => 해당 객체의 "주소값" 가지고 10진수 형태로 만들어서 반환
		// Object equals()   => 두 객체의 "주소값"을 비교해서 일치하면 true, 일치하지 않으면 false 반환
		
		HashSet hs1 = new HashSet();
		
		// ArrayList랑 동일하게 함수사용 가능
		hs1.add("반갑습니다.");
		hs1.add(new String("반갑습니다."));
		hs1.add(new String("여러분"));
		hs1.add(new String("안녕하세요"));
		hs1.add(new String("여러분"));
		
		System.out.println(hs1); // [안녕하세요, 여러분, 반갑습니다.] 출력 -> 중복된 데이터(동일객체) 보관 불가능 & 순서대로 출력 X(저장순서 유지 안됨 -> 인덱스 개념 없음)
		
		HashSet<Student> hs2 = new HashSet<Student>();
		
		// 3명이 사는 곳 가정
		hs2.add(new Student("공유", 43, 100));
		hs2.add(new Student("차은우", 26, 85));
		hs2.add(new Student("주지훈", 24, 20));
		hs2.add(new Student("공유", 43, 100));
		
		System.out.println(hs2); 
		// [Student [name=차은우, age=26, score=85], Student [name=주지훈, age=24, score=20], Student [name=공유, age=43, score=100], Student [name=공유, age=43, score=100]]
		// 저장순서 유지X 동일, 중복제거 안됨 => 동일객체로 판단이 안되고 있음
		
		// HashSet이라는 공간에 객체가 추가될 때마다 동일객체인지 비교
		// 동일객체: 각 객체마다 hashCode() 호출결과가 일치하고, equals() 비교시 true일 경우
		
		
	} // main 끝

} // 클래스 끝

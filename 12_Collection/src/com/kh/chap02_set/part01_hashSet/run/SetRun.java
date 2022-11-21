package com.kh.chap02_set.part01_hashSet.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

public class SetRun { // 클래스 시작

	public static void main(String[] args) { // main 시작

		// Object hashCode() => 해당 객체의 "주소값" 가지고 10진수 형태로 만들어서 반환
		// Object equals()   => 두 객체의 "주소값"을 비교해서 일치하면 true, 일치하지 않으면 false 반환
		
		// String hashCode() => "실제 담긴 문자열"을 가지고 10진수 형태로 만들어서 반환
		// String equals()   => "실제 담긴 문자열"을 가지고 비교해서 일치하면 true, 일치하지 않으면 false 반환
		
		HashSet<String> hs1 = new HashSet<>();
		
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
		
		// ===>> hashCode(), equals() 오버라이드 후 다시 출력하면 중복제거
		
		System.out.println(new Student("공유", 43, 100).hashCode()); // 505004327
		System.out.println(new Student("공유", 43, 100).hashCode()); // 505004327
		
		// 재정의한 hashCode() 메소드에 의해 둘 다 결과 똑같음 => 오버라이드 된 메소드 주석처리하고 돌리면 주소값이 다르게 출력
		
		System.out.println(new Student("공유", 43, 100).equals(new Student("공유", 43, 100))); // true 반환
		// 오버라이드 된 equals 주석 걸고 돌리면 false 반환
		
		// hs2.get(); => 인덱스의 개념X, get메소드가 정의되어있지 않음 (한 객체만 뽑아올 수 없음)
		
		// hashSet에 담긴 모든 객체들에 순차적으로 접근
		System.out.println("========== hashSet에 담긴 모든 객체들에 순차적으로 접근 ==========");
		// 1. for문 사용가능(단, 향상된 for문(foreach)만 가능)
		System.out.println("---------- 1. for문 사용가능(단, 향상된 for문(foreach)만 가능) ----------");
		for (Student s : hs2) { // 제네릭이 안되있을 경우 Object형으로 해야함
			System.out.println(s);
		}
		
		/* foreach문만 쓰는 이유
		for (int i = 0; i < hs2.size(); i++) {
			System.out.println(); => 쓸 내용이 없음
		}
		*/
		
		// 2. ArrayList에 담아준 다음 ArrayList를 반복문 돌려가며 접근
		System.out.println("---------- 2. ArrayList에 담아준 다음 ArrayList를 반복문 돌려가며 접근 ----------");
		// ArrayList에 담는 첫번째 방법: ArrayList 생성 후 addAll() 메소드 이용해서 통째로 추가하기
		System.out.println("----- ArrayList에 담는 첫번째 방법: ArrayList 생성 후 addAll() 메소드 이용해서 통째로 추가하기 -----");
		ArrayList<Student> list = new ArrayList<Student>();
		list.addAll(hs2);
		
		for (Student s : list) {
			System.out.println(s);
		}
		
		// ArrayList에 담는 두번째 방법: ArrayList 생성과 동시에 통째로 추가하기
		System.out.println("----- ArrayList에 담는 두번째 방법: ArrayList 생성과 동시에 통째로 추가하기 -----");
		ArrayList<Student> list2 = new ArrayList<Student>(hs2);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list2.get(i));
		}
		
		// 사용하는 경우: 짜려고하는 프로그램이 중복된 데이터가 있으면 안되는 경우 사용 (거의 안쓰임)
		
		// 3. Iterator 반복자 이용해서 순차적으로 접근
		System.out.println("---------- 3. Iterator 반복자 이용해서 순차적으로 접근 ----------");
		Iterator<Student> it = hs2.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}
		
		// it.next(); // NoSuchElementException: 더 이상 갖고 올 요소가 없음
		
	} // main 끝

} // 클래스 끝

package com.kh.chap02_string.controller;

public class A_StringPoolTest { // 클래스 시작

	public void method1() { // method1 시작
		/*
		String s = "ㅎㅇ"; // 참조 자료형
		int a = 10; // 기본 자료형
		*/
		
		// 1. 생성자를 통한 문자열 생성
		System.out.println("====== 1. 생성자를 통한 문자열 생성 ======");
		String str1 = new String("Hello"); // 매개변수 생성자
		String str2 = new String("Hello"); // 매개변수 생성자
		
		// 주소값이 출력되지 않을까
		System.out.println(str1);
		System.out.println(str2);
		// String 클래스의 toString() 메소드가 이미 오버라이딩 돼있음(실제 담긴 문자열 반환하도록)
		
		// 동등비교
		System.out.println(str1 == str2); // false 반환
		System.out.println(str1.equals(str2)); // true 반환
		// String 클래스에 equals 메소드가 이미 오버라이딩 돼있음
		// Object 클래스를 보면 원래는 주소값을 동등비교하는 메소드임
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// String 클래스에 hashcode() 메소드가 오버라이딩 돼있음
		// 주소값이 아닌 실제 담겨있는 문자열을 가지고 해쉬코드를 만듦
		
		// ** 주소값을 꼭 알고 싶은 경우
		// System.identityHashCode(레퍼런스);
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
	} // method1 끝
	
	public void method2() { // method2 시작
		String str = new String("Hello");
		
		// 2. 문자열을 리터럴 값으로 생성하는 것
		System.out.println("====== 2. 문자열을 리터럴 값으로 생성하는 것 ======");
		
		String str1 = "Hello";
		String str2 = "Hello";
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(str1 == str2); // true 반환 -> 주소값이 똑같음
		
		System.out.println("str1 주소값: " + System.identityHashCode(str1));
		System.out.println("str2 주소값: " + System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str));
		
		String str3 = "hi";
		
		System.out.println(str1 == str3); // false 반환
		System.out.println(System.identityHashCode(str3));
		
		// String 클래스 == 불변클래스(변하지 않는 클래스)
		// 값을 못바꾸는 것은 아님 -> 변경 가능하긴 하나 그 자리에서 수정되는 개념이 아님
		
		str3 = "bye";
		System.out.println(System.identityHashCode(str3));
		
		str3 = "Hello";
		System.out.println("str3 주소값: " + System.identityHashCode(str3));
		
	} // method2 끝
} // 클래스 끝

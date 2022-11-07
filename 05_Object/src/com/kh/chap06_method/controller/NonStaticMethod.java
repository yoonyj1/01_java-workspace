package com.kh.chap06_method.controller;

import java.util.Scanner;

public class NonStaticMethod {// 클래스 시작
	/*
	 * 메소드: 한 기능을 처리하기 위한 용도
	 *  
	 *  패키지명: 소문자로 시작
	 *  클래스명: 대문자로 시작
	 *  변수명: 소문자로 시작
	 *  메소드명: 소문자로 시작
	 *  
	 *  공통: 낙타표기법(camel case)
	 *  
	 *  [표현법]
	 *  접근제한자 반환형(반환할 값의 자료형) 메소드명([매개변수1, 매개변수2,...]) {
	 *  		수행내용;
	 *  		[return 결과값;] - void일 때 빼고
	 *  }
	 */
	
	// 1. 매개변수 없고 반환값도 없는 메소드
	public void method1() { // method1 시작
		// return 0; => 반환할 값 없어야함.
		System.out.println("1. 매개변수와 반환값이 둘 다 없는 메소드");
	} // method1 끝

	// 2. 매개변수 없고 반환값은 있는 경우
	public String method2() { // method2 시작
		System.out.println("2. 매개변수는 없고 반환값은 있는 메소드");
		return ".";
	} // method2 끝
	
	// 3. 매개변수는 있고 반환값은 없는 경우
	public void method3(int num1, int num2) { // method3 시작
		System.out.println("3. 매개변수는 있고 반환값은 없는 메소드");
		if (num2 != 0) {
		System.out.println("num1 / num2: " + num1 / num2);
		} else {
			System.out.println("0으로는 나눌 수 없습니다.");
		}
	} // method3 끝
	
	// 4. 매개변수, 반환값 둘 다 있는 메소드
	// 문자열과 정수값을 전달 받아서 해당 문자열의 해당 정수 인덱스의 문자값을 뽑아서 전환
	public char method4(String str, int index) { // method4 시작
		System.out.println("4. 매개변수와 반환값 둘 다 있는 메소드");
		
		if (index >= 0 && index < str.length()) {
			return str.charAt(index);
		} else {
			return ' ';
		}
 	} // method4 끝
	
	
} // 클래스 끝

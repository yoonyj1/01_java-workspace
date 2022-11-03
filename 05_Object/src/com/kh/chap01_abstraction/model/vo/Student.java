package com.kh.chap01_abstraction.model.vo;

/*
 * * 클래스의 구조
 * 	public class class명{
 * 
 * 		// 필드부
 *
 * 
 *		// 생성자부
 *
 *
 *		// 메소드부
 *		public void method1(){
 *
 *
 *		}
 *
 * }
 */

public class Student { // 학생을 추상화해서 만든 클래스 (완벽한 상태는 아님)
	
	// 필드부
	// [표현법]: 접근제한자 (예약어) 자료형 변수명
	
	// * 접근제한자: 여기에 접근할 수 있는 범위를 제한하는 것
	//				public > protected > default > private
	// public: 다른 클래스에서도 접근 가능
	
	public String name; // 이름
	public int age; // 나이
	public double height; // 키
	
	

}

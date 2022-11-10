package com.kh.chap03_override.run;

import com.kh.chap03_override.model.vo.Book;

public class OverrideRun { // 클래스 시작

	public static void main(String[] args) { // main 시작

		Book bk1 = new Book("수학의 정석", "나수학", 100);
		Book bk2 = new Book("칭찬은 고래도 춤추게 한다.", "고래", 300);
		
		System.out.println(bk1/*toString()*/);
		System.out.println(bk2);
		
		// 출력물에 레퍼런스를 출력하고자 할 때 JVM이 자동으로 해당 레퍼런스.toString()메소드 호출
		
		// 오버라이딩 전: Object 클래스의 toString() 실행 => 클래스명 + @ + 객체의 주소값 16진수값 리턴
		// 오버라이딩 후: Book 클래스의 toString() 실행 => 해당 객체가 가지고 있는 필드값을 한 문자열로 합쳐서 리턴
	} // main 끝

} // 클래스 끝

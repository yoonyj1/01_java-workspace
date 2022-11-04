package com.kh.chap04_field.model.vo;

// FieldTest2랑 같은 패키지 내
public class Run { // 클래스 영역 시작

	public static void main(String[] args) {

		// ------ FieldTest2 ------
		FieldTest2 f2 = new FieldTest2();
		
		// public
		System.out.println(f2.pub);
		
		// protected: 같은 패키지 내에서는 접근 가능, 다른 패키지에서는 상속 구조에서만 접근
		System.out.println(f2.pro);
		
		// default: 오직 같은 패키지 내에서만 접근 가능, 다른 패키지 절대 불가
		System.out.println(f2.def);
		
		// private: only 해당 클래스에서만 접근 가능
		// System.out.println(f2.pri);
	}

} // 클래스 영역 끝

package com.kh.chap04_field.model.vo;

// 클래스 변수(static 변수), 상수필드에 대해서 알아보기
public class FieldTest3 { // 클래스 영역 시작

	// static: 공유의 개념
	// static이 붙은 애들은 프로그램 실행과 동시에 메모리의 static 영역에 올라감
	// 프로그램 실행과 동시에 메모리 상에 한번 올려놓고 여기저기서 가져다 쓰는 개념
	// public이랑 같이 씀(관례)
	
	public static String sta = "static_FieldTest3";
	
	// 상수 필드(static final): 프로그램 시작 시 값이 저장되면 더 이상 값이 변경불가
	public static final String STA_FIN = "static final";
	
} // 클래스 영역 끝

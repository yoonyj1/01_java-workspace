package com.kh.chap02_byte.model.dao;

// dao(Data Access Object)

public class FileByteDao { // 클래스 시작
	
	/*
	 * "바이트 기반 스트림" 가지고 데이터 입출력 해보기
	 * 
	 *  - 바이트 스트림: 데이터를 1byte 단위로 전송하는 통로 (좁은통로 / 1byte면 한글이 깨짐)
	 *  - 기반 스트림: 외부매체와 직접적으로 연결되는 통로
	 *  
	 *  XXXInputStream: (XXX: 외부매체 이름) XXX 매체로부터 데이터를 입력받는 통로(외부매체로부터 데이터를 읽어오겠음)
	 *  XXXOutputStream: XXX 매체로부터 데이터를 출력하는 통로(외부매체로부터 데이터를 내보내겠음/쓰겠음)
	 */

	// 프로그램(자바 or 메모리) --> 외부매체(파일) (출력: 프로그램 상의 데이터를 파일로 내보내기, 즉 파일로 저장)
	public void fileSave() { // fileSave 메소드 시작
		
	} // fileSave 메소드 끝
} // 클래스 끝

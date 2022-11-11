package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

// 다형성을 적용 안했을 때
public class ElectronicShop1 { // 클래스 시작

	// 용산전자상가에 있는 가게
	// 3개의 제품을 마련하는 자리 만들기 => 창고
	// private int price // 기본자료형
	
	private Desktop desk; // 내가 만든 자료형
	private NoteBook note; // 객체생성은 안되고 텅 비어있음
	private Tablet tab;
	
	// 실제로 객체생성이 된 것은 아님
	// 필드가 메모리 상에 확보되는 순간: 객체가 생성되는 순간
	
	// Desktop 생성 메소드
	// Desktop 객체를 받아줄 수 있게 매개변수 작성
	public void insert(Desktop d) { // Desktop d = new Desktop(..);
		desk = d;
		// 내가 만든 데스크탑 객체를 desk라는 창고에 적재하겠다.
	}
	
	// NoteBook 생성 메소드
	public void insert(NoteBook n) { // NoteBook n = new NoteBook(..);
		note = n;
		// 내가 만든 노트북 객체를 note라는 창고에 적재하겠다.
	}
	
	// Tablet 생성 메소드
	public void insert(Tablet t) { // Tablet t = new Tablet(..);
		tab = t;
		// 내가 만든 태블릿 객체를 tab이라는 창고에 적재하겠다.
	}
	
	// 동일한 클래스에 동일한 메소드명으로 여러개 만드는 것 => 오버로딩
	// 단, 매개변수는 달라야 함.
	
	// 조회
	public Desktop selectDesktop() {
		return desk;
		// desk라는 창고가 내가 만든 Desktop 객체를 갖고있기 때문에 desk를 리턴
		// 리턴하려고 하는 값의 반환형으로 자료형을 써줘야함.
	}
	
	public NoteBook selectNoteBook() {
		return note;
	}
	
	public Tablet selectTablet() {
		return tab;
	}
	// insert처럼 select를 같은 이름으로 하면 안되는 이유: 매개변수가 없어 중복이 발생 => 오류발생
	
	// 현재 메소드 : 6개
	// 다형성 적용 시 2-3개로 줄일 수 있음.
} // 클래스 끝

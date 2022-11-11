package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.controller.ElectronicShop1;
import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicRun { // 클래스 시작

	public static void main(String[] args) { // main 시작

		// 실행용 클래스는 납품업체
		
		// 1. 다형성 적용 안했을 경우 (ElectronicShop1)
		ElectronicShop1 es = new ElectronicShop1();
		// es에서 마련해놓은 desk, note, tab이라는 필드에 객체를 생성해서 넣어주기 위해 es 생성
		// 객체 생성하는 순간 해당 클래스에 제시된 세 필드가 메모리 상에 할당
		
		// 메소드를 써서 생성
		// 필요한 메소드 생각
		// 추가용 메소드 => insert

		// 데스크탑이라는 객체를 생성해서 넘기는 메소드
		// es.insert(데스크탑이라는 객체를 생성);
		es.insert(new Desktop("삼성", "데땁", 1200000, "GTX1070"));
		
		// 노트북이라는 객체를 생성해서 넘기는 메소드
		es.insert(new NoteBook("LG", "그램", 2000000, 4));
		
		// 태블릿이라는 객체를 생성해서 넘기는 메소드
		es.insert(new Tablet("Apple", "아이패드", 800000, false));
		
		// 가게에 해당 객체들이 잘 생성돼있는지 확인해보자
		// 조회용 메소드 => select
		
		Desktop d = es.selectDesktop();
		NoteBook n = es.selectNoteBook();
		Tablet t = es.selectTablet();
		
		// return이기 때문에 console 창에는 안보임
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		
		// toString() 오버라이딩 했기 때문에 주소값이 아닌 출력문이 나옴
	} // main 끝

} // 클래스 끝

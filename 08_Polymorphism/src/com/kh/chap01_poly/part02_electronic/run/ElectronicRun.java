package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.controller.ElectronicShop1;
import com.kh.chap01_poly.part02_electronic.controller.ElectronicShop2;
import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicRun { // 클래스 시작

	public static void main(String[] args) { // main 시작

		// 실행용 클래스는 납품업체
		/*
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
		 */
		
		// 2. 다형성을 적용했을 경우(ElectronicShop2)
		ElectronicShop2 es = new ElectronicShop2();
		
		// 필요한 메소드 먼저 전부 써놓고 짜기
		// 생성용 메소드
		es.insert(new Desktop("삼성", "데땁", 1200000, "GTX1070"));
		es.insert(new NoteBook("LG", "그램", 2000000, 4));
		es.insert(new Tablet("Apple", "아이패드", 800000, false));
		
		// 조회용 메소드
		// 이름을 select로 통일
		
		// Desktop d = es.select(0);
		// 실제로 들어있는 값은 Desktop의 객체가 맞으나 반환형이 Electronic이라서 맞춰줘야함.
		// 문제가 되는 부분은 형변환 해줘야함
		
		/*
		// 다운캐스팅
		Desktop d = (Desktop)es.select(0);
		NoteBook n = (NoteBook)es.select(1);
		Tablet t = (Tablet)es.select(2); 
		*/
		// 위아래 둘 다 가능
		Electronic d = es.select(0);
		Electronic n = es.select(1);
		Electronic t= es.select(2);
		
		// System.out.println(d);
		// toString() 할 때 부모의 toString 불러오지 못하는 이유: 동적바인딩
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		
		/*
		 * 다형성을 사용하는 이유
		 * 1. 부모 타입 배열로 다양한 자식 객체들을 받을 수 있음.(Electronic으로 Desktop, NoteBook, Tablet을 만들 수 있음)
		 * 2. 메소드 정의 시 매개변수로(Electronic any) 다형성을 적용하게 되면 메소드 개수가 줄어든다.
		 * 3. 필수로 써야하는 경우가 있음: 추상클래스(인터페이스)
		 */
		
	} // main 끝

} // 클래스 끝

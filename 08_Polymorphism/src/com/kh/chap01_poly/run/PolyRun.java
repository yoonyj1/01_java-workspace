package com.kh.chap01_poly.run;

import com.kh.chap01_poly.model.vo.Child1;
import com.kh.chap01_poly.model.vo.Child2;
import com.kh.chap01_poly.model.vo.Parent;

public class PolyRun { // 클래스 시작

	public static void main(String[] args) { // main 시작

		// 기억해둘것 ' = ' 기준으로 왼쪽과 오른쪽의 자료형(타입)은 같아야한다.
		
		System.out.println("1. 부모타입 레퍼런스로 부모객체를 다루는 경우");
		Parent p1 = new Parent();
		
		p1.printParent();
		// p1 레퍼런스로 Parent에만 접근 가능
		
		System.out.println("2. 자식타입 레퍼런스로 자식객체를 다루는 경우");
		Child1 c1 = new Child1();
		
		c1.printChild1();
		c1.printParent(); // 자동형변환 된거였음(Child1 => Parent)
		// ((Parent)c1).printParent();
		// c1 레퍼런스로 Child1과 Parent 접근 가능
		// Parent 접근 시 자동으로 형변환 된 채로 진행
		
		System.out.println("3. 부모타입의 레퍼런스로 자식객체를 다루는 경우(다형성)");
		Parent p2 = new Child1(); // 자료형이 다르나 에러X -> 자동형변환 발생 / == Parent p2 = (Parent) new Child1();
		
		p2.printParent();
		// p2.printChild1();
		((Child1)p2).printChild1(); // 강제형변환을 하면 호출은 가능
		
		// p2 레퍼런스로 지금 당장은 Parent에만 접근 가능하지만 Child1에 접근하고자하면 강제형변환을 통해 접근해야함.
		
		/*
		 * 상속 구조의 클래스들 간에는 형변환 가능
		 * 1. UpCasting
		 * 		: 자식 타입 => 부모 타입으로 형변환
		 * 		  자동 형변환
		 * 		ex)자식.부모메소드();
		 * 		   부모 = (부모)자식객체;
		 * 
		 * 2. DownCasting
		 * 		: 부모 타입 => 자식 타입으로 형변환
		 * 		  강제 형변환
		 * 		ex)((자식)부모).자식메소드();
		 * 
		 * 상속구조 아니면 안됨.	
		 */
		
		// 다형성 정의
		//  - 부모타입으로부터 파생된 여러가지 타입의 자식 객체들을 부모클래스 타입 하나로도 다룰 수 있다.
		
		// 다형성을 쓰는 목적
		// 다형성을 배우기 전
		// Child1 객체 2개, Child2 객체 2개 관리해야할 시 => 총 4개
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1, 2, 4); // 객체1
		arr1[1] = new Child1(2, 3, 5); // 객체2
		
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(2, 1, 5); // 객체3
		arr2[1] = new Child2(5, 7, 2); // 객체4
		
		//---------------------------------------------------------
		
		// 다형성을 적용한 후
		Parent[] arr = new Parent[4];
	//	Parent타입	
		arr[0] = new Child1(1, 2, 4); // 객체1
		arr[1] = new Child2(2, 1, 5); // 객체2
		arr[2] = new Child2(5, 7, 2); // 객체3
		arr[3] = new Child1(2, 3, 5); // 객체4
		// 하나의 부모타입만으로 여러 자식 객체를 받을 수 있음(편리, 코드길이 감소)
		
	} // main 끝

} // 클래스 끝

package com.kh.chap02_abstractAndInterface.part02_basic.run;

import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Baby;
import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Basic;
import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Mother;
import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Person;

public class BasicRun { // 클래스 시작

	public static void main(String[] args) { // main 시작

		/*
		// 부모 Person
		// 자식 Mother, Baby
		// Person p = new Person();
		
		Person mom = new Mother("엄마", 50, 70, "출산");
		Person baby = new Baby("아기", 3.5, 70);
				
		System.out.println(mom);
		System.out.println(baby);
		
		mom.eat(); // 몸무게 +10, 건강도 -10
		baby.eat(); // 몸무게 +3, 건강도 +1
		
		mom.sleep(); // 건강도 +20
		baby.sleep(); // 건강도 +3
		
		System.out.println("====== 다음 날 ======");
		
		System.out.println(mom);
		System.out.println(baby);
		*/
		
		//===========================================================
		
		// Basic b = new Basic(); // 레퍼런스 변수로는 사용가능하나 객체 생성은 불가능하다.
		Basic mom = new Mother("엄마", 50, 70, "출산");
		Basic baby = new Baby("아기", 3.5, 70);
		
		System.out.println(mom);
		System.out.println(baby);
		
		mom.eat();
		baby.eat();
		
		mom.sleep();
		baby.sleep();
		
		System.out.println("==========다음날==========");
		
		System.out.println(mom);
		System.out.println(baby);
		
	} // main 끝

} // 클래스 끝

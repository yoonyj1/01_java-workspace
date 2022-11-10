package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;

public class InheritRun /* extends Object */{ // 클래스 시작

	public static void main(String[] args) { // main 시작

		Car c = new Car("벤틀리", 12.5, "세단", 4);
		
		Ship s = new Ship("낚시배", 3, "어선", 1);
		
		Airplane a = new Airplane("종이비행기", 0.01, "제트기", 10, 4);
		
		System.out.println(c.information());
		System.out.println(s.information());
		System.out.println(a.information());
		
		c.howToMove();
		s.howToMove();
		a.howToMove();
		
		/*
		 * * 상속의 장점
		 *  - 보다 적은 양의 코드로 새로운 클래스 작성 가능
		 *  - 코드를 공통적으로 관리하기 때문에 코드의 추가나 변경에 용이(유지보수, 생산성 up)
		 *  
		 * * 상속의 특징
		 *  - 클래스 간의 상속에 있어서 다중 상속이 안된다.(단일 상속만 가능)
		 *  - 부모클래스에 정의돼있는 protected 필드는 자식 클래스에서 직접 접근가능
		 *  - 자식 객체는 부모클래스에 있는 메소드를 마치 내 것처럼 호출 가능
		 *  		+ 부모클래스에 있는 메소드가 마음에 안들면 자식클래스에서 오버라이딩 가능(재정의 가능)
		 *  - 명시되어 있지는 않지만 모든 클래스(제공하는 클래스, 직접 만드는 클래스)는 Object 클래스의 후손이다.
		 *   => Object 클래스에 있는 메소드를 마음대로 호출가능
		 *   => 오버라이딩을 통해서 재정의 가능  
		 */
		
		 System.out.println(c.hashCode());
		 System.out.println(c.equals(s));
		 System.out.println(c);
		 System.out.println(c.toString());
		
	} // main 끝

} // 클래스 끝

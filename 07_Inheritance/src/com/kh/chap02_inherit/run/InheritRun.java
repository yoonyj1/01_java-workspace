package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;

public class InheritRun { // 클래스 시작

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
		 *  - 클래스간의 상속에 있어서 다중 상속이 안된다.
		 */
		
	} // main 끝

} // 클래스 끝

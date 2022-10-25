package com.kh.operator;

import java.util.Scanner;

public class E_Logical {

	/*
	 * 논리연산자(이항연산자)
	 * 두개의 논리값을 연산해주는 연산자
	 * 논리연산한 결과도 논리값
	 * 
	 * 논리값 && 논리값 : 왼쪽과 오른쪽 둘다 true일 경우 결과값 true
	 * 논리값 || 논리값 : 왼쪽과 오른쪽 둘 중에 하나만 true일 경우 결과값 true
	 * 
	 */
	
	public void method1() {
		// 사용자가 입력한 정수값이 1부터 100사이의 값인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		boolean result = (num >= 1) && (num <=100); // num값이 1이상'이고' num값이 100이하일 경우 
		//&& 의미 : ~이고, 그리고, ~하면서
		
		System.out.println("사용자가 입력한 값이 1이상 100이하 입니까? : " + result);
		//&& : 두 개의 조건 모두가 true여야 && 연산의 결과값이 true
		//		둘 중에 하나라도 false가 있을 경우 &&의 결과값은 false
		
		sc.close();
	}
	
	public void method2() {
		//사용자가 입력한 문자값이 영어 대문자인지 확인
		//'A' ~ 'Z' 65 ~ 90
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 하나 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		//첫번째 방법
		//boolean result = (ch >= 65) && (ch <= 90);
		
		//두번째 방법
		boolean result = (ch >= 'A') && (ch <= 'Z');
		System.out.println("사용자가 입력한 값이 대문자입니까? : " + result);
		
		sc.close();
	}
	
	public void method3() {
		//사용자에게 성별을 입력받은 후 여자인지 확인
		//성별을 입력해주세요 : (M/F)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성별을 입력해주세요 : (M/F) ");
		char gender = sc.nextLine().charAt(0);
		
		boolean result = (gender == 'F') || (gender == 'f');
		// || 의미 : ~이거나, ~또는
		
		System.out.println("사용자가 여자입니까? : " + result);
		
		sc.close();
		
		// || : 두개의 조건 중 하나라도 true가 있다면 || 연산의 결과값은 true
		//		두개 조건 모두 false 일 경우  || 연산의 결과값은 false
	}
	
	public void method4() {
		/*
		 * &&: 두개의 조건이 모두 true여야 결과값이 true(AND == ~이고, ~이면서, 그리고)
		 * 
		 * true && true  => true
		 * true && false => false
		 * false && true => false
		 * false && false => false
		 * *&&앞의 결과가 false이면 뒤의 조건은 굳이 실행하지 않는다
		 * 
		 * ||: 두개의 조건 중 하나라도 true면 결과값 true(OR == 또는, ~이거나)
		 * 
		 * true || true  =>true
		 * true || false => true
		 * false || true => true
		 * false || false => false
		 * *||앞의 결과가 true일 경우 뒤의 조건은 굳이 실행하지 않는다 
		 * 
		 */
		
		int num = 10;
		boolean result1 = (num > 5) && (++num > 0);
		
		System.out.println("result1 : " + result1);
		System.out.println("&&연산 후의 num 값 : " + num); //num = 10
		
		int num2 = 10;
		//boolean result2 = (num2 > 20) || (++num2 > 0);
		boolean result2 = true || (++num2 > 0); // Dead code : 절대 실행될 일 없는 코드
		
		System.out.println("result2 : " + result2);
		System.out.println("||연산 후의 num2 값 : " + num2); //num2 = 10
		
	}
	
	public void method5() {
		//사용자에게 입력 받아 게임을 종료하는 프로그램
		// 게임을 종료하시려면 y를 입력해주세요 : 
		// 변수는 ch
		// 사용자는 y 또는 Y로 입력할 수 있음
		// 사용자가 y 또는 Y 입니까?
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("게임을 종료하시려면 y를 입력해주세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		boolean result = (ch == 'y') || (ch == 'Y');
		
		System.out.println("사용자가 입력한 값이 y 또는 Y입니까? : " + result);
		
		sc.close();
	}
}

package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {

	/*
	 * 기본적으로 프로그램 진행은 순차적으로 진행
	 * 단, 순차적인 흐름을 바꾸고자 한다면 제어문이라는 것을 이용하여 직접 제어 가능
	 * 
	 * 선택적으로 실행시키고자 할 때 -> 조건문
	 * 반복적으로 실행시키고자 할 때 -> 반복문
	 * 그 외의 흐름을 제어 -> 분기문
	 * 
	 * * 조건문
	 * "조건식"을 통해 참이냐 거짓이냐를 판단해서 참일 경우 해당하는 코드 실행
	 * 
	 * 조건식의 결과는 true / false여야 함
	 * 보통 조건식에서는 비교연산자(대소, 동등), 논리연산자(&&, ||)를 주로 사용
	 * 
	 * if문, switch문으로 나뉨
	 */
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();

		/*
		 * 단독 if문
		 * [표현법]
		 * 	if (조건식) {
		 * 			참일 때 실행시키고자 하는 코드
		 * }
		 * 조건식은 if랑 친함
		 * => 조건식이 참(true)일 경우 -> 중괄호 안 코드 실행
		 * => 조건식이 거짓(false)일 경우 -> 중괄호 안 코드 무시하고 넘어감
		 */
		
		if (num > 0) {
			System.out.println("양수다");
		}
		
		if (num <= 0) {
			System.out.println("양수가 아니다.");
		}
		
		sc.close();
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		/*
		 * if - else 문
		 * 
		 * [표현법]
		 * if(조건식) {
		 * 		실행코드1
		 * }else{
		 * 		실행코드2 : false일 때 실행할 코드
		 * }
		 * 
		 * 조건식의 결과가 true일 경우 실행코드 1 수행 후 if-else문 빠져나감
		 * 단 false일 경우 무조건 실행코드2 수행
		 */
		
		if (num > 0) {
			System.out.println("양수다");
		}else {
			System.out.println("양수가 아니다.");
		}
		
		sc.close();
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		/* if -else if- else 문
		 *
		 * 같은 비교대상으로 여러개의 조건을 제시해야할 경우
		 * [표현식]
		 * if (조건식1) {
		 * 		실행코드1
		 * }else if(조건식2) {
		 * 		실행코드2
		 * }else if(조건식3) {
		 * 		실행코드3
		 * } 
		 * ...[else {
		 * 		조건이 모두 false 일 경우 실행코드
		 * }] 생략가능
		 */
		
		if (num > 0) {
			System.out.println("양수다.");
		}else if (num == 0) {
			System.out.println("0이다.");
		}else /*if (num < 0)*/ {
			System.out.println("음수다.");
		}
		
		sc.close();
	}
}

package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {

	/*
	 * while 문
	 * 
	 * [표현법]
	 * 
	 * [] : 생략가능
	 * [초기식;] 
	 * while(조건식) {
	 * 		반복적으로 실행할 코드;
	 * 		[증감식;]
	 * }
	 * 
	 * 조건식이 true일 경우 해당 코드 실행
	 * 조건식 검사 => true => 실행코드 실행
	 * 조건식 검사 => true => 실행코드 실행
	 * 조건식 검사 => true => 실행코드 실행
	 * ...
	 * 조건식 검사 => false => 실행코드 실행X => 반복문 탈출
	 */
	
	public void method1() {
		//안녕하세요 5번 출력
		
		int i = 1;//초기식
		while(i <= 5) {//조건식
			System.out.println("안녕하세요");//반복할 실행코드
			i++; //증감식 (없으면 무한반복)
		}
		
		//for 문과 다른점: i값을 출력할 수 있다.
		System.out.println("i의 값 : " + i);
	}
	
	public void method2() {
		// 1 2 3 4 5
		
		int i = 1;
		while(i <= 5) {
			System.out.print(i + " ");
			i++;
		}
	}
	
	public void method3() {
		//1에서부터 10까지 출력
		/*
		int i = 1;
		while(i <= 10) {
			System.out.print(i + " ");
			i ++;
		}
		*/
		
		// 1 3 5 7 9
		/*
		int i = 1;
		while(i <= 10) {
			System.out.print(i + " ");
			i += 2;
		}
		*/
		
		int i = 1;
		while (i <= 10) {
			if (i % 2 == 1 ) {
				System.out.print(i + " ");
			}
				i++;
		}
	}			

	public void method4() {
		//1부터 랜덤값(1~100)까지의 합계
		
		int random = (int)(Math.random() * 100 + 1);
		
		int i = 1;
		int sum = 0;
		while(i <= random) {
			sum += i; // 누적합 공식
			i++;
		}
		
		System.out.println("1부터 " + random + "까지의 합 : " + sum);
	}

	public void method5() {
		// 사용자에게 문자열을 입력받아서 (str 변수에 대입)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		int i = 0;
		while(i < str.length()) {
			System.out.println(str.charAt(i));
			i++;
		}
		sc.close();
	}
}



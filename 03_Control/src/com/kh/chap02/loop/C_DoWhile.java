package com.kh.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {

	/*
	 * do-while 문
	 * [표현법]
	 * do {
	 * 		반복 실행할 코드
	 * } while(조건식);
	 * 
	 * **처음에 무조건 실행코드 실행(조건검사X)
	 * -> 조건식 검사  -> true -> 실행코드 실행
	 * -> 조건식 검사  -> true -> 실행코드 실행
	 * -> 조건식 검사  -> false -> 실행코드 실행X -> 반복문 탈출
	 * 
	 * 기존의 for, while문과의 차이점
	 * 	for, while문 같은 경우 조건검사를 한 후에 true여야만 수행
	 * do-while은 조건검사 없이 무조건 한번은 수행
	 * 
	 */
	
	public void method1() {
		int num = 1;
		
		do {
			System.out.println("num의 값: " + num);
		} while (false); // 조건이 맞지 않아도 최소 한번은 출력
	}
	
	public void method2() {
		// 1 2 3 4 5
		
		int i = 1;
		
		do {
			System.out.print(i + " ");
			i++;
		} while (i <= 5);
	}
	
	public void method3() {
		//1부터 사용자가 입력한 수까지의 총 합계 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		int i = 1;
		do {
			sum += i;
			i++;
		} while (i <= num);
		
		System.out.println("1부터 " + num +"까지 합: " + sum);
		
		sc.close();
	}
}

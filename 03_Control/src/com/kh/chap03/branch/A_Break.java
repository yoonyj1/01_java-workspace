package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	/*
	 * break; : 반복문 안에 사용되는 분기문
	 *  		break;가 실행되는 순간 현재 속해있는 반복문을 강제로 빠져나감
	 *  
	 *  * 유의사항: switch문 안의 break;는 단지 switch를 빠져나가는 구문
	 */
	
	public void method1() {
		//랜덤값(1~100) 발생시키고 그 랜덤값 출력 (이 과정 반복)
		//단, 발생된 랜덤값이 3의 배수일 경우 반복문 빠져나오기
						
		while (true) {
			int random = (int)(Math.random() * 100 + 1);
			System.out.println("random 값: " + random);
			if(random % 3 == 0) { //3의 배수일 경우
				break; // 반복문을 강제로 빠져나가게 하는 구문
			}
		}
		
	}
	
	public void method2() {
		// 사용자에게 문자열을 입력받아서 해당 문자열의 길이 출력(무한반복)
		// 단, 사용자가 입력한 문자열이 "exit"일 경우 반복문탈출
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("문자열 입력 (exit 입력 시 종료): ");
			String str = sc.nextLine();
			
			if(str.equals("exit")) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			System.out.println(str.length());
		}
		
		sc.close();
	}
}

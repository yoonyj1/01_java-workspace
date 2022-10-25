package com.kh.operator;

import java.util.Scanner;


public class G_Triple {

	
	/*
	 * 삼항 연산자 (항목 3개를 가지고 연산해주는 연산자)
	 * 
	 * [표현법]
	 * (조건식) ? 조건식이 참일 경우 돌려줄 결과값 : 거짓일 경우 돌려줄 결과값
	 * 조건식은 True/False가 반환되게 작성  
	 * 
	 * 주로 비교, 논리 연산자를 통해 작성
	 */
	
	public void method1() {
		//입력받은 정수 값이 양수인지 아닌 지 판별 후 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		String result = (num > 0) ? "양수" : "음수";
		
		System.out.println(num + "은(는) " + result + "입니다.");
		//System.out.println(num + "은(는) " + ((num > 0) ? "양수" : "음수"));
		
		sc.close();
	}
	
	public void method2() {
		//입력받은 정수값이 짝수인지 홀수인지 판별 후 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		//String result = (num % 2 == 0) ? "짝수" : "홀수";
		String result = (num % 2 == 1) ? "홀수" : "짝수";
		
		System.out.println(num + "은(는) " + result);
		
		sc.close();
	}
	
	public void method3() {
		// 사용자에게 종료여부를 입력받아 판별해서 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("종료? (Y/N) : ");
		char ch = sc.nextLine().charAt(0);
		
		String result = (ch == 'y' || ch == 'Y') ? "프로그램 종료" : "계속 진행";  
		
		System.out.println(result);
		
		sc.close();
	}
	
	public void method4() {
		//입력받은 문자값이 영어 소문자인지 아닌지 판별 후 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자값 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		String result = (ch >= 'a' && ch <= 'z') ? "소문자입니다." : "소문자가 아닙니다.";
		
		System.out.println("입력한 문자는 " + result);
		
		sc.close();
	}
	
	public void method4_1() {
		//사용자에게 값을 입력받아서 0보다 큰지 작은지 판별하는 프로그램 작성
		//숫자 하나 입력:
		//변수 num
		//출력예시 : 입력하신 숫자  는 0보다 큽니다. 입력하신 숫자  는 0 또는 0보다 작습니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 하나 입력 : ");
		int num = sc.nextInt();
		
		String result = (num > 0) ? "0보다 큽니다." : "0 또는 0보다 작습니다.";
		
		System.out.println("입력하신 숫자 " + num + "은(는) " + result);

		sc.close();
	}
	
	public void method5() {
		//사용자가 입력한 정수값이 양수인지, 음수인지, 0인지를 정확하게 판별한 후 출력
		//삼항연산자 중첩
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		String result = (num > 0) ? "양수입니다." : ((num == 0) ? "0입니다." : "음수입니다.");
		
		System.out.println(num + "은(는) " + result);
		
		sc.close();
	}
	
	public void method6() {
		//사용자에게 두개의 정수값 입력받고 +또는 -를 입력받아 그에 맞는 연산결과를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();

		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
	
		//버퍼에 남아있는 엔터를 제거하기 위한 코드
		sc.nextLine();
		
		System.out.print("연산자 입력 (+ 또는 -) : ");
		char op = sc.nextLine().charAt(0);
		
		String result = (op == '+') ? (num1 + num2 + "") : (op == '-') ? (num1 - num2 + "") : "잘못 입력했습니다.";
		
		System.out.println("결과 : " + result);
		sc.close();
	}
}

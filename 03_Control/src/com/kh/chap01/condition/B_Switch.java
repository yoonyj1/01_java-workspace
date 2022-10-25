package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Switch {

	/*
	 * switch문도 if문과 동일한 조건문임
	 * 
	 * if문과의 차이점
	 * > if문은 조건식을 자유롭게 기술 가능
	 * > switch 문은 동등비교로 밖에 수행되지 않음
	 * 
	 * >실행 할 구문만 실행하고 자동으로 빠져나오질 못함! (직접 break;문 작성)
	 * 
	 * [표현법]
	 * 	switch(이제부터 동등비교할 대상){
	 * 	case 값1 : 
	 * 	실행코드1; 
	 * 	break;
	 * 	case 값2 : 
	 * 	실행코드1;
	 *  break;
	 * 	....
	 * 	[default : 
	 * 	위의 값들과 모두 일치하지 않을 경우 실행할 코드;]생략가능 ->if 문에서 else와 같은 존재
	 * }
	 * 
	 */
	
	public void method1() {
		/*
		 * 정수를 입력받아
		 * 1일 경우 "빨간색 입니다." -> case 1 : "빨간색입니다.";
		 * 2일 경우 "파란색 입니다." -> case 2 : "파란색입니다.";
		 * 3일 경우 "초록색 입니다." -> case 3 : "초록색입니다.";
		 * 잘못 입력했을 경우 "잘못입력" -> default : "잘못입력.";
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력(1~3) : ");
		int num = sc.nextInt();
		
		//if
		/*
		if (num == 1) {
			System.out.println("빨간색입니다.");
		} else if (num == 2) {
			System.out.println("파란색입니다.");
		} else if (num == 3) {
			System.out.println("초록색입니다.");
		} else {
			System.out.println("잘못 입력");
		}
		*/
		
		//switch
		switch (num) {
		case 1 :
			System.out.println("빨간색입니다.");
			break;
		case 2 : 
			System.out.println("파란색입니다.");
			break;
		case 3 : 
			System.out.println("초록색입니다."); 
			break;
		default : 
			System.out.println("잘못 입력"); 
			break;
		}
		
		sc.close();
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매할 과일(사과, 바나나, 복숭아) 입력 : ");
		String fruit = sc.nextLine();
		
		int price = 0;
		
		switch (fruit) {

		case "사과" :
			price = 1000;
			break;
		
		case "바나나" :
			price = 2000;
			break;
			
		case "복숭아" :
			price = 3000;
			break;
			
		default : System.out.println("해당 과일은 품절됐습니다.");
			return;
		}
		
		System.out.println(fruit + "의 가격은 " + price + "원 입니다.");
		
		sc.close();
	}
	public void method3() {
		//등급별 권한
		//1. 관리권한, 글쓰기 ,읽기권한
		//2. 글쓰기, 읽기권한
		//3. 읽기권한
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등급(정수) : ");
		int level = sc.nextInt();
		
		switch (level) {
		case 1 : 
			System.out.println("관리권한");
			
		case 2 :
			System.out.println("글쓰기 권한");
			
		case 3 :
			System.out.println("읽기 권한");
		}
		
		sc.close();
	}
	
	public void method4() {
		//월을 입력받아 해당 월의 마지막 날짜 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 입력");
		int month = sc.nextInt();
		
		switch (month) {
		case 1 : 
			
		case 2 : 
		}
	}
}



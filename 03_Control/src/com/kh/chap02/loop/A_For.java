package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {

	/*
	 * 반복문
	 * 프로그램 흐름을 제어하는 제어문 중 하나
	 * 어떤 실행코드를 반복적으로 수행시켜줌
	 * 
	 * 두 종류로 나뉨 (for문 / while 문(do-while문))
	 * 
	 * *for문
	 * [표현법]
	 * for (초기식; 조건식; 증감식) { //반복횟수를 지정하기 위해 제시하는 것들
	 * 		반복적으로 실행시키고자하는 구문
	 * }
	 * 
	 * 초기식 : 반복문이 수행될 때 처음에 단 한번만 실행되는 구문
	 * 		  (반복문 안에서 사용될 변수를 선언 및 초기화 하는 구문)
	 * 
	 * 조건식 : 반복문이 수행될 조건을 작성하는 구문
	 * 		  조건식이 true일 경우 해당 구문 실행
	 * 		  조건식이 false일 경우 반복을 멈추고 빠져나옴
	 * 		  초기식에 제시된 변수를 가지고 조건식을 작성함.
	 * 
	 * 증감식 : 반복문을 제어하는 변수 값을 증감시키는 구문
	 * 		   초기식에 제시된 변수를 가지고 증감연산자(++, --)를 사용함
	 * 
	 * for문을 만나는 순간
	 *  초기식 -> 조건식 검사 -> true 일 경우 실행구문 실행 -> 증감식
	 *  	 -> 조건식 검사 -> true 일 경우 실행구문 실행 -> 증감식
	 *  ---------------------반복--------------------------
	 *  		조건식 검사 -> false 일 경우 실행구문 실행하지 않고 반복문 탈출
	 *  
	 *  **for 문 안에 초기식, 조건식, 증감식 각각 생략 가능 단,  ; ; 은 필수 작성
	 *  안에 내용 아무것도 없고 ; ; 만 있으면 무한실행
	 */
	
	public void method1() {
		//"안녕하세요"를 5번 반복해서 출력
		
		/*
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		*/
		
		for (int i = 1; i <= 20; i++) {// i값이 1에서부터 5까지 매번 1씩 증가하는 동안 반복 (1,2,3,4,5 -> 5회 수행)
			System.out.println(i + ". " + "안녕하세요");
		}

		for (int i = 0; i <= 4; i++) {// i값이 0에서부터 4까지 매번 1씩 증가하는 동안 반복수행(0,1,2,3,4 -> 5회 수행)
			System.out.println("반갑습니다.");
		}

		for (int i = 11; i <= 15; i++) {// i값이 11에서부터 15까지 매번 1씩 증가하는 동안 반복 수행 (11,12,13,14,15 -> 5회 수행)
			System.out.println("저리가세요");
		}

		for (int i = 1; i <= 9; i += 2) {
			System.out.println("Hello"); // i 값이 1에서부터 9까지 매번 2 증가하는 동안 반복 수행(1,3,5,7,9)
		}

		// System.out.println(i);
	}
	
	public void method2() {
		//1부터 5까지 출력
		/*
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		*/
		/*
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		*/
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
	}

	public void method3() {
		// 5 4 3 2 1

		for (int i = 5; i >= 1; i--) {
			System.out.print(i + " ");
		}
	}
	
	public void method4() {
		//1부터 10까지 홀수만 출력
		/*
		for (int i = 1; i <= 9; i += 2) {//i값이 1에서부터 9까지 매번 2씩 증가되는 동안 반복 수행(1,3,5,7,9)
			System.out.print(i + " ");
		}
		*/
		
		for (int i = 1; i <= 10; i++) {// i값이 1에서부터 10까지 매번 1씩 증가되는동안 반복 수행(10회)
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
	}

	public void method5() {
		// 1 2 3 4 5 6 7 8 9 10 for문 고정

		for (int i = 0; i <= 9; i++) {
			System.out.print((i + 1) + " ");
		}
	}
	
	public void method6() {
		// 1부터 10까지 총합계
		//방법 1 : int sum = 1+2+3+4+5+6+7+8+9+10;
		/*
		 * 방법 2 : int sum = 0;
		 * sum += 1;
		 * sum += 2;
		 * sum += 3;
		 * ...
		 * sum += 10;
		 */
		
		//sum 변수에 누적해서 합산하는 것 반복적으로 진행
		//더하고자 하는 값이 1에서부터 10까지 1씩 증가하는 것을 파악
		
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum += i;
		}

		System.out.println("1부터 10까지의 합 : " + sum); // 반복문 밖에다가 작성해야함.
	}

	public void method7() {
		//사용자에게 값을 입력받아 1부터 입력받은 수까지의 합계 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		/*
		 * int sum = 0;
		 * 
		 * sum =+ 1;
		 * sum =+ 2;
		 * ...
		 * sum += num;
		 */
		
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		
		System.out.println("1부터 " + num + "까지의 합 : " + sum);
		
		sc.close();
	}
	
	public void method8() {
		//1에서부터 어떤 랜덤값(1~10 사이의 랜덤값)의 까지에 합계
		
		//자바에서 제공하고 있는 클래스(Math)
		
		/*
		 * java.lang.Math 클래스에서 제공하는 random() 메소드를 호출
		 * 매번 다른 랜덤값을 얻어낼 수 있음
		 * Math.random(); => 0.0~0.99999... 사이의 랜덤값을 발생
		 * 					(0.0 <=		< 1.0)
		 */
		
		//int random = Math.random(); //double 형이라 안됨
		//				0.0 ~ 1.0		0.0 ~ 0.999...
		//int random = Math.random() * 10;
		//				0.0 ~ 10.0		0.0 ~ 9.999...
		//int random = Math.random() * 10 + 1;
		//				1.0 ~ 11.0		1.0 ~ 10.999...
		int random = (int)(Math.random() * 10 + 1);
		//				1 <=	< 11 	1~10
		System.out.println("1~10 사이의 랜덤값 : " + random);
		
		
		int sum = 0;
		for (int i = 1; i <= random; i++) {
			sum += i;
		}
		
		System.out.println("1부터 " + random +  "까지의 합 : " + sum );
	}
	
	public void method9() {
		String str = "Hello";
		
		// 각 인덱스별 문자를 뽑아서 출력
		/*
		 * H		=> str.charAt(0);
		 * e		=> str.charAt(1);
		 * l		=> str.charAt(2);
		 * l		=> str.charAt(3);
		 * o		=> str.charAt(4);
		 * 
		 * 0번 인덱스부터 4번 인덱스까지(마지막 인덱스) 1씩 증가하면서 반복 수행
		 */
		for (int i = 0; i <= 4 ; i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	public void method10() {
		// 사용자에게 문자열을 입력받아서 (str 변수에 대입)
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		//각 인덱스별 문자를 뽑아서 출력
		//apple의 길이 : 5
		//01234
		
		//strawberry : 10
		//0123456789
		
		//kiwi : 4
		//0123
		
		//마지막 인덱스는 항상 (문자열의 길이 - 1)
		//추출하고자 하는 인덱스값이 (문자열의 길이 - 1)까지 매번 1씩 증가
		
		System.out.println("문자열의 길이 : " + str.length());
		
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		sc.close();
	}
	
	public void method11() {
		//구구단 출력
		//2단 출력하기
		
		/*
		for (int i = 1; i <= 9; i++) {
			int result = 2 * i;
			System.out.println("2 x " + i + " = " + result );
		}
		*/
			for (int i = 1; i <= 9; i++) {
				//System.out.println("2 x " + i + " = " + 2 * 1 );
				System.out.printf("%d x %d = %d\n", 2, i, 2*i);
		}
	}
	
	public void method12() {
		//사용자에게 단수를 입력받아 구구단 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2 ~ 9 사이의 정수 입력 : ");
		int dan = sc.nextInt();
		/*
		if (dan < 2 || dan > 9 ) {
			System.out.println("2 ~ 9 사이의 숫자를 입력해야합니다.");
		} else {
			for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " X " + i + " = " + dan * i);
		}
	}
		*/
		
		if (dan >= 2 && dan <= 9) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + " X " + i + " = " + dan * i);
			}
		} else {
			System.out.println("2 ~ 9 사이의 숫자를 입력해야합니다.");
		}
		
		sc.close();
	}
	
	public void method13() {
		// 2부터 9까지의 랜덤값 발생시켜서 랜덤단 출력시키기
		
		int dan = (int)(Math.random() * 8 + 2); //2가 시작수, 시작수로부터 몇개를 발생시킬지
		//				0.0 <=		< 1.0
		//	* 8			0.0 <=		< 8.0
		//	+ 2			2.0 <=		< 10.0
		//	int			2 <=		< 10
		//시작수가 맨뒤에 더해져야하고, 발생시킬 개수 곱하기
		
		System.out.println("===== " + dan + "단 =====");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, (dan*i));
		}
	}
	
	public void method14() {
		//중첩 for문
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		for(int j = 1; j <= 3 ; j++) {
			for (int i = 1; i <= 5; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	
	public void method15() {
		// ****
		/*
		for(int i = 1; i <= 4; i++) {
			System.out.print("*");
		}
		*/
		
		//****
		//****
		//****
		//****
		
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void method16() {
		//1***
		//*2**
		//**3*
		//***4
		
		//행 1~4까지 반복 => 바깥쪽 for 문
		//매 행 고정일 때 열은 1~4까지 반복 => 안쪽 for 문 
		
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 4; j++) {
				if(i == j) {
					System.out.print(i);
				} else {
				System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public void method17() {
		//2단부터 9단까지 다 출력
		
		/*
		int dan = 3;
		System.out.println("=====3단=====");
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, (dan*i));
		}
		*/
				
		
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("======" + dan + "단======" );
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, (dan * i));
			}
			System.out.println();
		}
		
	}
	
	public void method18() {
		for(; ;) {//조건식 자리 생략시 기본적으로 true => 무한반복문
			System.out.println("ㅎㅇ");
		}
	}
}
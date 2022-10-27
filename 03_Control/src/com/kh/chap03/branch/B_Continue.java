package com.kh.chap03.branch;

public class B_Continue {

	/*
	 * continue : 반복문 안에 기술되는 구문
	 * 			  continue; 구문 실행 시 그 뒤의 구문을 실행하지 않고 곧바로 현재 속해있는 반복문 위로 올라감
	 */
	
	public void method1() {
		// for문으로 1부터 10까지 홀수 출력
		
		/* 방법 1.
		for (int i = 1; i <= 10; i += 2) {
			System.out.print(i + " ");
		}
		*/
		
		/* 방법 2.
		for (int i = 1; i <= 10; i++) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		*/
		
		//방법 3. continue; 사용
		for (int i = 1; i <= 10; i++) { // 1~10
			if (i % 2 == 0) {// i 값이 짝수
				continue; // 건너뛰기 = 반복문 실행 안하고 증감만 실행
			}
			System.out.print(i + " ");
		}
	}
	// ctrl + shift + f : 코드 정렬
	// ctrl + shift + r : 파일명으로 검색
	// ctrl + h : 키워드 검색 파일서치
	
	public void method2() {
		// 1부터 100까지 총 합계. 단, 6의 배수값은 빼고 덧셈연산

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 6 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("1부터 100까지의 합: " + sum);
	}

	public void method3() {
		// 2~9단 출력, 단 3의 배수인 단 빼고 출력

		for (int dan = 2; dan <= 9; dan++) {
			if (dan % 3 == 0) {
				continue;
			}
			System.out.println("======= " + dan + "단 =======");
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, (dan * i));
			}
		}
	}
}

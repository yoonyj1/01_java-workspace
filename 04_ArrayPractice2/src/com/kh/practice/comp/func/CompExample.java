package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {

	public void practice1() {
		//정수 입력받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		//1부터 입력받은 수 짝/홀 나눠서 홀수면 박, 짝이면 수 출력, 양수 아니면 "양수가 아닙니다" 출력
		if (num <= 0) {
			System.out.println("양수가 아닙니다.");
		}
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.print("수");
			} else {
				System.out.print("박");
			}
		}
				
	}

	public void practice2() {
		// 정수 입력받기
		Scanner sc = new Scanner(System.in);

		// 1부터 입력받은 수 짝/홀 나눠서 홀수면 박, 짝이면 수 출력, 양수 아니면 "양수가 아닙니다" 출력
		while (true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();

			if (num <= 0) {
				System.out.println("양수가 아닙니다.");
			} else {
				for (int i = 1; i <= num; i++) {
					if (i % 2 == 0) {
						System.out.print("수");
					} else {
						System.out.print("박");
					}
				}
				sc.close();
				return;
			}
		}
	}
	
	public void practice3() {
		// 문자열 입력받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		// 검색 될 문자 입력받기
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		// 문자 개수 출력
		int count = 0;
		for (int i = 0; i <str.length(); i++) {
			if(ch == str.charAt(i)) {
				count++;
			}
		}
		System.out.println(str + " 안에 포함된 " + ch + " 개수 : " + count);
		
		sc.close();
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("문자열 : ");
			String str = sc.nextLine();
			
			System.out.print("문자 : ");
			char ch = sc.nextLine().charAt(0);
			
			int count = 0;
			for (int i = 0; i <str.length(); i++) {
				if(ch == str.charAt(i)) {
					count++;
				}
			}
			System.out.println("포함된 개수 : " + count);
			
			System.out.print("더 하시겠습니까? (y/n) : ");
			char ans = sc.nextLine().charAt(0);
			
			if (ans == 'n' || ans == 'N') {
				return;
			} else if (ans == 'y' || ans == 'Y') {
				
			} else {
				System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
			}
		}
	}
}

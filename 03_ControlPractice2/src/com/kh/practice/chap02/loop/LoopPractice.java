package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);

		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			} else {
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}
				break;
			}
		}
		sc.close();
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for (int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if (num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			} else {
				for (int i = num; i >= 1; i--) {
					System.out.print(i + " ");
				}
				break;
			}
		}
		sc.close();
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요: ");
		int num = sc.nextInt();
		
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
			if (i != num) {
				System.out.print(i + " + ");
			} else {
				System.out.println(i + " = " + sum);
			}
		}
		sc.close();
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if (num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
		} else {
			for (int i = num2; i <= num1; i++) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();

			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();

			if (num1 < 1 || num2 < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				continue;
			} else if (num1 < num2) {
				for (int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}
				break;
			} else {
				for (int i = num2; i <= num1; i++) {
					System.out.print(i + " ");
				}
				break;
			}
		}
		sc.close();
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		System.out.println("===== " + dan + "단 =====");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, (dan * i));
		}
		sc.close();
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int dan = sc.nextInt();

		if (dan > 9) {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		} else {
			for (int i = dan; i <= 9; i++) {
				System.out.println("===== " + i + "단 =====");
				for (int j = 1; j <= 9; j++) {
					System.out.printf("%d X %d = %d\n", i, j, (i * j));
				}
			}
			sc.close();
		}
	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("숫자 : ");
			int dan = sc.nextInt();

			if (dan > 9) {
				System.out.println("9 이하의 숫자만 입력해주세요.");
				continue;
			} else {
				for (int i = dan; i <= 9; i++) {
					System.out.println("=====" + i + "단 =====");
					for (int j = 1; j <= 9; j++) {
						System.out.printf("%d X %d = %d\n", i, j, (i * j));
					}
				}
				break;
			}
		}
		sc.close();
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("공차 : ");
		int num2 = sc.nextInt();

		//a0 = num1
		//a1 = num1 + num2
		//a2 = num1 + num2 + num2 = num1 + (num2 * 2)
		//...
		//ai = num1 + (num2 * i)
		
		for (int i = 0; i <= 9; i++) {
			if (i == 0) {
				System.out.print(num1 + " ");
			} else {
				int a = num1 + (num2 * i);
				System.out.print(a + " ");
			}
		}
		sc.close();
	}
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			String op = sc.nextLine();

			System.out.print("정수1 : ");
			int num1 = sc.nextInt();

			System.out.print("정수2 : ");
			int num2 = sc.nextInt();

			sc.nextLine();

			int result = 0;
			switch (op) {
			case "+":
				result = num1 + num2;
				System.out.printf("%d + %d = %d\n", num1, num2, result);
				return;

			case "-":
				result = num1 - num2;
				System.out.printf("%d - %d = %d\n", num1, num2, result);
				return;

			case "*":
				result = num1 * num2;
				System.out.printf("%d * %d = %d\n", num1, num2, result);
				return;

			case "/":
				if (num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
					continue;
				} else {
					result = num1 / num2;
					System.out.printf("%d / %d = %d\n", num1, num2, result);
				}
				return;

			case "%":
				result = num1 % num2;
				System.out.printf("%d % %d = %d\n", num1, num2, result);
				return;

			case "exit":
				System.out.println("프로그램을 종료합니다.");
				return;

			default:
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				continue;
			}
		}
	}
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (i >= j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		sc.close();
	}

	public void practice14() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (i <= j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}

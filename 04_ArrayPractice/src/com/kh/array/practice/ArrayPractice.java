package com.kh.array.practice;

import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1);
			// System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice2() {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (arr.length - i);
			//System.out.print(arr[i] + " ");
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("양의 정수 : ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1);
			//System.out.print(arr[i] + " ");
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
	}
	
	public void practice4() {
		String[] fruits = { "사과", "귤", "포도", "복숭아", "참외" };

		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i].equals("귤")) {
				System.out.println(fruits[i]);
			}
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.nextLine();

		char[] str1 = new char[str.length()];

		for (int i = 0; i < str1.length; i++) {
			str1[i] = str.charAt(i);
		}

		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);

		int count = 0;
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : "); // 분리해야함.
		for (int i = 0; i < str1.length; i++) {
			if(str1[i] == ch) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println(ch + " 개수 : " + count);
		/*
		for (int i = 0; i < str1.length; i++) {
			if (ch == str1[i]) {
				System.out.println(str + "에 " + ch + "가 존재하는 위치(인덱스) : " + i + " ");
				count++;
			}
		}
		*/
		sc.close();
	}

	public void practice6() {
		Scanner sc= new Scanner(System.in);
		
		String[] days = {"월", "화", "수", "목", "금", "토", "일"};
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		/*
		if (num > 6 || num < 0) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			System.out.println(days[num] + "요일");
		}
		*/
		
		if (num > 6 || num < 0) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		for (int i = 0; i < days.length; i++) {
			if (num == i) {
				System.out.println(days[i] + "요일");
			}
		}
		sc.close();
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			
			sum += arr[i];
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("총합 : " + sum);
	
		sc.close();
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();

			if (num % 2 == 0 || num < 3) {
				System.out.println("다시 입력하세요");
			} else {
				int[] arr = new int[num];
				for (int i = 0; i < arr.length; i++) {
					if (i <= num / 2) {
						arr[i] = i + 1;
					} else {
						arr[i] = arr[i - 1] - 1;
					}
					System.out.print(arr[i] + " ");
				}
				break;
			}
			sc.close();
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);

		String[] chicks = { "후라이드", "양념", "순살" };

		System.out.print("치킨 이름을 입력하세요: ");
		String chicken = sc.nextLine();

		for (int i = 0; i < chicks.length; i++) {
			if (chicken.equals(chicks[i])) {
				System.out.println(chicks[i] + " 치킨 배달 가능");
				return;
			}
		}
		System.out.println(chicken + "치킨은 없는 메뉴입니다.");

		sc.close();
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함): ");
		String idNum = sc.nextLine();
		
		char[] arr = new char[idNum.length()]; 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = idNum.charAt(i);
		}
		
		/*char[] arrCopy = new char[idNum.length()];
		System.arraycopy(arr, 0, arrCopy, 0, 8);
		*/
		char[] arrCopy = arr.clone();
		
		for (int i = 8; i < arrCopy.length; i++) {
			arrCopy[i] = '*';
		}
		
		for (int i = 0; i < arrCopy.length; i++) {
		System.out.print(arrCopy[i]);
		}
		
		sc.close();
	}

	public void practice11() {
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			int random =(int)(Math.random() * 10 + 1);
			arr[i] = random;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice12() {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice13() {
		
	}
	
	public void practice14() {
		int[] nums = new int[6];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 45 + 1);
		}
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	
	}

	public void practice15() {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] chs = new char[str.length()];
		
		for (int i = 0; i < chs.length; i++) {
			chs[i] = str.charAt(i);
		}
		
		for (int i = 0; i < chs.length; i++) {
			System.out.print("문자열에 있는 문자 : " + chs[i] + " ");
		}
		System.out.println();
		System.out.println("문자 개수 : " + chs.length);
		
		sc.close();
	}
	
	public void practice16() {
		
	}
}

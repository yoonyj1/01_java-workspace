package com.kh.array.practice;

import java.util.Arrays;
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

		// 조건이 맞을 때까지 반복 => while문
		while (true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();

			if (num % 2 == 0 || num < 3) {
				System.out.println("다시 입력하세요");
			} else {
				int[] arr = new int[num];
				
				/*
				 * 5입력시 => {1, 2, 3, 2, 1} 	  - 2번 인덱스까지는 증가 그 이후부터 감소
				 * 7입력시 => {1, 2, 3, 4, 3, 2, 1} - 3번 인덱스까지는 증가 그 이후부터 감소
				 * 9입력시						  - 4번 인덱스까지는 증가 그 이후부터 감소
				 */
				
				/* [강사님 풀이]
				 * int value = 1;
				 * for (int i = 0; i < arr.length; i++){
				 *  arr[i] = value;
				 *  if (i < arr.length / 2) {
				 *  	value++;
				 *  } else {
				 *  	value--;
				 *  }
				 * }
				 * 
				 */
				
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
		}
		sc.close();
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
	
	public void practice9_1() {// 강사님 풀이
		Scanner sc = new Scanner(System.in);
		//배열 생성
		String[] chickens = { "황금올리브", "허니콤보", "뿌링클", "고추바사삭" };
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String chicken = sc.nextLine();
		
		int count = 0;
		for (int i = 0; i < chickens.length; i++) {
			if (chicken.equals(chickens[i])) {
				count++;
			}
		}
		if (count == 1) {
			System.out.println(chicken + " 치킨 배달 가능");
		} else {
			System.out.println(chicken + "치킨은 없는 메뉴입니다.");
		}
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
		// 정수형 배열 생성 및 할당
		int[] arr = new int[10];
		
		// 1~10사이 난수 발생, 초기화
		for (int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random;
		}
		// 배열 전체값 최대값 최소값 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		} 
		
		System.out.println();
		
		//최대값 최소값 구하는 방법
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
	
	public void practice12_1() {
		int[] arr = new int[10];
		
		// 값 대입 (초기화) : 랜덤값(난수) : 1 ~ 10
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		int min = arr[0];
		int max = arr[0];
		
		Arrays.sort(arr); // 배열 오름차순으로 정렬
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		min = arr[0];
		max = arr[arr.length - 1];
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

	public void practice13() {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice13_1() { // 강사님 풀이
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice14() {
		/*
		 * 1부터 45까지 랜덤한 난수 생성 
		 * 중복없이 => 이중 for문 사용 
		 * 오름차순 => arrays.sort() 사용
		 */

		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
				}
			}
		}

		Arrays.sort(lotto);

		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}

	public void practice15() {
		// 문자열 입력받기
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.nextLine();

		// 배열 선언 및 초기화
		char[] chs = new char[str.length()];

		int count = 0; // 개수를 위한 변수

		System.out.print("문자열에 있는 문자 : ");

		for (int i = 0; i < chs.length; i++) {
			chs[i] = str.charAt(i);

			boolean flag = true;

			for (int j = 0; j < i; j++) {
				if (chs[i] == chs[j]) {
					flag = false;
				}
			}

			if (flag) {
				if (i == 0) {
					System.out.print(chs[i]);
				} else {
					System.out.print(", " + chs[i]);
				}
				count++;
			}
		}
		System.out.println();

		System.out.println("문자 개수 : " + count);

		sc.close();
	}
	
	public void practice16() {
		// 입력한 배열 길이만큼 문자열 배열 선언 및 할당
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요. : ");
		int size = sc.nextInt();
		
		sc.nextLine();
		
		String[] arr = new String[size];
		
		String[] arrCopy = arr;
		
		//배열의 인덱스에 넣을 값 입력받아 초기화
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 문자열 : ");
			arr[i] = sc.nextLine();
		}
		
		while (true) {
			System.out.print("더 값을 입력하시겠습니까? (Y/N): ");
			char ans = sc.nextLine().charAt(0);
			
			if (ans == 'y' || ans == 'Y') {
				System.out.print("더 입력하고 싶은 개수 : ");
				int num = sc.nextInt();
				sc.nextLine();

				arrCopy = Arrays.copyOf(arr, arr.length + num);
				
				for (int i = arr.length; i < arrCopy.length; i++) {
					System.out.print((i + 1) + "번째 문자열 : ");
					arrCopy[i] = sc.nextLine();
				}
				
				arr = arrCopy;
				
			} 
			else if (ans == 'n' || ans == 'N') {
				System.out.print("[");
				for (int i = 0; i < arr.length; i++) {
					if (i < (arr.length - 1)) {
						System.out.print(arr[i] + ", ");
					} else if (i == (arr.length - 1)) {
						System.out.print(arr[i]);
					}
				}
				System.out.println("]");
				break;
			}
		}
	}
}

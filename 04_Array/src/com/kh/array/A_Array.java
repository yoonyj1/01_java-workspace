package com.kh.array;

import java.util.Scanner;

public class A_Array {

	//변수 : 하나의 공간에 하나의 값을 담을 수 있음
	//int a = 10, 20, 30, 40; // X
	
	//배열 : 하나의 공간에 여러 개의 값을 담을 수 있는 개념
	//		같은 자료형의 값으로만 담을 수 있음
	//		배열의 각 인덱스 자리에 실제 값이 담김 (인덱스는 0부터 시작)
	
	public void method1() {
		// * 배열을 쓰는 이유
		/*
		 * 변수만 이용하게 되면 -> 대량의 데이터들을 보관하고자 할 때 각각의 변수를 만들어서 따로 관리
		 
		
		//int num1 = 0, 1, 2, 3, 4;
		
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;
	
		
		//출력하고자 할 때도 일일이 출력해야함.
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		
		//총 합계를 구할 때도 일일이 더해줘야함(반복문 활용불가)
		
		*/
		 
		/*
		 * 1. 배열 선언(여러개의 값을 보관할 배열을 만들겠다)
		 * [표현법]
		 * 자료형 배열명[];
		 * 		or
		 * 자료형[] 배열명; -> 일반적으로 사용됨
		 */
		
		//int a; //변수 선언
		
		//int arr[]; //배열 선언
		//int[] arr; //배열 선언 - 오직 int 값만 담을 수 있다.
		
		/*
		 * 2. 배열 할당(크기 지정) -> 몇 개의 값을 보관할 것인지 크기를 지정하는 과정
		 * 	  배열명 = new 자료형[배열크기];
		 */
		//arr = new int[5];
		
		// 배열 선언과 동시에 할당(만듦과 동시에 크기 지정)
		int[] arr = new int[5]; //int[] arr은 Stack메모리, int[5]는 Heap메모리
		
		/*
		 * 3. 값 대입
		 * 		배열명[인덱스] = 값;
		 */
		/*
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		*/
		// 배열 장점 : 반복문 활용 가능
		for (int i = 0; i <= 4; i++) {
			arr[i] = i;
		}
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		*/
		
		for (int i = 0; i <= 4; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(arr); //실제 arr이라는 박스에는 주소값이 담겨있음
	}
	
	public void method2() {
		int i = 10;
		
		//배열 선언과 동시에 할당
		//iArr => 5
		
		int[] iArr = new int[5];
		System.out.println(iArr); //[I@5aaa6d82
		
		double[] dArr = new double[3];
		System.out.println(dArr); //[D@73a28541
		
		/*
		 * 실제 리터럴(바로 보이는 값) 값을 곧바로 담을 수 있는 변수는 일반변수라고 얘기하고
		 * 주소값을 담고 있는 변수는 참조변수(레퍼런스 변수)라고 함.
		 * 
		 * 기본자료형(boolean, char, byte, short, int, long, float, double)으로 선언한 변수
		 * => 실제 리터럴 값을 바로 담는 변수 => 일반변수
		 * 			소문자로 시작함
		 * 그 외 자료형(String, int[], double[], char[], short[], ...)으로 선언된 변수
		 * => 주소값을 담는 변수 => 참조변수
		 */
	}
	
	public void method3() {
		int[] iArr = new int[3]; // 인덱스: 0번 ~ 2번
		double[] dArr = new double[4]; // 인덱스: 0번 ~ 3번
		
		for (int i = 0; i < 3; i++) {
			System.out.println(iArr[i]);
		} // 0 0 0으로 초기 세팅

		System.out.println("===========");
		
		for (int i = 0; i < 4; i++) {
			System.out.println(dArr[i]);
		} // 0.0 0.0 0.0 0.0으로 초기 세팅
		
		// 각 인덱스에 초기화를 하지 않아도 값들이 담겨있음
		//  => Heap이라는 공간에 절대 빈공간이 존재할 수 없기 때문
		// 따라서 공간이 만들어질 때 JVM이 기본적으로 초기화(대입)을 진행
	}
	
	public void method4() {
		int[] arr = new int[10];
		
		/* 
		 * arr[0] = 1;
		 * arr[1] = 2;
		 * arr[2] = 3;
		 * arr[3] = 4;
		 * arr[4] = 5;
		 */
		
		//for 문으로 값 대입 & 출력
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println(arr); // 배열의 자료형 + @ + 주소값 16진수
		System.out.println(arr.hashCode()); // 주소값의 10진수 출력
		System.out.println("배열의 길이: " + arr.length); // 배열의 길이 -> 배열 크기 변경 요청
	}
	
	public void method5() {
		int result = 0; // arr 초기화 값
		
		// 배열에서 볼 수 있는 오류 - 선언만 한 경우 
		//int[] arr; //크기 지정 (할당)을 하지 않은 경우  1
		
		int[] arr = null; // 아무것도 참조하고 있지 않음  2 
		
		//System.out.println(arr); // 1 - 초기화가 안돼있어서 오류발생, 2 - null 출력
		
		//null 가지고 메소드를 호출한다거나 특정 어딘가에 접근하고자 한다면 항상 오류발생
		//System.out.println(arr.hashCode()); //오류발생
		//System.out.println(arr.length ); //오류발생
		//System.out.println(arr[0]);//오류발생
		//NullPointerException 발생
	}
	
	public void method6() {
		int[] arr = new int[5];
		
		/*
		 * arr[0] = 2;
		 * arr[1] = 4;
		 * arr[2] = 6;
		 * arr[3] = 8;
		 * arr[4] = 10;
		 */
		
		/*
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 2 * (i + 1);
		}
		 */
		
		int value = 2;
		for(int  i = 0; i < arr.length; i++) {
			arr[i] = value;
			value += 2;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("arr의 해쉬코드 값: " + arr.hashCode());
		System.out.println("arr의 길이: " + arr.length);
		
		/*
		//ArrayIndexOutOfBoundsException: 배열에 부적절한 인덱스 제시 시 발생(범위에서 벗어난 인덱스를 제시) 
		arr[5] = 12;
		//arr[6] = 14; //ArrayIndexOutOfBoundsException 발생
		 */
		
		// 배열의 가장 큰 단점 
		//	- 한 번 지정된 배열의 '크기'는 변경이 불가
		//	=> 배열의 크기를 변경하고자 하면 다시 만들어야함.
		arr = new int[7];
		System.out.println("변경 후 arr의 해쉬코드 값: " + arr.hashCode());
		System.out.println("변경 후 arr의 길이: "+ arr.length);
		//주소값이 변경 됨 => 새로운 곳이 참조가 됨.
		
		/*
		 * 연결이 끊겨진 기존 배열은 Heap 영역에 떠다님(어디에도 참조되어 있지 않으므로 필요없는 존재 = 지워주는게 좋다.)
		 * => 일정 시간이 지나면 "가비지 컬렉터(GC)"가 알아서 지워줌
		 * => 자바에서의 "자동 메모리 관리" 특징 -> 개발자가 코드작성에만 신경쓸 수 있음
		 */
		
		// 배열을 강제로 삭제시키고자 한다면 -> 연결고리를 끊으면 된다.
		arr = null; //배열명 = null; -> stack에 있는 arr 값은 null로 바뀜
		
		System.out.println(arr);
		
		//arr.length => NullPointerException 발생
	}
	
	public void method7() {
		// 배열 선언, 할당, 초기화를 동시에 하기
		
		//[표현법1]
		int[] arr1 = new int[] {1, 2, 3, 4};
		
		//[표현법2]
		int[] arr2 = {1, 2, 3, 4};
		
		System.out.println(arr1 == arr2); //false => 각각의 변수에 담겨있는 주소값을 비교하기 때문
	}
	
	public void method8() {
		//1. 크기 10짜리 정수 배열 생성 => arr
		int[] arr = new int[10];
		
		//2. 반복문 활용해서 0번 인덱스부터 마지막 인덱스까지 순차적으로 접근하면서 값을 대입
		//		매번 1~100 사이에 발생되는 랜덤값
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		
		//3. 반복문을 활용해서 0번 인덱스부터 마지막 인덱스까지 담겨있는 값 출력
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
	}
	
	public void method9() {
		// 사용자에게 배열의 길이를 입력받아 해당 크기만큼의 문자열 배열 생성
		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 길이: ");
		int size = sc.nextInt();

		sc.nextLine();

		String[] arr = new String[size];

		// 2. 반복문 활용해서 매번 사용자에게 과일명 입력 받아 그 값을 매 인덱스 자리에 대입
		for (int i = 0; i < arr.length; i++) {
			System.out.print("좋아하는 과일 입력 : ");
			arr[i] = sc.nextLine();
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		sc.close();
	}
	
	public void method10() {
		// 사용자에게 문자열을 입력받아 각각의 인덱스에 있는 문자들을 char 배열에 옮겨닮기

		// 1. 사용자에게 문자열 입력받기
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 입력: ");
		String str = sc.nextLine();
		
		System.out.print("찾고자 하는 문자 : ");
		char ch = sc.nextLine().charAt(0);

		// 2. char형 배열 생성 (배열의 크기 == 문자열의 크기)
		char[] arr = new char[str.length()];

		// 3. 반복문 활용해서 해당 문자열에서 각 인덱스별 문자를 char 배열에 값 대입
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}

		// 4. 반복문 활용해서 해당배열의 0~마지막 인덱스 값 출력
		
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
			
			if (arr[i] == ch) {
				count++;
			}
		}
		System.out.println("찾아진 문자 개수 : " + count);
		
		sc.close();
	}
	
	public void method11() {
		// 1. 사용자에게 배열의 길이를 입력 받은 후 해당 크기만큼의 정수 배열 생성
		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 길이: ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		// 2. 반복문 활용해서 0~마지막 인덱스까지 매번 1~100사이의 랜덤값 발생시켜 대입
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);
		}

		// 3. 반복문 활용해서 출력 + 해당 그 인덱스에 담긴 값이 짝수인 값들의 총합 출력
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);

			if (arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println("짝수 값들의 합: " + sum);

		sc.close();
	}
}

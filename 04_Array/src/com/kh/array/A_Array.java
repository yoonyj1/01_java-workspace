package com.kh.array;

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
		int[] arr = new int[5];
		
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
		System.out.println("배열의 길이: " + arr.length); // 배열의 길이
	}
}

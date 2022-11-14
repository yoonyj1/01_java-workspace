package com.kh.chap01_math.run;

public class MathRun { // 클래스 시작

	public static void main(String[] args) { // main 시작
		// java.lang.Math (String, Object) => import 하지 않아도 사용 가능
		
		// 상수 필드
		System.out.println("====== 1. 파이 Math.PI ======");
		System.out.println("파이: " + Math.PI);
		System.out.println();
	
		// 절대값을 알고자 할 때: abs(앱솔루트)
		System.out.println("====== 2. 절대값 Math.abs() ======");
		int num1 = -10;
		System.out.println("절대값: " + Math.abs(num1));
		System.out.println();
		
		// 올림: ceil -> 크거나 같은 정수값
		System.out.println("====== 3. 올림 Math.ceil() ======");
		double num2 = 4.349; // 5
		double num3 = -10.594; // -10
		System.out.println("올림한 결과: " + Math.ceil(num2));
		System.out.println("올림한 결과: " + Math.ceil(num3));
		System.out.println();
		
		// 반올림: round
		System.out.println("====== 4. 반올림 Math.round() ======");
		System.out.println("반올림: " + Math.round(num2));
		System.out.println();
		
		// 버림 : floor : 작거나 같은 정수값
		System.out.println("====== 5. 버림 Math.floor() ======");
		System.out.println("버림: " + Math.floor(num2));
		System.out.println();
		
		// 가장 가까운 정수값 알아낸 후 실수형으로 변환 : rint
		System.out.println("====== 6. Math.rint() ======");
		System.out.println("가장 가까운 정수값: " + Math.rint(num2));
		System.out.println();
		
		// 제곱근(루트)
		System.out.println("====== 7. 제곱근 Math.sqrt() ======");
		System.out.println("4의 제곱근: " + Math.sqrt(4));
		System.out.println();
		
		// 제곱
		System.out.println("====== 8. 제곱 Math.pow( , ) ======");
		System.out.println("2의 10제곱: " + Math.pow(2, 10));
		System.out.println();
		
		// Math m = new Math() // 생성X
		
		/*
		 * * Math 특징
		 *  - 모든 필드는 상수필드, 모든 메소드 static 메소드
		 *  - 생성자 private => 생성 불가
		 */
		
	} // main 끝

} // 클래스 끝

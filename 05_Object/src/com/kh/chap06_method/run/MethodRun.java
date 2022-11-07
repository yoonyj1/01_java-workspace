package com.kh.chap06_method.run;

import java.util.Scanner;

import com.kh.chap06_method.controller.NonStaticMethod;
import com.kh.chap06_method.controller.OverloadingTest;
import com.kh.chap06_method.controller.StaticMethod;

public class MethodRun { // 클래스 시작

	public static void main(String[] args) { // main 시작
		/*
		// ------ NonStaticMethod ------
		NonStaticMethod n = new NonStaticMethod();

		// 1. 매개변수도 없고, 반환값도 없는 메소드 호출
		//n.method1();

		// 2. 매개변수는 없고, 반환값은 있는 메소드 호출
		//n.method2();

		//String str = n.method2();
		//System.out.println(str);

		//System.out.println(n.method2());

		// 3. 매개변수는 있고, 반환값은 없는 메소드 호출
		//n.method3(9, 3);
		//n.method3(10, 0);

		// 4. 매개변수와 반환값 둘 다 있는 메소드 호출
		// char ch = n.method4("lemon", 1);
		// System.out.println(ch);
		// System.out.println(n.method4("lemon", 1));

		// 사용자에게 매개변수를 입력받아서 해당 메소드 호출
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 입력: ");
		String str = sc.nextLine();

		System.out.print("인덱스 입력: ");
		int index = sc.nextInt();

		// 유효성 검사
		// index값이 0이상 문자열 길이보다 작을 때만 method4 실행

		if(index >= 0 && index < str.length()) {
			System.out.println("결과: " + n.method4(str, index));
		} else {
			System.out.println("인덱스 값이 부적절합니다.");
		}
		 */

		// ------ StaticMethod ------
		//StaticMethod.method1(); // 생성 없이 호출 가능
		// StaticMethod.method2();
		//System.out.println(StaticMethod.method2()); // return값은 출력하지 않으면 보이지 않는다.
		//StaticMethod.method3("ㄱㄴㄷ");
		//System.out.println(StaticMethod.method4("apple", "appl"));
		
		// ------- OverloadingTest -------
		OverloadingTest ot = new OverloadingTest();
		ot.test();
		ot.test(10);
		ot.test(10, "ㄱㄴㄷ");
		ot.test("ㄱㄴㄱ", 10);
		ot.test("ㄴㄷㄹ");
	} 

} // 클래스 끝

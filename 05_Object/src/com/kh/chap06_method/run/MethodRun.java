package com.kh.chap06_method.run;

import java.util.Scanner;

import com.kh.chap06_method.controller.NonStaticMethod;

public class MethodRun { // 클래스 시작

	public static void main(String[] args) { // main 시작
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
		
		System.out.println(n.method4(str, index));
	} 

} // 클래스 끝

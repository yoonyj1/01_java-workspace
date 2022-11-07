package com.kh.chap06_method.run;

import com.kh.chap06_method.controller.NonStaticMethod;

public class MethodRun { // 클래스 시작

	public static void main(String[] args) { // main 시작
		// ------ NonStaticMethod ------
		NonStaticMethod n = new NonStaticMethod();
		
		// 1. 매개변수도 없고 반환값도 없는 메소드 호출
		n.method1();
		
		// 2. 매개변수는 없고 반환값은 있는 메소드 호출
		//n.method2();
		
		String str = n.method2();
		//System.out.println(str);
		
		//System.out.println(n.method2());
		
		// 3. 매개변수는 있고, 반환값은 없는 메소드 호출
		n.method3(9, 3);
		n.method3(10, 0);
		
		// 4. 매개변수와 반환값 둘 다 있는 메소드 호출
		char ch = n.method4("lemon", 1);
		System.out.println(ch);
	} 

} // 클래스 끝

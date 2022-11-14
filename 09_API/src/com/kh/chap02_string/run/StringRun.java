package com.kh.chap02_string.run;

import com.kh.chap02_string.controller.A_StringPoolTest;
import com.kh.chap02_string.controller.B_StringMethodTest;
import com.kh.chap02_string.controller.C_StringTokenizerTest;

public class StringRun { // 클래스 시작

	public static void main(String[] args) { // main 시작

		A_StringPoolTest a = new A_StringPoolTest();
		
		//a.method1();
		//a.method2();
		
		B_StringMethodTest b = new B_StringMethodTest();
		b.method1();
		
		C_StringTokenizerTest c = new C_StringTokenizerTest();
		//c.method();
	} // main 끝

} // 클래스 끝

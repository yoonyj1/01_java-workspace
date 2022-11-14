package com.kh.chap02_string.controller;

public class B_StringMethodTest { // 클래스 시작

	public void method1() { // method1 시작
		String str1 = "Hello World";
		System.out.println("====== 1. 문자열.chatAt(int index) : char ======");
		// 메소드명(매개변수) : 반환형

		// 1. 문자열.chatAt(int index) : char
		// 문자열에서 전달받은 index 위치의 문자만을 추출해서 return

		char ch = str1.charAt(3);
		System.out.println("ch: " + ch);

		// 2. 문자열.concat(String str) : String
		// 문자열과 전달된 또 다른 문자열을 하나로 합쳐서 새로운 문자열 return
		System.out.println("====== 2. 문자열.concat(String str) : String ======");

		// 방법1. concat
		String str2 = str1.concat("!!!");
		System.out.println("str2: " + str2);

		// 방법2.
		String str3 = str1 + "!!!";
		System.out.println("str3: " + str3);

		System.out.println("str2와 str3가 일치합니까? " + (str2 == str3));
		// StringPool에서 같은 글자면 같은 주소가 아닌지 => StringPool에 들어가는 게 아닌 new로 heap에 새로운 영역에 주소값이 생김
		// str3만 StringPool에 있음
		
		// 3. 문자열.equals() : boolean
		// 문자열과 전달 된 또다른 문자열 가지고 주소값 비교가 아닌 실제 문자열 가지고 동등비교
		System.out.println("====== 3. 문자열.equals() ======");
		System.out.println("str2와 str3가 일치합니까?(equals) " + str2.equals(str3));
		
		// 4. 문자열.contains(CharSequence s) : boolean
		System.out.println("====== 4. 문자열.contains(CharSequence s) ======");
		System.out.println("str1에 Hello 문자열이 포함되어 있습니까?: " + str1.contains("Hello"));
		System.out.println("str1에 bye 문자열이 포함되어 있습니까?: " + str1.contains("bye"));
		
		// 5. 문자열.length() : int
		System.out.println("====== 5. 문자열.length() ======");
		System.out.println("str1의 길이: " + str1.length());
		
		

	} // method1 끝

} // 클래스 끝

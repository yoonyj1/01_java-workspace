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
		
		// 6. 문자열.substring(int beginIndex) : String => 문자열의 beginIndex 위치에서 끝까지의 문자열 출력
		//	  문자열.substring(int beginIndex, int endIndex) : String => 문자열의 beginIndex 위치에서 endIndex - 1까지의 문자열 출력
		System.out.println("====== 6. 문자열.substring() ======");
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(3, 7));
		
		// ** Quiz
		// Hello World
		// 012345678910
		// 1. str1에서 Worl만 추출 + concat()으로 ! 붙여서 => Worl!
		// 2. contains 함수를 이용해서 !가 포함돼있는지 여부 => str0에 !가 포함돼있습니까 : true
		
		System.out.println("====== 퀴즈 ======");
		String str0 = str1.substring(6, 10).concat("!"); // 함수 연달아서 사용가능
		// System.out.println(str0);
		System.out.println("str0에 !가 포함돼있습니까: " + str0.contains("!"));

		// 7. 문자열.replace(char oldChar, char newChar) : String
		//		문자열 oldChar 문자들을 newChar로 변환한 새 문자열 return
		
		// str1 = Hello World
		System.out.println("====== 7. 문자열.replace() ======");
		
		String str4 = str1.replace('l', 'c'); // Hello World에서 l을 다 c로 바꿈 => Hecco Worcd
		System.out.println("str4: " + str4);
		System.out.println("str1이 변경됐나?: " + str1); // 원래 문자열은 변경되지 않음
		
		// 8. 문자열.toUpperCase()
		// 문자열을 다 대문자로 변경한 새 문자열 리턴
		// 문자열.toLowerCase() : 문자열을 다 소문자로 변경
		System.out.println("====== 8-1. 문자열.toUpperCase() ======");
		String str5 = str1.toUpperCase();
		System.out.println("str5: " + str5);
		
		System.out.println("====== 8-2. 문자열.toLowerCase() ======");
		System.out.println("Lower: " + str5.toLowerCase());
		
		/*
		 * System.out.print("계속 하시겠습니까 (y/n)");
		 * char ch = sc.nextLine().charAt(0);
		 * 
		 * if(ch == 'N' || 'n') {
		 * 	// 프로그램 종료
		 *  }
		 *  
		 *  System.out.print("계속 하시겠습니까 (y/n)");
		 * 	char ch = sc.nextLine().toUpperCase().charAt(0); // Y or N
		 * 	char ch = sc.nextLine().charAt(0).toUpperCase(); // 안됨 => String 클래스에서 제공하는 함수이기 때문에
		 * 
		 * if(ch == 'N') {
		 * 	// 프로그램 종료
		 *  }
		 */
		
		// 9. 문자열.trim() : String : 문자열 앞뒤 공백을 제거시킨 새 문자열 리턴
		System.out.println("====== 9. 문자열.trim() ======");
		String str6 = "   Ja   Va   ";
		System.out.println("str6: " + str6.trim());
		
		// 10. 문자열.toCharArray() : char[]
		System.out.println("====== 10. 문자열.toCharArray() ======");
		char[] arr = str1.toCharArray();
		System.out.println(arr[3]);

		// 11. String.valueOf(char[] data) : String
		System.out.println("====== 11. String.valueOf(char[] data) ======");
		System.out.println(String.valueOf(arr));
	
	} // method1 끝

} // 클래스 끝

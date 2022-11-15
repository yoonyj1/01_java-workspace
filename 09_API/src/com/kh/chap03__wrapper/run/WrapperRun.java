package com.kh.chap03__wrapper.run;

public class WrapperRun {

	public static void main(String[] args) {

		/*
		 * Wrapper 클래스
		 * => 기본자료형을 객체로 포장해줄 수 있는 클래스
		 * 
		 * 		기본자료형 <-------> Wrapper 클래스
		 * 		boolean				Boolean
		 * 		char				Character
		 * 		byte				Byte
		 * 		short				Short
		 * 		int					integer
		 * 		long				Long
		 * 		float				Float
		 * 		double				Double
		 * 
		 * => 기본자료형을 객체로 취급해야하는 경우
		 * 		- 메소드를 호출해야할 때
		 * 		- 메소드의 매개변수로 기본자료형이 아닌 객체타입만이 요구될 때
		 * 		- 다형성을 적용시키고 싶을 때
		 */
		
		// Boxing: 기본자료형 => Wrapper 클래스 자료형
		int num1 = 10;
		int num2 = 15;
		
		// System.out.println(num1 == num2);
		
		// 1. 객체 생성 구문을 통한 방법
		System.out.println("===== 1. 객체 생성 구문을 통한 방법 =====");
		Integer i1 = new Integer(num1);
		Integer i2 = new Integer(num2);
		
		System.out.println(i1 == i2);
		
		// 객체화 시키면 메소드 호출 가능
		System.out.println(i1.equals(i2));
		System.out.println(i1.compareTo(i2)); // 두 값을 비교해서 앞쪽이 크면 1, 뒤쪽이 크면 -1, 같으면 0
		
		// 2. 객체생성 하지 않고 곧바로 대입하는 방법(AutoBoxing)
		System.out.println("===== 2. 객체생성 하지 않고 곧바로 대입하는 방법(AutoBoxing) =====");
		
		Integer i3 = num1;
		System.out.println(i3);
		
		// 객체생성을 통해서 반드시 변환해야 하는 경우 => 숫자로만 된 문자열을 Integer 타입으로
		// Integer i4 = "123";
		Integer i4 = new Integer("123");
		System.out.println(i4);
		
		// UnBoxing: Wrapper 클래스 자료형 -> 기본자료형
		System.out.println("===== UnBoxing =====");
		
		// 1. 해당 Wrapper 클래스에서 제공하는 xxxValue() 메소드를 통해 
		int num3 = i3.intValue();
		int num4 = i4.intValue();
		
		// 2. 메소드 사용하지 않고 바로 대입하는 방법(AutoUnBoxing)
		int num5 = i1;
		System.out.println("-----------------------------------");
		
		// 사용하는 이유
		// 개발 할 때 값을 입력하면 무조건 문자열로 날라옴.
		
		// 기본자료형 <--> String
		String age = "19";
		String str1 = "10";
		String str2 = "15.3";
		
		System.out.println(str1 + str2); // 문자열 + 문자열 = 문자열
		
		// 1. String --> 기본자료형
		// 	"10"			10
		//	"15.3"			15.3
		// 해당 Wrapper.parseXXX() 사용
		
		int i = Integer.parseInt(str1); // "10" -> 10
		double d = Double.parseDouble(str2); // "15.3" -> 15.3
		
		System.out.println(i + d);
	}

}

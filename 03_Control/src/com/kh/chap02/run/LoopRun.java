package com.kh.chap02.run;

import com.kh.chap02.loop.A_For;
import com.kh.chap02.loop.B_While;
import com.kh.chap02.loop.C_DoWhile;

public class LoopRun {

	public static void main(String[] args) {

		A_For a = new A_For();
		//a.method1(); //"안녕하세요"를 5번 반복해서 출력
		//a.method2(); //1부터 5까지 출력
		//a.method3(); //5 4 3 2 1
		//a.method4(); //1부터 10까지 홀수만 출력
		//a.method5(); // 1 2 3 4 5 6 7 8 9 10 for문 고정
		//a.method6(); // 1부터 10까지 총합계
		//a.method7(); //사용자에게 값을 입력받아 1부터 입력받은 수까지의 합계 출력
		//a.method8(); //1에서부터 어떤 랜덤값(1~10 사이의 랜덤값)의 까지에 합계
		//a.method9(); // 인덱스 별 문자 출력
		//a.method10(); // 사용자에게 문자열을 입력받아서 (str 변수에 대입)
		//a.method11(); //구구단 출력
		//a.method12(); //사용자에게 단수를 입력받아 구구단 출력
		//a.method13(); // 2부터 9까지 랜덤 단 발생시켜서 구구단
		//a.method14(); //중첩 for문
		//a.method15(); // *출력
		//a.method16(); // *출력 2
		//a.method17(); //구구단 2단부터 9단까지 출력
		//a.method18(); //무한반복문
		
		B_While b = new B_While();
		//b.method1(); //안녕하세요 5번 출력
		//b.method2(); // 1 2 3 4 5
		//b.method3(); //1에서부터 10까지 출력 , 1 3 5 7 9
		//b.method4(); //1부터 랜덤값(1~100)까지의 합계
		//b.method5(); // a.method10 while문으로 바꾸기
		
		C_DoWhile c = new C_DoWhile();
		//c.method1();
		//c.method2(); // 1 2 3 4 5
		c.method3(); //1부터 사용자가 입력한 수까지의 총 합계
	}

}

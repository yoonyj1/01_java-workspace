package com.kh.chap03.run;

import com.kh.chap03.branch.A_Break;
import com.kh.chap03.branch.B_Continue;

public class BranchRun {

	public static void main(String[] args) {

		A_Break a = new A_Break();
		//a.method1(); 
		//랜덤값(1~100) 발생시키고 그 랜덤값 출력 (이 과정 반복)
		//단, 발생된 랜덤값이 3의 배수일 경우 반복문 빠져나오기
		//a.method2();
		// 사용자에게 문자열을 입력받아서 해당 문자열의 길이 출력(무한반복)
		// 단, 사용자가 입력한 문자열이 "exit"일 경우 반복문탈출
		//a.method3(); // 사용자에게 단(2~9)을 입력받아 해당 단을 출력
		
		B_Continue b = new B_Continue();
		//b.method1(); // for문으로 1부터 10까지 홀수 출력
		//b.method2(); // 1부터 100까지 총 합계. 단, 6의 배수값은 빼고 덧셈연산
		b.method3(); //2~9단 출력, 단 3의 배수인 단 빼고 출력
	}

}

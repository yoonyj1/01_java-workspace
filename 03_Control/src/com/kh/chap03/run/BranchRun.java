package com.kh.chap03.run;

import com.kh.chap03.branch.A_Break;

public class BranchRun {

	public static void main(String[] args) {

		A_Break a = new A_Break();
		//a.method1(); 
		//랜덤값(1~100) 발생시키고 그 랜덤값 출력 (이 과정 반복)
		//단, 발생된 랜덤값이 3의 배수일 경우 반복문 빠져나오기
		a.method2();
		// 사용자에게 문자열을 입력받아서 해당 문자열의 길이 출력(무한반복)
		// 단, 사용자가 입력한 문자열이 "exit"일 경우 반복문탈출
	}

}

package com.kh.exception.run;

import com.kh.exception.controller.A_UncheckedException;
import com.kh.exception.controller.B_CheckedException;

public class ExceptionRun {

	public static void main(String[] args) {

		/*
		 * * 에러종류
		 *  - 시스템 에러: 컴퓨터의 오작동으로 발생하는 에러 => 스스로 해결 안됨
		 *  - 컴파일 에러: 소스코드 문법상 오류 => 빨간줄로 오류로 알려줌 (개발자의 실수)
		 *  - 런타임 에러: 코드 상으로는 문제가 없는데 프로그램 실행 중 발생하는 에러 (사용자의 실수 or 개발자의 실수) => 예외처리
		 *  
		 *  - 논리 에러: 문법적으로 문제없고 실행했을 때도 문제는 없지만 프로그램 의도상 맞지 않는 것 
		 *  
		 * 시스템 에러를 제외한 컴파일 에러, 런타임 에러, 논리에러와 같은 비교적 덜 심각한 것들 => 예외(Exception)
		 * 
		 * "예외"가 "발생"했을 경우 "처리" 하는 방법 => "예외처리"
		 * 
		 * * 예외처리를 하는 목적
		 *  - 예외처리를 하지 않고 그대로 예외가 발생되는 경우 프로그램이 비정상적으로 종료될 수 있음
		 *  
		 * * 예외처리 방법
		 *  1. try - catch문 (try - with - resource)
		 *  2. throws를 이용 (떠넘기기 == 위임하기)
		 */
		
		A_UncheckedException a = new A_UncheckedException();
		//a.method1();
		//a.method2();
		//a.method3();
		
		B_CheckedException b = new B_CheckedException();
		b.method1();
	}

}

package com.kh.run;

import com.kh.array.A_Array;
import com.kh.array.B_ArrayCopy;

public class ArrayRun {

	public static void main(String[] args) {

		A_Array a = new A_Array();
		//a.method1();
		//a.method2();
		//a.method3();
		//a.method4(); //for 문으로 값 대입 & 출력
		//a.method5(); // 배열에서 볼 수 있는 오류 - 선언만 한 경우
		//a.method6(); // 배열에서 볼 수 있는 오류 - 인덱스 값을 넘겨서 값을 넣은 경우
		//a.method7(); // 배열 선언, 할당, 초기화를 동시에 하기
		//a.method8();
		//a.method9(); // 사용자에게 배열의 길이를 입력받아 해당 크기만큼의 문자열 배열 생성
		//a.method10(); // 사용자에게 문자열을 입력받아 각각의 인덱스에 있는 문자들을 char 배열에 옮겨닮기
		//a.method11();
		//a.remind();
		
		B_ArrayCopy b = new B_ArrayCopy();
		//b.method1(); // 배열 복사
		//b.method2(); // 깊은 복사 방법1. for문 이용한 복사
		//b.method3(); // 깊은 복사 방법2. System.arraycopy()
		//b.method4(); // 깊은 복사 방법3. Arrays.copyOf()**
		b.method5();  // 깊은 복사 방법4. clone() 메소드 이용한 복사
	} 

}

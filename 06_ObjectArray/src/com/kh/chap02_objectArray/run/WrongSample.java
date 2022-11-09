package com.kh.chap02_objectArray.run;

import com.kh.chap02_objectArray.model.vo.Phone;

public class WrongSample { // 클래스 시작

	public static void main(String[] args) { // main 시작

		// 1. NullPointerException
		/*
		Phone[] arr = new Phone[3];

		for (int i = 0; i <= arr.length; i++) { 
			System.out.println(arr[i].getName());
		}
		// 잘못된 부분: 객체배열의 각 인덱스 값에 담긴 값이 null인 상태에서 메소드를 호출하려고 했기 때문에 에러발생
		// 조치내용: 객체배열을 만든 후 각 인덱스 별로 객체 생성을 진행해야함. 
		 */

		// 2. ArrayIndexOutOfBoundsException
		Phone[] arr = new Phone[3];

		arr[0] = new Phone();
		arr[1] = new Phone();
		arr[2] = new Phone();	

		// for (int i = 0; i <= arr.length; i++) { 
		for (int i = 0; i < arr.length; i++) { 
			System.out.println(arr[i].getName());
		}
		// 잘못된 부분: 배열의 적절한 인덱스 범위를 벗어났기 때문에
		// 조건식으로 i <= arr.length로 제시돼있음.
		// 조치내용: i < arr.length (i < 배열의 길이)로 수정
	} // main 끝

} // 클래스 끝

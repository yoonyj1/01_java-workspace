package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {

		User u1 = new User();
		System.out.println(u1.information());
		
		// 각 필드에 JVM의 초기값이 담겨있음 (null, 0 ,  )
		
		// 1. 객체 생성 후 값을 대입하는 방법
		//회원가입시 필수 입력사항만 받는다면?
		/*
		u1.setUserId("user01");
		u1.setUserPwd("1q2w3e4r!");
		u1.setUserName("가나다");
		*/

		// 2. 매개변수 3개짜리 생성자로 객체 생성
		User u2 = new User("user02", "pwd02", "ㄱㄴㄷ");
		
		System.out.println(u2.information());
		
		// 3. 매개변수 전체 필드 넣어서 생성자 생성 후 객체 생성
		User u3 = new User("user3", "qwer1", "ㄴㄷㄹ", 222, 'M');
		System.out.println(u3.information());
		
		// setter를 안 만들어도 되는지 => 특정 정보만 바꿔야할 일이 있기때문에 만들어야함
		
		u2.setUserName("ㄱㄴㄷㄹ");
		System.out.println(u2.information());
		
		// getter는 => 특정 정보만을 찾아야할 일이 있을 수 있기에 만들어야함.
		// pwd를 까먹은 경우에는 pwd만 보여줘야함
		System.out.println(u2.getUserPwd());
	}

}

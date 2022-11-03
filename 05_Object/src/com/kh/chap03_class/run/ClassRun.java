package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;

public class ClassRun {

	public static void main(String[] args) {

		// 객체 생성
		Person y = new Person();
		
		/*
		System.out.println(y.getId());
		System.out.println(y.getAge());
		System.out.println(y.getGender());
		*/
		
		// 생성 후에 필드에 담긴 값을 곧바로 알아보면
		// JVM이 초기화(값 세팅)까지 진행해줬음.
		
		y.setId("yoonyj1");
		y.setPwd("1q2w3e4r!!");
		y.setName("윤여진");
		y.setAge(288);
		y.setGender('M');
		y.setPhone("010-1234-5679");
		y.setEmail("yoonyj1@naver.com");
		
		System.out.println("아이디: " + y.getId());
		System.out.println("비밀번호: " + y.getPwd());
		System.out.println("이름: " + y.getName());
		System.out.println("나이: " + y.getAge());
		System.out.println("성별: " + y.getGender());
		System.out.println("전화번호: " + y.getPhone());
		System.out.println("이메일: " + y.getEmail());
	}

}

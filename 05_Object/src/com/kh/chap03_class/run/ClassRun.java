package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;
import com.kh.chap03_class.model.vo.Product;

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
		
		System.out.println("======= 메소드 만들고 난 후 ========");
		System.out.println(y.information());
		
		System.out.println();
		System.out.println("=========================================");
		System.out.println();
		
		
		// 첫번째 방법: 기본생성자로 생성 후 setter 메소드 이용해서 값 초기화
		/*
		Product p1 = new Product();
		
		p1.setpName("갤럭시");
		p1.setPrice(1_200_000);
		p1.setBrand("삼성");
		*/
		
		// 두번째 방법: 매개변수 생성자로 생성과 동시에 값 초기화
		Product p1 = new Product("갤럭시", 1200000, "삼성");
		p1.setPrice(1000000);
		
		/*
		Product p2 = new Product();
		
		p2.setpName("아이폰");
		p2.setPrice(1_300_000);
		p2.setBrand("애플");
		*/
		
		Product p2 = new Product("아이폰", 1300000, "애플");
		
		// pName : xxx, price : xxx, brand : xxxx
		/*
		System.out.printf("pName: %s, price: %d, brand: %s\n", p1.getpName(), p1.getPrice(), p1.getBrand());
		System.out.printf("pName: %s, price: %d, brand: %s\n", p2.getpName(), p2.getPrice(), p2.getBrand());
		*/
		
		System.out.println("pName: " + p1.getpName() + ", price: " + p1.getPrice() + ", brand: " + p1.getBrand());
		System.out.println("pName: " + p2.getpName() + ", price: " + p2.getPrice() + ", brand: " + p2.getBrand());
		
		System.out.println("======= 메소드 만들고 난 후 ========");
		System.out.println(p1.information());
		System.out.println(p2.information());
		
		System.out.println("==========과제=========");
		Person p3 = new Person();
		System.out.println(p3.information());
		
		Person p4 = new Person("ㄱㄴㄷ", "1q2w3e34", 22, "010-1234-5678");
		System.out.println(p4.information());
		
		Person p5 = new Person("id1", "pwd1", "nam", 23, 'M', "010-5678-1234", "yyyy@naver,com");
		System.out.println(p5.information());
	}

}

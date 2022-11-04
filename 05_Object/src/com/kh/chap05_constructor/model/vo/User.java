package com.kh.chap05_constructor.model.vo;

public class User { // 클래스 영역 시작
	// 필드부 선언
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	/*
	 * * 생성자
	 * [표현법] []: 생략가능
	 * public 클래스명([매개변수1, 매개변수2,...]) {
	 * 
	 * }
	 * 
	 * 생성자가 필요한 이유 (생성자를 작성하는 목적)
	 *  1. 객체를 생성해주기 위한 목적
	 *  
	 *  * 생성자 작성 시 유의사항
	 *  1. 반드시 생성자명은 클래스명과 동일해야함. (대소문자 구분)
	 *  2. 반환형이 존재하지 않음 (만일 반환형 사용 시 메소드로 인식해버림)
	 *  
	 */
	
	public User() { 
		// 기본생성자 : 매개변수가 없는 생성자
		// 단지 객체 생성만을 목적으로 할 때 사용
		System.out.println(" ㅎㅇ ");
	}
	
	// 매개변수 생성자
	// 객체 생성과 동시에 전달값들 매개변수로 받아서 해당 각 필드에 초기화할 목적
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	
	public User(String userId, String userPwd, String userName, int age, char gender) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.age = age;
		this.gender = gender;
	}
	
	// 메소드부
	// getter setter
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userid) {
		this.userId = userid;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String information() {
		return "ID: " + userId + ", Password: " + userPwd + ", Name: " + userName + ", age: " + age + ", gender: " + gender;
	}
	
} // 클래스 영역 끝

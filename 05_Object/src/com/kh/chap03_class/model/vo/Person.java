package com.kh.chap03_class.model.vo;

public class Person {

	// 필드선언
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	//생성자 만들기
	public Person() {
		System.out.println("Person 객체가 생성됐습니다.");
	}
	
	public Person(String name, String pwd, int age, String phone) {
		this.name = name;
		this.pwd = pwd;
		this.age = age;
		this.phone = phone;
	}
	
	public Person(String id, String pwd, String name, int age, char gender, String phone, String email) {
		this(name, pwd, age, phone);
		this.id = id;
		this.gender = gender;
		this.email = email;
	}
	
	// setter 만들기 (7개)
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	// getter 만들기(7개)
	
	public String getId() {
		return id;
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String information() {
		return "id: " + id + ", pwd: " + pwd + ", name: " + name + ", age: " + age + ", gender: " + gender + ", phone: " + phone + ", email: " + email;
	}
}



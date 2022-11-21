package com.kh.chap02_set.part01_hashSet.model.vo;

public class Student { // 클래스 시작
	// 필드부
	private String name; 
	private int age;
	private int score;
	
	// 생성자부
	public Student() {}

	public Student(String name, int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}

	// 메소드부
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
	

} // 클래스 끝

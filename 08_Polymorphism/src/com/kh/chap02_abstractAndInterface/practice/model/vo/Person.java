package com.kh.chap02_abstractAndInterface.practice.model.vo;

public abstract class Person implements Basic {

	// 필드부
	private String name;
	private double weight;
	private int health;
	
	// 생성자부
	public Person() {}

	public Person(String name, double weight, int health) {
		this.name = name;
		this.weight = weight;
		this.health = health;
	}

	// 메소드부
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	@Override
	public String toString() {
		return "name=" + name + ", weight=" + weight + ", health=" + health;
	}
	
}

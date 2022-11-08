package com.kh.chap03_class.run;


import com.kh.chap03_class.model.vo.Person;

public class ObjectArrayrun {

	public static void main(String[] args) {

		Person[] pers = new Person[3];
		
		pers[0] = new Person("personId1", "personPwd1", "person1", 28, 'M', "01012345678", "person1@gmail.com");
		pers[1] = new Person("personId2", "personPwd2", "person2", 29, 'F', "01023456789", "person2@naver.com");
		pers[2] = new Person("personId3", "personPwd3", "person3", 30, 'M', "01034567890", "person3@gmail.com");
		
		for (int i = 0; i < pers.length; i++) {
			System.out.println("per[" + i + "]: " + pers[i].information());
		}
	}

}

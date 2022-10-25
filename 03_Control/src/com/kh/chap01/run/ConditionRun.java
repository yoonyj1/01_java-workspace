package com.kh.chap01.run;

import com.kh.chap01.condition.A_If;
import com.kh.chap01.condition.B_Switch;

public class ConditionRun {

	public static void main(String[] args) {

		A_If a = new A_If();
		//a.method1(); //단독 if 문
		//a.method2(); //if - else문
		//a.method3(); //if - else if - else문
		//a.method4();
		//a.method5();
		//a.method6();
		//a.method7(); //if문 중첩사용
		
		B_Switch b = new B_Switch();
		//b.method1(); //switch 문
		b.method2();
	}

}

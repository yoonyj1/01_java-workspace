package com.kh.chap01.run;

import com.kh.chap01.condition.A_If;

public class ConditionRun {

	public static void main(String[] args) {

		A_If a = new A_If();
		//a.method1(); //단독 if 문
		//a.method2(); //if - else문
		a.method3(); //if - else if - else문
	}

}
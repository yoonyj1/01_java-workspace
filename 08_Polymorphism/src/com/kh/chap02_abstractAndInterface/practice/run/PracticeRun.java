package com.kh.chap02_abstractAndInterface.practice.run;

import com.kh.chap02_abstractAndInterface.practice.model.vo.Baby;
import com.kh.chap02_abstractAndInterface.practice.model.vo.Basic;
import com.kh.chap02_abstractAndInterface.practice.model.vo.Mother;

public class PracticeRun {

	public static void main(String[] args) {

		Basic mom = new Mother("ㅇㅁ", 50, 70, "출산");
		Basic baby = new Baby("ㅇㄱ", 5.0, 70);
		
		System.out.println(baby);
		System.out.println(mom);
		
		mom.eat();
		baby.eat();
		
		mom.sleep();
		baby.sleep();
		
		System.out.println("===========================");
		
		System.out.println(baby);
		System.out.println(mom);
		
	}

}

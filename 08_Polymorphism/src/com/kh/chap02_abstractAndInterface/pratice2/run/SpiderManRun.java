package com.kh.chap02_abstractAndInterface.pratice2.run;

import com.kh.chap02_abstractAndInterface.pratice2.model.vo.Marvel;
import com.kh.chap02_abstractAndInterface.pratice2.model.vo.SpiderMan;

public class SpiderManRun {

	public static void main(String[] args) {

		SpiderMan m = new Marvel("스파이더맨(톰 홀랜드)", "Marvel", "벌쳐", "홈커밍", 2017);
		
		System.out.println(m);
		System.out.println(m.villain());
		System.out.println(m.productionYear());
	}

}

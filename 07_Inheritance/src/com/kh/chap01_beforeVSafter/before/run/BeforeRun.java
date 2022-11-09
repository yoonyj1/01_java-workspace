package com.kh.chap01_beforeVSafter.before.run;

import com.kh.chap01_beforeVSafter.before.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.before.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.before.model.vo.Tv;

public class BeforeRun { // 클래스 시작

	public static void main(String[] args) { // main 시작

		// Desktop 객체 생성
		// brand, pCode, pName, price, allInone
		Desktop d = new Desktop("삼성", "d-01", "짱짱데스크탑", 2000000, true);
		
		// Tv 객체 생성
		// brand, pCode, pName, price, inch
		Tv t = new Tv("LG", "t-01", "겁나얇은티비", 3500000, 25);
		
		// SmartPhone 객체 생성
		// brand, pCode, pName, price, mobileAgency
		SmartPhone s = new SmartPhone("애플", "s-01", "아이폰", 1300000, "KT");
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		
	} // main 끝

} // class 끝

package com.kh.chap00_myInharitance.run;

import com.kh.chap00_myInharitance.model.vo.AppleWacth;
import com.kh.chap00_myInharitance.model.vo.IPad;
import com.kh.chap00_myInharitance.model.vo.IPhone;

public class MyInharitanceRun {

	public static void main(String[] args) {

		System.out.println("============== 아이폰 ==============");
		IPhone[] iph = new IPhone[4];
		iph[0] = new IPhone("아이폰14", "", 1250000, 15.4, 172);
		iph[1] = new IPhone("아이폰14", "plus", 1350000, 17.0, 203);
		iph[2] = new IPhone("아이폰14", "Pro", 1550000, 15.5, 206);
		iph[3] = new IPhone("아이폰14", "Pro max", 1750000, 17.0, 240);
		
		for (IPhone i : iph) {
			System.out.println(i.information());
		}
		System.out.println("============== 아이패드 ==============");
		
		IPad[] ip = new IPad[6];
		ip[0] = new IPad("아이패드Pro", "6세대" , 1729000, 32.8, 682, false, "펜슬(2세대), 키보드");
		ip[1] = new IPad("아이패드Pro", "6세대" , 1969000, 32.8, 684, true, "펜슬(2세대), 키보드");
		ip[2] = new IPad("아이패드Air", "5세대" , 929000, 27.5, 461, false, "펜슬(2세대), 키보드");
		ip[3] = new IPad("아이패드Air", "6세대" , 1169000, 27.5, 462, true, "펜슬(2세대), 키보드");
		ip[4] = new IPad("아이패드", "10세대" , 679000, 27.5, 477, false, "펜슬(1세대), 키보드");
		ip[5] = new IPad("아이패드", "10세대" , 919000, 27.5, 481, true, "펜슬(1세대), 키보드");
		
		for (IPad ipa : ip) {
			System.out.println(ipa.information());
		}
		System.out.println("============== 애플워치 ==============");
		AppleWacth[] w = new AppleWacth[5];
		w[0] = new AppleWacth("애플워치", "Series 8", 599000, 45, 39.9, false);
		w[1] = new AppleWacth("애플워치", "Series 8", 749000, 45, 39.9, true);
		w[2] = new AppleWacth("애플워치", "SE", 359000, 44, 40, false);
		w[3] = new AppleWacth("애플워치", "SE", 429000, 44, 40, true);
		w[4] = new AppleWacth("애플워치", "Ultra", 1149000, 49, 61.3, true);
		
		for (AppleWacth aw : w) {
			System.out.println(aw.information());
		}
	}

}

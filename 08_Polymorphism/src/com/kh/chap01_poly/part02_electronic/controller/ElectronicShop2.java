package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;

// 다형성 개념 적용했을 때
public class ElectronicShop2 {
	// 용산전자상가에 있는 가게
	// 3개의 제품을 마련하는 자리 만들기 => 창고
	
	// 다형성: 부모타입 레퍼런스 하나로 다양한 자식객체를 담을 수 있음.
	
	// 부모: Electronic
	// 자식: Desktop, NoteBook, Tablet
	Electronic[] elec = new Electronic[3];
	int count = 0;
	
	// insert 함수 구현
	// 매개변수 -> Desktop, NoteBook, Tablet 전부 다 받을 수 있는 Electronic으로 생성
	public void insert(Electronic any) {
		elec[count++] = any; 
		// elec[0] = 데땁 => count = 1
		// elec[1] = 노트북 => count = 2
		// elec[2] = 태블릿 => count = 3
	}
	
	// select 함수 구현
	public Electronic select(int index) {
		return elec[index];
	}
}

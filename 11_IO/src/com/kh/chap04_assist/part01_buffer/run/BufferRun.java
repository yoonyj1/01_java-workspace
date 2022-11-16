package com.kh.chap04_assist.part01_buffer.run;

import com.kh.chap04_assist.part01_buffer.model.dao.BufferDao;

public class BufferRun { // 클래스 시작

	public static void main(String[] args) { // main 시작
		BufferDao dao = new BufferDao();
		
		dao.fileSave();
		
	} // main 끝
	
} // 클래스 끝

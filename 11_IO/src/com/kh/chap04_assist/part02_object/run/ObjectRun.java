package com.kh.chap04_assist.part02_object.run;

import com.kh.chap04_assist.part02_object.model.dao.ObjectDao;

public class ObjectRun { // 클래스 시작

	public static void main(String[] args) { // main 시작

		ObjectDao dao = new ObjectDao();
		//dao.fileSave();
		dao.fileRead();
	} // main 끝

} // 클래스 끝

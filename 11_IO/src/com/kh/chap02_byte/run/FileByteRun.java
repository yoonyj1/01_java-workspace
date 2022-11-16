package com.kh.chap02_byte.run;

import com.kh.chap02_byte.model.dao.FileByteDao;

public class FileByteRun { // 클래스 시작

	public static void main(String[] args) { // main 시작

		FileByteDao dao = new FileByteDao();
		//dao.fileSave();
		dao.fileRead();
	} // main 끝

} // 클래스 끝

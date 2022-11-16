package com.kh.chap03_char.model.dao;

import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {

	/*
	 * "문자 기반 스트림"을 가지고 입출력
	 * 
	 * - 문자 스트림: 데이터를 2byte단위로 전송하는 통로(넓은 통로)
	 * - 기반 스트림: 외부매체와 직접적으로 연결되는 통로
	 * 
	 * - XXXReader: 입력용 스트림
	 * - XXXWriter: 출력용 스트림
	 */
	
	// 프로그램 ---> 파일 (출력)
	public void fileSave() { // fileSave 시작
		// FileWriter: 파일로 데이터를 2바이트 단위로 출력할 수 있는 스트림
		FileWriter fw = null;
		
		try {
			// 1. FileWriter 객체 생성
			fw = new FileWriter("b_char.txt"); // 해당 파일이 없으면 만들고 통로 연결 / 있으면 그냥 연결
			
			// 2. Write 메소드를 이용해서 데이터 출력
			//	 2바이트 단위로 데이터 전송
			
			fw.write("와 io...");
			fw.write(' ');
			fw.write('A');
			fw.write("\n");

			char[] arr = { 'a', 'p', 'p', 'l', 'e' };
			fw.write(arr);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 3. 스트림 반납
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	} // fileSave 메소드 끝
	
} // 클래스 끝

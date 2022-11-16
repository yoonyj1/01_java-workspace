package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// dao(Data Access Object)

public class FileByteDao { // 클래스 시작
	
	/*
	 * "바이트 기반 스트림" 가지고 데이터 입출력 해보기
	 * 
	 *  - 바이트 스트림: 데이터를 1byte 단위로 전송하는 통로 (좁은통로 / 1byte면 한글이 깨짐)
	 *  - 기반 스트림: 외부매체와 직접적으로 연결되는 통로
	 *  
	 *  XXXInputStream: (XXX: 외부매체 이름) XXX 매체로부터 데이터를 입력받는 통로(외부매체로부터 데이터를 읽어오겠음)
	 *  XXXOutputStream: XXX 매체로부터 데이터를 출력하는 통로(외부매체로부터 데이터를 내보내겠음/쓰겠음)
	 */

	// 프로그램(자바 or 메모리) --> 외부매체(파일) (출력: 프로그램 상의 데이터를 파일로 내보내기, 즉 파일로 저장)
	public void fileSave() { // fileSave 메소드 시작
		
		// FileOutputStream: 파일과 직접적으로 연결해서 1바이트 단위로 출력하는 스트림
		
		// 1. 스트림 생성 (통로 만들기)
		// 2. 스트림으로 데이터 출력 (메소드 활용)
		// 3. 다 사용한 후 스트림 반납 (필수)
		
		// 1. FileOutputStream 객체 생성 => 해당 파일과의 연결 통로가 만들어짐
		FileOutputStream fout = null; // 해당 파일이 없으면 새로 만들어주고 통로연결 / 있으면 통로연결
		
		try {
			fout = new FileOutputStream("a_byte.txt");
			// 2. 파일에 데이터를 출력하고자 할 때 write 메소드 사용
			//    숫자를 출력하든 문자를 출력하든 파일에 기록되는 것은 문자로 기록됨(아스키코드)
			fout.write(97); // 'a'가 저장됨
			fout.write('b'); // 'b'가 저장됨
			fout.write('가'); // 한글은 2byte여서 깨져서 저장됨 => 바이트 스트림으로는 제한이 있음
			
			byte[] arr = { 99, 100, 101 }; 
			fout.write(arr); // c, d, e 문자가 저장
			
			// fout.write(b, off, len);
			fout.write(arr, 1, 2); // d, e가 저장
			
			// 3. 스트림 다 이용했으면 반납하기(필수)
			// fout.close(); // 위에서 write() 실행 시 IOException 발생했을 경우 => catch블럭 실행 후 빠져나갈 것임 (반납코드가 실행이 안됨)
							 // 반드시 실행해야하는 구문 finally{}에 기술
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 이 안에 작성된 코드는 어떤 예외가 발생했던간에 마지막에 무조건 실행하고 빠져나감.
			try{
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	} // fileSave 메소드 끝
	
	// 프로그램 <--- 파일 (입력: 파일로부터 데이터 가져오기)
	public void fileRead() { // fileRead 메소드 시작
		// FileInputStream: 파일로부터 데이터를 1바이트 단위로 입력을 받는 스트림
		
		// 1. 스트림 생성(통로 만들기)
		// 2. 스트림 통해서 입력 받기(메소드 활용)
		// 3. 사용 끝난 스트림 반납(필수)
		
		FileInputStream fin = null;
		
		try {
			// 1. FileInputStream 객체 생성 => 해당파일과 연결통로 만듦
			fin = new FileInputStream("a_byte.txt");
			
			// 2. 파일로부터 데이터를 읽어들이기 => read()
			// 1바이트 단위로 하나씩 읽어옴 / 반환형이 int여서 숫자로 읽어들임
			System.out.println(fin.read()); // a
			System.out.println(fin.read()); // b
			System.out.println(fin.read()); //  
			System.out.println(fin.read()); // c
			System.out.println(fin.read()); // d
			System.out.println(fin.read()); // e
			System.out.println(fin.read()); // d
			System.out.println(fin.read()); // e
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	} // fileRead 끝
} // 클래스 끝

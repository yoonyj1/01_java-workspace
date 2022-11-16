package com.kh.chap04_assist.part01_buffer.model.dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDao {

	/*
	 * 보조스트림: 기반스트림만으로 부족했던 성능을 보다 향상 시켜주는 스트림
	 *			기반스트림에서 제공하지 않는 추가적인 메소드 제공 / 데이터 전송 속도를 향상 시킴 + a
	 *			>> 외부매체와 직접적으로 연결되는 스트림은 아님
	 *				단독 사용이 불가능(반드시 기반스트림과 함께 사용)
	 */
	
	// 프로그램 ---> 파일(출력)
	public void fileSave() { // fileSave() 메소드 시작
		// FileWriter 기반 스트림 가지고 하기(기반스트림 필수)
		// 파일과 직접적으로 연결해서 2byte 단위로 출력할 수 있는 스트림
		
		// 보조스트림 BufferedWriter: 버퍼라는 공간을 제공해주는 보조스트림(속도향상): 기반스트림과 이름 맞춰야함. (Writer)
		// BufferedWriter bw = new BufferedWriter("c_buffer.txt"); // 단독 사용 불가능
		
		/*
		// 1. 보조스트림을 사용하려면 기반스트림을 먼저 생성해야함.
		FileWriter fw = new FileWriter("c_buffer.txt");
		
		// 2. 보조스트림 생성시 기반스트림 객체를 전달하면서 생성
		BufferedWriter bw = new BufferedWriter(fw);
		*/

		// 위의 두줄을 한줄로 작성하는 방법
		
		/*
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			
			// write 메소드 이용해서 데이터 출력
			bw.write("ㅎㅇ\n");
			bw.write("ㅎㅇㅎㅇ");
			bw.newLine(); // 추가적인 메소드 활용 가능 => 개행시켜주는 메소드
			bw.write("ㅂㅇ");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		// try-with-resource문으로 자원반납까지 간단하게 작업할 수 있음
		// jdk7버전 이상
		
		/* 기존구문
		 * try{
		 * 
		 * } catch (예외클래스) {
		 * 
		 * }
		 */
		/* try-with-resource문
		 * try(try블럭 내에서 사용할 스트림 객체 생성 구문) {
		 * 
		 * 
		 * } catch (예외클래스) {
		 * 
		 * 
		 * }
		 */
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))) {
			// write 메소드 이용해서 데이터 출력
			bw.write("ㅎㅇ\n");
			bw.write("ㅎㅇㅎㅇ");
			bw.newLine();
			bw.write("ㅂㅇㅂㅇ");
			// 버퍼라는 공간에 쌓아놨다가 한번에 출력 => 속도향상
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	} // fileSave() 끝
}

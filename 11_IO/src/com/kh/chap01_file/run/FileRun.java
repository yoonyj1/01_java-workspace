package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) { // main 시작

		// 메모리는 휘발성
		// 가나다라 쓰고 컴퓨터를 끄면 지워짐 => 휘발성
		// 기록하기 위해 파일이 필요함
		
		// 간단하게 파일(file)이 만들어지는 과정
		// java.io.File 클래스 가지고 만듦
		// 예외처리 필수
		
		// File f1 = new File(); 기본생성자가 없음
		
		
		try {
			// 1. 경로지정을 하지 않은 상태로 파일 생성 => 현재 project 폴더에 파일 생성
			File f1 = new File("test.txt"); // test라는 이름의 txt파일 생성
			f1.createNewFile(); // 메소드까지 실행해야만 실제 파일이 만들어짐
			
			// 2. 존재하는 폴더에 파일을 생성하는 방법 => 해당 경로까지 지정
			File f2 = new File("D:\\test.txt");
			f2.createNewFile();
			
			// 3. 폴더 먼저 만들고 파일까지 만들어지게 하기
			// 폴더 만들기
			File tempFolder = new File("D:\\temp");
			tempFolder.mkdir();
			
			// 이름 f3 => test.txt D드라이브 아래 temp폴더안에
			File f3 = new File("D:\\temp\\test.txt");
			f3.createNewFile();
			
			// 실행할 때마다 같은 파일이 만들어지는 것이 아니고 해당 파일이 존재하지 않으면 만들고 존재하면 덮어쓰기(수정사항이 없는 경우 그대로)
			
			System.out.println(f1.exists()); // f1이 있는지 확인하는 메소드 (boolean형 반환)
			System.out.println(new File("ttt.txt").exists()); // false 반환
			
			System.out.println(f1.isFile()); // f1이 file인지 확인하는 메소드
			System.out.println(tempFolder.isFile());
			
			//=======================================================================================================
			File folder = new File("parent");
			folder.mkdir();
			
			File file = new File("parent\\person.txt");
			file.createNewFile();
			
			System.out.println("파일명: " + file.getName()); // 파일명 불러오는 메소드
			System.out.println("절대경로: " + file.getAbsolutePath()); // 절대경로(파일이 실제로 저장되어 있는 위치) 불러오는 메소드
			System.out.println("파일용량: " + file.length()); // 파일용량을 불러오는 메소드: 아무것도 없으면 0
			System.out.println("상위폴더: " + file.getParent()); // 파일의 상위폴더를 알려주는 메소드
			
					
		} catch (IOException e) {
			e.printStackTrace();
		} 		
		
		System.out.println("프로그램을 종료합니다.");
		
	} // main 끝

	/*
	 * 프로그램 상에 데이터를 외부매체로 출력을 하거나 외부매체로부터 입력을 받을것임
	 * 반드시 외부매체와 통하는 통로를 만들어야함. = 스트림
	 * 
	 * 스트림(통로)의 특징
	 *  - 한 방향 흐름(단방향)
	 *  	=> 입력이면 입력 / 출력이면 출력만 가능함
	 *  	=> 입력과 출력을 동시에 하고자하면 입력용 스트림 / 출력용 스트림을 따로 만들어야함
	 *  - 선입선출: 먼저 들어간 데이터가 먼저 나옴 / 통로가 파이프같은 개념
	 *  	(FIFO: First In First Out)
	 *  - 시간지연(delay)이라는 문제 생길 수 있음
	 *  
	 * * 스트림의 구분
	 *  > 통로의 사이즈 (1byte / 2byte)
	 *   - 바이트 스트림: 1byte짜리만 왔다갔다 할 수 있을 정도의 사이즈(좁은 통로)		=> 입력(InputStream) / 출력(OutputStream)
	 *   - 문자 스트림: 2byte짜리도 왔다갔다 할 수 있을 정도의 사이즈(넓은 통로)			=> 입력(Reader) / 출력(Writer)
	 *   
	 *  > 외부매체 직접 연결 유무
	 *   - 기반스트림: 외부매체와 직접적으로 연결이 되는 통로(필수)
	 *   - 보조스트림: 말 그대로 보조의 역할만 하는 통로(속도를 빠르게 하거나, 그 외의 유용한 기능을 제공)
	 *   			보조스트림 단독으로는 사용이 불가 / 기반스트림은 반드시 기본적으로 있어야함. 
	 *   
	 * 우리는 외부매체를 파일로 구현
	 * 첨부파일 기능 구현할 때 필요한 개념 
	 */
	
}

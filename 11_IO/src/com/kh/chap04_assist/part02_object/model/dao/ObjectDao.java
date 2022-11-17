package com.kh.chap04_assist.part02_object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectDao { // 클래스 시작

	// 프로그램 ---> 파일 (출력)
	// 파일은 우리가 보려고 만든다기 보다는 나중에 읽어오기 위해 만드는 것임
	public void fileSave() { // fileSave 시작
		// 출력할 데이터 (Phone 객체)
		Phone ph1 = new Phone("아이폰", 1300000);
		Phone ph2 = new Phone("갤럭시", 1200000);
		Phone ph3 = new Phone("플립", 1500000);
		
		// 객체단위로 출력해줄 수 있는 보조스트림 필요
		
		// ObjectXXX => Writer, Reader 없음
		
		// FileOutputStream: 파일과 연결해서 1바이트 단위로 출력할 수 있는 기반스트림
		// ObjectOutputStream: 객체 단위로 출력할 수 있도록 도움을 주는 보조스트림(ObjectWriter 없음)
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_phone.txt"))) {
			
			oos.writeObject(ph1);
			oos.writeObject(ph2);
			oos.writeObject(ph3);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	} // fileSave 끝
	
	public void fileRead() { // fileRead() 시작
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_phone.txt"))) {
			/*
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			
			System.out.println(ois.readObject());
			*/
			
			while (true) {
				System.out.println(ois.readObject());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) { // EOFException: 파일의 끝을 만나는 순간 발생하는 예외 (EOF: End Of File)
			System.out.println("파일을 다 읽어들였습니다.");
			//e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	} // fileRead() 끝
	
} // 클래스 끝

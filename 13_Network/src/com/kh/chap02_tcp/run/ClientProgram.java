package com.kh.chap02_tcp.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientProgram {

	// 클라이언트용 프로그램
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		Socket socket = null;
		
		// 요청하고자 하는 서버: 192.168.30.192
		// 포트번호: 3000
		int port = 3000;
		
		
		// 1. 서버의 IP주소와 서버가 정한 포트번호를 매개변수로 하여 클라이언트용 소켓 객체 생성 = 서버에 연결요청 보내는 구문
		try {
			String serverIP = "192.168.30.193";
			socket = new Socket(serverIP, port);
			// 서버 꺼져있거나 못찾으면 (통신실패) null
			if (socket != null) { // 서버와 잘 연결됐을 경우
				System.out.println("서버와 연결성공");
		// 2. 서버와의 입출력 스트림 오픈
		// 3. 보조 스트림을 통해 성능 개선
			// 입력용 스트림
				br =new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
			// 출력용 스트림
				pw = new PrintWriter(socket.getOutputStream());
				
		// 4. 스트림을 통해 읽고 쓰기
				while (true) {
					System.out.print("서버에게 보낼 내용: ");
					String sendMessage = sc.nextLine();
					
					pw.println(sendMessage);
					pw.flush();
					
					String message = br.readLine(); // 한 줄 단위로 읽어들일 수 있는 보조스트림
					System.out.println("서버로부터 전달받은 메시지: " + message);
				}
			}
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		// 5. 통신 종료
			try {
				pw.close();
				br.close();
				
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		

	}

}

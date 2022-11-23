package com.kh.chap02_tcp.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class ServerProgram {

	/*
	 * TCP(Transmission Control Protocol)
	 *  - 서버와 클라이언트 간의 1:1 소켓 통신
	 *  - 데이터를 고안하기 앞서 서버, 클라이언트가 연결되어 있어야됨(서버가 먼저 실행되어 클라이언트의 요청 기다림)
	 *  
	 * * 소켓(Socket)
	 *  - 프로세스 간 통신을 담당
	 *  - Input / OutputStream을 가지고 있음(이 스트림을 통해 입출력이 이루어짐)
	 *  
	 * * Server Socket
	 *  - 포트와 연결되어(Bind) 외부의 연결요청을 기다리다 연결요청이 들어오면 수락해줄 용도
	 *  - 수락 => 통신할 수 있는 Socket 생성(Client Socket)
	 */
	
	// 서버용 프로그램
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 보조스트림
		BufferedReader br = null; // 입력 보조스트림
		PrintWriter pw = null; // 출력 보조스트림
		
		// 1. 서버의 포트번호 정함
		int port = 3000;
		ServerSocket server = null;
		// 2. 서버용 소켓 객체 생성
		try {
			// 생성 시 포트 결합(bind) (ServerSocket: 클라이언트의 연결요청을 받아줄 용도의 소켓)
			server = new ServerSocket(port);
			
		// 3. 클라이언트 쪽에서 접속 요청이 오길 기다림
			System.out.println("클라이언트의 요청을 기다리고 있음");
			
		// 4. 접속 요청이 오면 요청 수락 후 해당 클라이언트와 통신할 수 있는 서버측 소켓 객체 생성
			Socket socket = server.accept(); // socket == 클라이언트와 통신 할 수 있는 소켓 객체
			System.out.println(socket.getInetAddress().getHostAddress() + " 클라이언트가 연결을 요청했음");
			
		// 5. 연결된 클라이언트와 입출력 스트림 생성(바이트스트림 => 1바이트 짜리) => 성능이 별로 안좋음
		// 6. 보조 스트림을 통해 성능 개선
			// 클라이언트로부터 전달된 값을 한 줄 단위로 읽어들이기 위한 입력용 스트림
			// 입력용 스트림 => 1바이트짜리 바이트스트림 => 문자스트림으로 변경해줌 => 성능 더 좋게 보조스트림 끼기
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			// 출력용 스트림(클라이언트에게 한 줄 단위로 출력할 수 있는 출력용 스트림)
			pw = new PrintWriter(socket.getOutputStream());
			// PrintWriter: 데이터 출력 시 print(), println() 메소드 가지고 있는 보조스트림
			
		// 7. 스트림을 통해 읽고 쓰기
			while (true) {
				// 클라이언트로부터 전달 된 메시지가 있을 경우 서버측 읽어들일것임 (입력)
				String message = br.readLine();
				
				System.out.println("클라이언트로부터 전달 받은 메시지: " + message);
				
				// 반대로 클라이언트에게 데이터 전달
				System.out.print("클라이언트에게 보낼 내용: ");
				String sendMessage = sc.nextLine();
				
				pw.println(sendMessage); // 클라이언트에게 출력
				pw.flush(); // 현재 스트림에 있는 데이터를 강제로 내보내는 메소드
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 8. 통신 종료
			try {
				// 반납***
				pw.close();
				br.close();
				
				server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}

package com.kh.chap02_tcp.run;

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
	
	public static void main(String[] args) {

	}

}

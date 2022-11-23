package com.kh.chap01_inet.run;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetRun {

	public static void main(String[] args) {

		/*
		 * * 네트워크(Network): 여러 대의 컴퓨터들이 연결되어있는 통신망 같은 것
		 * 					=> 네트워크를 통해 서로간의 데이터 교환 가능
		 * 
		 * * IP 주소: 네트워크 상에 각 컴퓨터들을 식별해줄 수 있는 번호(컴퓨터 주민번호)  
		 * 
		 * * 서버와 클라이언트
		 *  > 서버: 클라이언트(고객)에게 서비스를 제공해주는 프로그램(클라이언트의 요청을 처리해서 응답) 
		 *  > 클라이언트: 서버에 요청하는 컴퓨터(서비스를 제공받는 고객)
		 *  
		 *  - 서버에 요청하기 위해서는 그 요청하고자 하는 서버의 IP 주소(또는 도메인명), 포트번호 알아야됨.
		 */
		
		// InetAddress: 네트워크 정보(IP주소 관련)를 확인할 수 있는 클래스
		
		try {
			InetAddress localHost = InetAddress.getLocalHost(); // 내 PC(지역호스트)에 대한 정보를 반환
			System.out.println(localHost); // 내 PC명 / 내 IP주소 / DESKTOP-V0FQLUA/192.168.30.192 출력
			
			System.out.println("내 PC명: " + localHost.getHostName()); // 내 PC명: DESKTOP-V0FQLUA 출력 / 호스트의 이름을 반환
			System.out.println("내 IP 주소: " + localHost.getHostAddress()); // 내 IP 주소: 192.168.30.192 출력 / 호스트의 IP 주소를 반환
			
			System.out.println("=================================================================================================");
			
			// 내가 알고있는 도메인명을 통해서 그 서버 관련된 정보 얻기
			InetAddress googleHost = InetAddress.getByName("www.google.com"); // 도메인명을 통해서 해당 호스트에 대한 정보를 반환
			System.out.println("구글 서버명: " + googleHost.getHostName());
			System.out.println("구글 IP 주소: " + googleHost.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}

}

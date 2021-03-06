package ch14;

import java.net.InetAddress;

public class InetAddressEx1 {
	public static void main(String[] args) {
		//java.net,java.io 대부분의 클래스 및 메소드는 예외처리 해야한다.
		try {
			//도메인으로 ip 출력하는 클래스
			InetAddress add = InetAddress.getLocalHost();
			System.out.println("로컬컴퓨터이름 : " + add.getHostName());
			System.out.println("로컬컴퓨터ip : " + add.getHostAddress());
			add = InetAddress.getByName("auction.co.kr");
			System.out.println("옥션 : " + add.getHostAddress());
			InetAddress adds[] = InetAddress.getAllByName("naver.com");
			//배열 밑에 항상 for문이 있다.
			System.out.println("-------------");
			System.out.println("네이버");
			for (int i = 0; i < adds.length; i++) {
				System.out.println(adds[i]);
			}
		} catch (Exception e) {
			// 예외의 히스토리까지 출력되는 메소드
			e.printStackTrace();
		}
	}
}

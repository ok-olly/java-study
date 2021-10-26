package application;

import java.util.Scanner;

public class CheckPassLimit {

	public static void main(String[] args) {
		// 비밀번호 3회 체크
		
		final String USER_PASSWORD = "hello";
		
		Scanner scanner = new Scanner(System.in);
		
		boolean accessOK = false; //플래그(flag):불린변수로 상태에 따라 처리흐름 제어
		
		String password = "";
		
		for (int i=1; i<=3; i++) {
			System.out.print("Enter password > ");
			password = scanner.nextLine();
			
			if (password.equals(USER_PASSWORD)) {
				System.out.println("접속승인");
				accessOK = true;
				break;
			} else {
				System.out.println("비번이 틀렸습니다.");
			}
		}
		
		scanner.close();
		
		if(!accessOK) {
			System.out.println("접속거부");
		}
		

	}

}

package application;

import java.util.Scanner;

public class CheckPassLimit {

	public static void main(String[] args) {
		// ��й�ȣ 3ȸ üũ
		
		final String USER_PASSWORD = "hello";
		
		Scanner scanner = new Scanner(System.in);
		
		boolean accessOK = false; //�÷���(flag):�Ҹ������� ���¿� ���� ó���帧 ����
		
		String password = "";
		
		for (int i=1; i<=3; i++) {
			System.out.print("Enter password > ");
			password = scanner.nextLine();
			
			if (password.equals(USER_PASSWORD)) {
				System.out.println("���ӽ���");
				accessOK = true;
				break;
			} else {
				System.out.println("����� Ʋ�Ƚ��ϴ�.");
			}
		}
		
		scanner.close();
		
		if(!accessOK) {
			System.out.println("���Ӱź�");
		}
		

	}

}

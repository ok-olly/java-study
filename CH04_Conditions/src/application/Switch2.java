package application;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //��ĳ�� ����
		
		System.out.print("��� �����ϰڽ��ϱ�? (y/n): ");
		String input = scanner.nextLine(); //��ĳ�� ���ڿ� �Է�
		scanner.close();
		
		switch(input) {
		case "y":
			System.out.println("�����մϴ�...");
			break;
		case "n":
			System.out.println("�����մϴ�.");
			break;
		default:
			System.out.println("�߸��� �Է��Դϴ�.");
		}

	}

}

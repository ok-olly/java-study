package application;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// IF ��
		Scanner scanner = new Scanner(System.in); //��ĳ�� ����
		
		System.out.print("����� ������? ");
		int apples = scanner.nextInt();
		
		System.out.print("�ٳ����� ������? ");
		int bananas = scanner.nextInt();
		
		scanner.close(); // ��ĳ�� ��� �� �ݱ�
				
		if(apples > bananas) {
			System.out.println("����� �ٳ������� ����");
		}
		
		if(apples < bananas) {
			System.out.println("�ٳ����� ������� ����");
		}
		
		System.out.println("���α׷� ����.");

	}

}

package application;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// �Է��� �޴� Ŭ���� scanner �̿�
		Scanner scanner = new Scanner(System.in); //��ĳ�ʸ� ����� �� �ְ� ����
		System.out.print("�µ��� �Է����ּ��� : ");
		double c = scanner.nextDouble(); //��ĳ�� ��ü�� nextInt() �޼ҵ�� �������� �Է�
		double f = (c * 9/5) + 32; //ȭ��
		
		System.out.println("���� "+c+"�� ȭ�� "+f+"�̴�.");
		
	}

}

package application;

class Person {
	String name;
}


public class ClassObject {

	public static void main(String[] args) {
		// Ŭ������ ���赵�� ���� ��밡���� ��ü�� ������
		Person p1 = new Person(); //���� ��ü�� ����
		p1.name = "���";
		
		Person p2 = new Person(); //���� ��ü�� ����
		p2.name = "�浿";
		
		System.out.println(p1.name);
		System.out.println(p2.name);

	}

}

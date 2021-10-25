package static_innerClass;

public class Person {
	class Head { //����Ŭ���� Head
		public void print() {
			System.out.println("���");
		}
	}
	
	static class Body { //����ƽ ���� Ŭ���� Body
		public void print() {
			System.out.println("�ٵ�");
		}
	}
	
	public void print() { //Ŭ���� Person�� �޼ҵ�
		Head head = new Head(); // ��� ��ü
		Body body = new Body(); // �ٵ� ��ü
		
		head.print();
		body.print();
	}
}

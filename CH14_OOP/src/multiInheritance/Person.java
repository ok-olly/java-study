package multiInheritance;

public class Person implements Speaker, Greeter {
	//interface�� ����(���� ��)���� ����, ���(extends)�� �ϳ��� ����
	@Override
	public void greet() {
		System.out.println("ȯ���մϴ�.");
	}

	@Override
	public void speak() {
		System.out.println("���� Person�Դϴ�.");
		
	}

}

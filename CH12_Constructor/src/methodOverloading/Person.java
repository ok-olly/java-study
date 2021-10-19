package methodOverloading;

public class Person {
	//�޼ҵ� �����ε� => �޼ҵ��� �̸��� ������ �Ű�����(parameter)�� �ٸ� ��
	public void greet() {
		System.out.println("Hello!");
	}
	
	public void greet(String name) {
		System.out.println("Hello! "+name);
	}
	
	public void greet(int height) {
		if(height > 185) {
			System.out.println("Ű�� ũ����");
		}
		System.out.println("Hello! ");
	}
	
	public void greet(String name, int height) {
		if(height > 185) {
			System.out.println("Ű�� ũ����");
		}
		System.out.println("Hello! "+name);
	}	
}

package inheritance;

public class App {
	public static void main(String[] args) {
		// ���� ������ ��ӹ���
		Animal ani1 = new Animal();
		ani1.eat();
		
		Bird bird1 = new Bird();
		bird1.eat(); //��ӹ��� ������ �޼ҵ�
		bird1.fly();

	}

}

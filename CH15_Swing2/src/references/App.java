package references;

public class App {

	public static void main(String[] args) {
		//���۷���(����, �ּҰ�) ����
		Person p1 = new Person(); //p1�� ��ü�� ������ ��ġ �� �ּҰ��� ������.
		
		System.out.println(p1); //��ü�� �ּҸ� ���
		
		Person p2 = p1; //p2�� p1�� �� �� �ּҰ��� �ѱ�
		
		System.out.println(p2);
		
		Person p3 = new Person();
		
		System.out.println(p3);
		
		test(p2);
		
		
	}

	private static void test(Person person) {
		System.out.println(person);
		
	}

}

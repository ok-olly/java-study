package instanceVariable;

public class App {

	public static void main(String[] args) {
		// ���� ��Ű���� Person Ŭ������ �ٷ� �ҷ��ͼ� ��밡��
		Person p1 = new Person();
		p1.name = "���";
		p1.age = 7;
		Person p2 = new Person();
		p2.name = "�浿";
		p2.age = 17;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p2.name);
		System.out.println(p2.age);
		

	}

}

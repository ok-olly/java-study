package getterSetter;

public class App {

	public static void main(String[] args) {
		// ���������� private�� ���� Ŭ���������� ���ٰ���
		Person p1 = new Person();
		//p1.name = "���";
		//p1.age
		p1.setName("���");
		p1.setAge(7);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		

	}

}

package defaultConstructor;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		System.out.println("����Ʈ �����ڷ� ������");
		name = "��";
		age = 0;
	}
	
	public Person(String name) {
		System.out.println("person ������");
		this.name = name;
		age = 0;
	}
	
	public Person(String name, int age) {
		System.out.println("person ������");
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}

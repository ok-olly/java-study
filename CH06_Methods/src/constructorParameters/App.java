package constructorParameters;

public class App {

	public static void main(String[] args) {
		
		Person p1 = new Person("���", 120.0);
		Person p2 = new Person("�浿", 172.5);
		Person p3 = new Person("���̾�", 165.5);
		Person p4 = new Person();
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
	}

}

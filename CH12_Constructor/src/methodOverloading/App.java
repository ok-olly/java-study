package methodOverloading;

public class App {
	public static void main(String[] args) {
		Person person = new Person();
		
		person.greet();
		person.greet("���");
		person.greet(190);
		person.greet("���̾�", 170);
		
	}

}
